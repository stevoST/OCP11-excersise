package programmer1.chapter8.broaderexceptionsignature;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GalapagosTortoise extends Reptile{
    public void sleepInShell() throws FileNotFoundException{}
    public void hideInShell() throws IllegalArgumentException{}
//    public void exitShell() throws IOException{}
}
