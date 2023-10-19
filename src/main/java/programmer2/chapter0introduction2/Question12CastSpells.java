package programmer2.chapter0introduction2;

class Wizard {
    private enum Hat {
        BIG, SMALL
    }
    protected class MagicWand {
        void abracadabra(){
            System.out.println("Poof!");
        }
    }
}

public class Question12CastSpells {
    public static void main(String[] args){
        var w = new Wizard();
        new Wizard().new MagicWand().abracadabra();
        w.new MagicWand(){
            void abracadabra(int spell){
                System.out.println("Oops!");
            }
        }.abracadabra();
//        new Wizard.MagicWand().abracadabra();
        w.new MagicWand().abracadabra();
    }
}
