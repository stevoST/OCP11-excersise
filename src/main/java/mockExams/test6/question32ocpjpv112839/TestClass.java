package mockExams.test6.question32ocpjpv112839;

import java.io.FileNotFoundException;
import java.io.IOException;

class Great {
//    public void doStuff() throws FileNotFoundException {
    public void doStuff() throws IOException {
    }
}

class Amazing extends Great {
//    public void doStuff() throws IOException, IllegalArgumentException {
    public void doStuff() throws FileNotFoundException, IllegalArgumentException {
    }
}

public class TestClass {
    public static void main(String[] args) throws IOException {
        Great g = new Amazing();
        g.doStuff();
    }
}