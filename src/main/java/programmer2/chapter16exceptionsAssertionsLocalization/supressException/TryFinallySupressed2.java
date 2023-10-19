package programmer2.chapter16exceptionsAssertionsLocalization.supressException;

public class TryFinallySupressed2 {
    public static void main(String[] args) {
        try {
            try {
                throw new RuntimeException("first");
            } finally {
                throw new RuntimeException("second");
            }
        } catch (RuntimeException e) {
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Supressed: " + t.getMessage());
            }
        }
    }
}
