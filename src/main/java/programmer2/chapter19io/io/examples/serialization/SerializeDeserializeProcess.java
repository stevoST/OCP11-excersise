package programmer2.chapter19io.io.examples.serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SerializeDeserializeProcess {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();
        chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
        chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
//        File dataFile = new File("chimpanzee.txt");
//        System.out.println("parent directory: " + dataFile.getParent()); //prints null
//        System.out.println("absolute path: " + dataFile.getAbsolutePath()); //prints whole path
        File dataFile = new File("C:\\Users\\stse\\Dev\\OCP11-excersise\\chimpanzee.txt");
        System.out.println("parent directory: " + dataFile.getParent()); //prints whole path to root directory (OCP11-excersise)
        System.out.println("absolute path: " + dataFile.getAbsolutePath()); //prints whole path

        SaveReadFile.saveToFile(chimpanzees, dataFile);
        var chimpanzeesFromDisk = SaveReadFile.readFromFile(dataFile);
        System.out.println(chimpanzeesFromDisk);
    }
}
