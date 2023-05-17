package programmer2.chapter19io.io.closingStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClosingWrappedStreams {
    public static void main(String[] args) throws IOException {
        try(var fis = new FileOutputStream("test.txt");
        var bis = new BufferedOutputStream(fis);
        var ois = new ObjectOutputStream(bis)){
            ois.writeObject("hello");
        }
        try (var ois = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("test2.txt")
                ))){
                    ois.writeObject("Hi");
                }
    }
}
