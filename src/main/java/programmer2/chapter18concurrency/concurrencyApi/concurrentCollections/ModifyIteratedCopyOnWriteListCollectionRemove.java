package programmer2.chapter18concurrency.concurrencyApi.concurrentCollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ModifyIteratedCopyOnWriteListCollectionRemove {
    public static void main(String[] args) {
        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
        for (var n : favNumbers) {
            favNumbers.remove(n);
        }
        System.out.println(favNumbers);
    }
}
