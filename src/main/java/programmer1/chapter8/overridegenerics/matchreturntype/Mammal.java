package programmer1.chapter8.overridegenerics.matchreturntype;

import java.util.ArrayList;
import java.util.List;

public class Mammal {
    public List<CharSequence> play() {
        return new ArrayList<>();
    }

    public CharSequence sleep() {
        return "sleep";
    }
}
