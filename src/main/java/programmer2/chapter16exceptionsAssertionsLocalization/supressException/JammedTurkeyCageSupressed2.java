package programmer2.chapter16exceptionsAssertionsLocalization.supressException;

public class JammedTurkeyCageSupressed2 implements AutoCloseable {
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
        }

    public static void main(String[] args) {
        try (JammedTurkeyCageSupressed2 t = new JammedTurkeyCageSupressed2()) {
            throw new RuntimeException("Turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
