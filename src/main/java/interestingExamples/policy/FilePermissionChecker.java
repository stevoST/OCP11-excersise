package interestingExamples.policy;

import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

public class FilePermissionChecker {
    public static void main(String[] args) {
        // set in VM options: -Djava.security.manager -Djava.security.policy=...\OCP11-excersise\src\main\java\interestingExamples\policy\custom.policy
        String filePath = "c:\\file.txt";

        // Use doPrivileged to check file permissions
        try {
            boolean hasPermission = AccessController.doPrivileged(new PrivilegedExceptionAction<Boolean>() {
                @Override
                public Boolean run() throws Exception {
                    // Check file permissions here
                    File file = new java.io.File(filePath);
                    if (file.exists() && file.canRead() && file.canWrite()) {
                        return true;
                    } else {
                        return false;
                    }
                }
            });

            if (hasPermission) {
                System.out.println("You have the necessary file permissions.");
            } else {
                System.out.println("You do not have the necessary file permissions.");
            }
        } catch (PrivilegedActionException e) {
            System.err.println("Exception while checking file permissions: " + e.getCause().getMessage());
        }
    }
}
