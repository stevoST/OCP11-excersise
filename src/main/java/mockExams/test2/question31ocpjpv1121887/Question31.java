package mockExams.test2.question31ocpjpv1121887;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question31 {
    public static void main(String[] args) {
        try {
            Stream<Path> s = null;
            s = Files.list(Paths.get("c:\\tools\\")); // works but shows list of directory
//            s = Files.list(Paths.get("c:\\tools\\hsqldb-2.7.2.zip")); // does not work. mus be directory
            s = Files.find(Paths.get("c:\\tools\\hsqldb-2.7.2.zip"), Integer.MAX_VALUE,
                    (p, a) -> p.endsWith("hsqldb-2.7.2.zip") && a.isRegularFile()); // works
//            s = Files.find(Paths.get("c:\\tools\\"), Integer.MAX_VALUE,
//                    (p, a) -> p.endsWith("hsqldb-2.7.2.zip") && a.isRegularFile()); // works
            List<Path> files = Files.walk(Paths.get("c:\\tools\\"))
                    .filter(path -> path.getFileName().toString().equals("hsqldb-2.7.2.zip"))
                    .collect(Collectors.toList()); // works
            s.forEach(System.out::println);
            files.forEach(System.out::println);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
