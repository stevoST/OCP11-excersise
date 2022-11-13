package programmer2.chapter14genericsandcollections.questions.question3;

import java.util.ArrayList;
import java.util.List;

public class IdeaTest {
    public static void main(String[] args) {
        System.out.println("test");
        List<String> strings = new ArrayList<>();
        strings.add("String");
//        list(strings);
        list2(strings);
    }

    public static void list(List<Object> objectList){

    }

    public static void list2(List<?> wildCard){
        wildCard.get(0);
    }


}
