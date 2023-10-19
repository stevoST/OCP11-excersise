package mockExams.test2.question48ocpjpv1123638;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.List;

public class Question48 {

    private UserManager userManager;
    public Void setApprovedUsers(final List<String> userids) {
        return AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
            this.userManager.setApprovedUsers(userids);
            return null;
        });
    }
}


class UserManager {
    List<String> userids;

    public void setApprovedUsers(List<String> userids) {
        this.userids = userids;
    }
}
