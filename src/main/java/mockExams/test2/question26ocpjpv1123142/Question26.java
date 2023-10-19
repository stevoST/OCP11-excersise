package mockExams.test2.question26ocpjpv1123142;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Question26 {
    public static void main(String[] args) {
        FileInputStream tempFis = null;
        try (FileInputStream fis = new FileInputStream("c:\\temp\\test.text")) {
            System.out.println(fis);
            tempFis = fis;
        }
        //line 1
        catch (IOException ioe) {
        }
//        catch(IOException | FileNotFoundException e){ }
    }
}
