package interestingExamples;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class PrivilegedActionExample {
    public static void main(String[] args) {
        // Create a PrivilegedAction to read a system property
        PrivilegedAction<String> action = () -> System.getProperty("user.home");

        // Execute the action with elevated privileges
        String userHome = AccessController.doPrivileged(action);

        // Print the result
        System.out.println("User home directory: " + userHome);
    }
}

