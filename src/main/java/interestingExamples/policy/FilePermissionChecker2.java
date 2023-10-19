package interestingExamples.policy;

import java.io.File;
import java.io.FilePermission;
import java.security.*;

public class FilePermissionChecker2 {
    public static void main(String[] args) {
        // set in VM options: -Djava.security.manager -Djava.security.policy=...\OCP11-excersise\src\main\java\interestingExamples\policy\custom.policy
        String filePath = "c:\\file.txt";
        Permission perm = new FilePermission(filePath, "read,write");
//        Permission perm2 = new FilePermission(filePath, "read");
        PermissionCollection perms = perm.newPermissionCollection();

        perms.add(perm);
//        perms.add(perm2);

        // run without security check
//        File file = new java.io.File(filePath);
//        System.out.println("can write: " + file.canWrite());
//        System.out.println("can read: " + file.canRead());

        // Use doPrivileged to check file permissions
        boolean hasPermission = AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
            @Override
            public Boolean run() {
                // Check file permissions here
                File file = new File(filePath);
                if (file.exists() && file.canRead() && file.canWrite()) {
                    return true;
                } else {
                    return false;
                }
            }
        }, new AccessControlContext(
                new ProtectionDomain[]{
                        // this only resrcits from permisions you already have. if you have read write etc. and you put
                        // write into perms. you will have only write and not read.
                        new ProtectionDomain(null, perms)
                }
        ));

        if (hasPermission) {
            System.out.println("You have the necessary file permissions.");
        } else {
            System.out.println("You do not have the necessary file permissions.");
        }

    }
}
