package programmer1.chapter8.overridesubtype;

public class Eagle extends Bird{
    public int fly(int height){
        System.out.println("Eagle is flying at " + height + " meters");
        return height;
    }

//    public short eat(int food){
//        System.out.println("Eagle is eating " + food + " units of food");
//        return food;
//    }


    @Override
    public Short eat(int food){
        System.out.println("Eagle is eating " + food + " units of food");
        return (short)food;
    }

    public static void main(String[] args) {
        Bird bird = new Eagle();
        bird.eat(1);
    }
}
