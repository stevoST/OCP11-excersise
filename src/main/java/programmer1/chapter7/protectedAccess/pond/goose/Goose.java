package programmer1.chapter7.protectedAccess.pond.goose;

import programmer1.chapter7.protectedAccess.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim(){
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

//    public void floatInWater(){
//        System.out.println("test");
//    }

    public void helpOtherGooseSwim(){
        Bird other = new Goose();
//        other.floatInWater();
//        System.out.println(other.text);
    }
}
