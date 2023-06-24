package programmer2.chapter20nio2.questions.question13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Question13 {
    public static void main(String[] args) throws IOException {
        var p1 = Path.of(".","/","goal.txt");
        var p2 = Path.of("mule.png");
        Files.copy(p1,p2, StandardCopyOption.COPY_ATTRIBUTES);
        System.out.println(Files.isSameFile(p1,p2));
    }
}
