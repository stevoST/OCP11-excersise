package mockExams.test2.question49ocpjpv1123651;

interface House {
    public default void lockTheGates() {
        System.out.println("Locking House");
    }

}

interface Office {
    public void lockTheGates();
}

class HomeOffice implements House, Office { //1

    //added method
    public void lockTheGates() {
        System.out.println("Locking House");
    }
}

public class TestClass {
    public static void main(String[] args) {
        Office off = new HomeOffice();  //2
        off.lockTheGates(); //3
        House home = (House) off; //4
        home.lockTheGates(); //5   
    }
}
