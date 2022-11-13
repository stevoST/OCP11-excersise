package programmer2.chapter16exceptionsAssertionsLocalization.supressException;

public class JammedTurkeyCageSupressed implements AutoCloseable {
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
        }

    public static void main(String[] args) {
        try (JammedTurkeyCageSupressed t = new JammedTurkeyCageSupressed()) {
            throw new IllegalStateException("Turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
            for(Throwable t : e.getSuppressed()) {
                System.out.println("Supressed: " + t.getMessage());
            }
        }
    }
}
