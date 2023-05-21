package programmer2.chapter19io.io.serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SerializeDeserializeProcess {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();
        chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
        chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
        File dataFile = new File("chimpanzee.txt");

        SaveReadFile.saveToFile(chimpanzees, dataFile);
        var chimpanzeesFromDisk = SaveReadFile.readFromFile(dataFile);
        System.out.println(chimpanzeesFromDisk);
    }
}
