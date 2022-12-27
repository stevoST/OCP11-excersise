package programmer2.chapter18concurrency.concurrencyApi.concurrentCollections;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ModifyIteratedCopyOnWriteSetCollectionAdd {
    //Page 880
    public static void main(String[] args) {
        Set<Character> favLetters = new CopyOnWriteArraySet<>(List.of('a', 't'));
        for (char c : favLetters) {
            System.out.print(c + " ");
            favLetters.add('s');
        }
        System.out.println();
        System.out.println("Size: " + favLetters.size());
    }
}
