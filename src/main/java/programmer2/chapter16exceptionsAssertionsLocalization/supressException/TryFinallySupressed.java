package programmer2.chapter16exceptionsAssertionsLocalization.supressException;

public class TryFinallySupressed {
    public static void main(String[] args) {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new IllegalStateException("first");
        } finally {
            throw new RuntimeException("second");
        }
    }

}
