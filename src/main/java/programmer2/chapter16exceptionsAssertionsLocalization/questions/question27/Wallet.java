package programmer2.chapter16exceptionsAssertionsLocalization.questions.question27;

import java.text.NumberFormat;
import java.util.Locale;

public class Wallet {
    private double money;

    public Wallet(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private String openWallet() {
//        Locale.setDefault(new Locale.Builder()
//                .setRegion("fr")
//                .setLanguage("FR")
//                .build());
        Locale.setDefault(Locale.Category.DISPLAY, new Locale.Builder().setRegion("FR").build());
        Locale.setDefault(Locale.Category.FORMAT, new Locale.Builder().setRegion("fr").build());
        System.out.println(Locale.getDefault());
        return NumberFormat.getCurrencyInstance(Locale.GERMANY).format(money);
    }

//    private String openWallet2(){
//        Locale.setDefault(new Locale.Builder().setLanguage("en").build(),new Locale.Builder().setRegion("us").build());
//        Locale.setDefault(Locale.Category.FORMAT,new Locale.Builder().setRegion("en").build());
//        return NumberFormat.getCurrencyInstance(Locale.GERMANY).format(money);
//    }

    public void printBalance() {
        System.out.println(openWallet());
    }

    public static void main(String[] args) {
        new Wallet(2.4).printBalance();
    }
}
