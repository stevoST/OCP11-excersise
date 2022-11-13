package programmer2.chapter14genericsandcollections.genericsWildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void printList(List<?> list){
        //list.add("test"); // cant add because ? is immutable
    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
    }
}
