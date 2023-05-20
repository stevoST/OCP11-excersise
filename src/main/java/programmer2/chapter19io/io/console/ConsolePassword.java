package programmer2.chapter19io.io.console;

import java.io.BufferedInputStream;
import java.io.Console;
import java.util.Arrays;

public class ConsolePassword {
    public static void main(String[] args) {

        //run in cmd from root directory java -cp target/classes programmer2.chapter19io.io.console.ConsolePassword
    Console console = System.console();
    while(console==null){

    }
    if(console == null){
        throw new RuntimeException("Console not available");
    } else {
        String name = console.readLine("Please enter your name: ");
        console.writer().format("Hi %s", name);
        console.writer().println();

        console.format("What is your address? ");
        String address = console.readLine();

        char[] password = console.readPassword("Enter a password "
        + "between %d and %d characters: ", 5,10);
        char[] verify = console.readPassword("Enter the password again: ");
        console.printf("Passwords "
        + (Arrays.equals(password, verify) ? "match": "do not match"));
    }

    }
}
