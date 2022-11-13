package programmer1.chapter8.overridegenerics.matchreturntype;

import java.util.ArrayList;

public class Monkey extends Mammal {
    public ArrayList<CharSequence> play(){return new ArrayList<>();} //override array list is subtype(covariant) of list
}
