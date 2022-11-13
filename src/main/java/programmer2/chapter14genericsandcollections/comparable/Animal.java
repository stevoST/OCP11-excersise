package programmer2.chapter14genericsandcollections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Animal implements Comparable<Animal> {
    private int id;

    @Override
    public int compareTo(Animal a) {
        int random = new Random().nextInt();
        System.out.println(random);
        return random*(id - a.id);
    }

    public String toString(){
        return String.valueOf(id);
    }

    public static void main(String[] args) {
        var a1 = new Animal();
        var a2 = new Animal();
        var a3 = new Animal();
        var a4 = new Animal();
        var a5 = new Animal();
        a1.id = 5;
        a2.id = 7;
        a3.id = 3;
        a4.id = 8;
        a5.id = 1;
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a1));
        System.out.println(a2.compareTo(a1));
        var animals = new ArrayList<Animal>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        animals.add(a5);
        Collections.sort(animals);
        System.out.println(animals);

    }
}
