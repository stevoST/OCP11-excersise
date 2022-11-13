package programmer2.chapter14genericsandcollections.genericsLowerWildcards;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");

        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);

        List<? super IOException> exceptions = new ArrayList<Exception>();
//        exceptions.add(new Exception());
//        exceptions.add(new Object());
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }

    public static void addSound(List<? super String> list){
        list.add("quack");
    }
}
