package programmer2.chapter19io.io.questions.question12;

import java.io.IOException;
import java.io.Writer;

public class Question12 {
    public static void main(String[] args) {
        String line;
        var c = System.console();
        Writer w = c.writer();
        try(w){
            if((line = c.readLine("Enter your name: ")) != null){
                w.append(line);
            }
            w.flush();
        } catch (IOException e) {
            throw new RuntimeException(e); // added
        }
    }
}
