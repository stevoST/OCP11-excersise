package programmer2.chapter16exceptionsAssertionsLocalization.questions.question3;

import java.io.Closeable;

public class EntertainmentCenter {
    static class TV implements AutoCloseable {

        public void close() {
            System.out.println("D");
        }
    }

    static class MediaStreamer implements Closeable{
        public void close() {
            System.out.println("W");
        }
    }

    public static void main(String[] args) {
        var w = new MediaStreamer();
        try(
            TV d = new TV();
            w;
        )
        {
            System.out.println("T");
        }
         catch (Exception e) {
            System.out.println("E");
        }
        finally {
            System.out.println("F");
        }
    }
}
