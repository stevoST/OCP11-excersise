package programmer2.chapter18concurrency.concurrencyApi.concurrentCollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ModifyIteratedCopyOnWriteListCollectionAdd {
    //Page 880
    public static void main(String[] args) {
        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
        for (var n : favNumbers) {
            System.out.print(n + " ");
            favNumbers.add(9);
        }
        System.out.println();
        System.out.println("Size: " + favNumbers.size());
    }
}
