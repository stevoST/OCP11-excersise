package programmer1.chapter8.overridegenerics.matchreturntype;

import java.util.ArrayList;
import java.util.List;

public class Goat extends Mammal {
//    public List<String> play() { //return type must match exactly also applies to generic type
//        return new ArrayList<>();
//    }

    public String sleep() { //return type is covariant
        return "sleep";
    }
}
