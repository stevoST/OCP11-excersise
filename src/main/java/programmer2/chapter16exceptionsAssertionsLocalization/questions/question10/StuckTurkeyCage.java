package programmer2.chapter16exceptionsAssertionsLocalization.questions.question10;

import java.io.*;

public class StuckTurkeyCage implements AutoCloseable {
    public void close() throws IOException {
        throw new FileNotFoundException("Cage not closed");
    }

    public static void main(String[] args) throws IOException {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }
}
