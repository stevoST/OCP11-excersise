package programmer2.chapter20nio2.questions.question2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Question2 {
    public static void main(String[] args) {

    }

    public static void removeBadFile(Path path) throws IOException {
        if(Files.isDirectory(path)){
            System.out.println(Files.deleteIfExists(path) ? "Success" : "Try Again");
        }
    }
}
