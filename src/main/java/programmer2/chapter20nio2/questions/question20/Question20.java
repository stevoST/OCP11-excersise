package programmer2.chapter20nio2.questions.question20;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question20 {
    public static void main(String[] args) {
        // original question
        final Path path = Paths.get(".").normalize();
        int count = 0;
        for(int i =0; i<path.getNameCount(); ++i){
            count++;
        }
        System.out.println(count);

        // testing
        final Path path2 = Paths.get(".").toAbsolutePath();
        int count2 = 0;
        for(int i =0; i<path2.getNameCount(); ++i){
            count2++;
        }
        System.out.println(count2);
    }
}
