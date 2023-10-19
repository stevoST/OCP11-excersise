package mockExams.test1.question16;

interface I{
}

class A implements I{
}

class B extends A {
}

class C extends B{
}

public class Question16 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

//        I i =m (C) a;

        a = (B)(I)b;
    }
}