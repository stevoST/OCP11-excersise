package programmer2.chapter19io.io.examples.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveReadFile {
    public static void saveToFile(List<Chimpanzee> chimpanzees, File dataFile) throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {
            for (Chimpanzee chimpanzee : chimpanzees) {
                out.writeObject(chimpanzee);
            }
        }
    }

    public static List<Chimpanzee> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true){
                var object = in.readObject();
                if (object instanceof Chimpanzee){
                    chimpanzees.add((Chimpanzee) object);
                }
            }
        } catch (EOFException e){
            System.err.println("end of file");
        }
        return chimpanzees;
    }
}
