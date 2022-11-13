package programmer1.chapter4;

public class ForReverseArray {
    public static void main(String[] args) {
        char[] wolf = {'W','e','b','b','y'};

        int q = wolf.length;
        for(;;){
            System.out.print(wolf[--q]);
            if(q==0) break;
        }
        System.out.println("");

        for(int m = wolf.length-1;m>=0;--m){
            System.out.print(wolf[m]);
        }
        System.out.println("");

//        for(int i = wolf.length;i>0;--i){
//            System.out.print(wolf[i]);
//        }
    }
}
