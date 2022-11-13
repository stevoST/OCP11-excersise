package programmer1.chapter8.broaderexceptionsignature;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Reptile {
    protected void sleepInShell() throws IOException{}
    protected void hideInShell() throws NumberFormatException{}
    protected void exitShell() throws FileNotFoundException{}
}
