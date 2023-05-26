package programmer2.chapter19io.io.questions.question16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteToFile {

    // assume new-zoo.txt is not empty
    public static void main(String[] args) throws IOException {
        var o = new FileWriter("new-zoo.txt");
        try (var f = new FileReader("zoo-data.txt");
             var b = new BufferedReader(f); o) {
            o.write(b.readLine());
        }
        o.write("");
    }
}
