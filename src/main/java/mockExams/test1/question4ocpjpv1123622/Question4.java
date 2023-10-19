package mockExams.test1.question4ocpjpv1123622;

import java.io.File;
import java.security.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Question4 {

    public <R> List<R> executeFunction(Function<File, R> fun) {
        List<File> dir = new ArrayList<>();
        List<R> l = new ArrayList<R>();
        for (File f : dir) {
            Permission perm = new java.io.FilePermission(f.getPath(), "read");
            PermissionCollection perms = perm.newPermissionCollection();
            perms.add(perm);
            AccessController.doPrivileged(new PrivilegedAction<Void>() {

                public Void run() {
                    l.add(fun.apply(f));
                    return null;
                }
            }, new AccessControlContext(new ProtectionDomain[]{
                    new ProtectionDomain(null, perms)}));
        }

        return l;
    }
}
