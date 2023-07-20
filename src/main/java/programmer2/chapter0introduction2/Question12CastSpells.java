package programmer2.chapter0introduction2;

class Question12Wizard {
    private enum Hat {
        BIG, SMALL
    }
    protected class MagicWand {
        void abracadabra(){
            System.out.println("Poof!");
        }
    }
}

public class CastSpells {
    public static void main(String[] args){
        var w = new Question12Wizard();
        new Question12Wizard().new MagicWand();
    }
}
