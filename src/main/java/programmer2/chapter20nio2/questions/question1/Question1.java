package programmer2.chapter20nio2.questions.question1;

import java.nio.file.Path;

public class Question1 {
    public static void main(String[] args) {
        var path = Path.of("/user/./root", "../kodiacbear.txt");
        var path2 = path.normalize().relativize(Path.of("/lion"));
        System.out.println(path);
        System.out.println(path2);
    }
}
