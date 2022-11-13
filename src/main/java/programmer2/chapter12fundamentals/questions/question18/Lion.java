package programmer2.chapter12fundamentals.questions.question18;

public class Lion {
    class Cub{}
    static class Den{
        Den(){
            System.out.println("test");
        }
    }
    static void rest(){
        Lion.Cub a = new Lion().new Cub();
        var b = new Den();
        Den c = new Lion.Den();

        Den d = new Den();
        Lion.Den e = new Den();
    }

    public static void main(String[] args) {
        Lion.Den c = new Lion.Den();
        Den d = new Den();
        Lion.Den e = new Den();

    }
}
