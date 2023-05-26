package programmer2.chapter19io.io.examples.serialization;

import java.io.*;
import java.util.List;

public class SerializeList {

    void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException {

        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {
            for (Gorilla gorilla : gorillas){
                out.writeObject(gorilla);
            }
        }
    }
}
