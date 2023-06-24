package programmer2.chapter20nio2.questions.question3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class Question3 {
    public static void main(String[] args) throws IOException {
        var p = Paths.get("sloth.schedule");
        //original
        var a = Files.readAttributes(p, BasicFileAttributes.class);
        var v = Files.getFileAttributeView(p, BasicFileAttributeView.class);
        Files.createDirectories(p.resolve(".backup"));
        //original
        // Files.mkdir(p.resolve(".backup"));
        if(a.size()>0 && a.isDirectory()){
            //original
            //a.setTimes(null,null,null);
            v.setTimes(null,null,null);
        }
    }
}
