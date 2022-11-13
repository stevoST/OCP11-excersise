package programmer2.chapter14genericsandcollections.mapentryset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySet {
    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');

        Set<Map.Entry<Integer, Character>> set = map.entrySet();
        set.forEach((integerCharacterEntry -> System.out.println(integerCharacterEntry.getKey() + " " + integerCharacterEntry.getValue())));

        Map<Integer, Character> map2 = Map.ofEntries(
                Map.entry(4, 'd'),
                Map.entry(5, 'e'),
                Map.entry(6, 'f')
        );

        Set<Map.Entry<Integer, Character>> set2 = map2.entrySet();
        set2.forEach((integerCharacterEntry -> System.out.println(integerCharacterEntry.getKey() + " " + integerCharacterEntry.getValue())));

    }
}
