package programmer1.chapter8.overridesubtype;

public class Bird {
    public void fly(){
        System.out.println("Bird is flying");
    }
//    public int eat(int food){
//        System.out.println("Birds is eating "+ food + " units of food");
//        return food;
//    }

        public Number eat(int food){
        System.out.println("Birds is eating "+ food + " units of food");
        return food;
    }
}
