package programmer1.chapter5;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(list.toArray(new String[0]));
        list.clear();
        System.out.println(objectArray.length);
        System.out.println(stringArray.length);
    }
}
