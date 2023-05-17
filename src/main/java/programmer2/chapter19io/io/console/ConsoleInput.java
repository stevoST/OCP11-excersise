package programmer2.chapter19io.io.console;

import java.io.Console;

public class ConsoleInput {
    public static void main(String[] args) {
//        System.console().printf("test");

        Console console = System.console();
        if (console != null){
            String userInput = console.readLine();
            console.writer().println("You entered: " + userInput);
        } else {
            System.err.println("console is not available");
        }
    }
}
