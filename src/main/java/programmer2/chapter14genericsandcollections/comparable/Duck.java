package programmer2.chapter14genericsandcollections.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck>{
    private String name;

    public Duck(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }

    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks);
        System.out.println(ducks);
    }
}
