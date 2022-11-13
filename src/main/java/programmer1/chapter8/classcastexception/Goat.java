package programmer1.chapter8.classcastexception;


import programmer1.chapter8.overridegenerics.matchreturntype.Mammal;


public class Goat extends Mammal {

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Goat goat = (Goat) mammal;
    }
}

