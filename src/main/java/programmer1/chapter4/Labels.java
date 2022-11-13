package programmer1.chapter4;

public class Labels {
    public static void main(String[] args) {
        int height = 1;
        L1: while(height++ <10){
            long humidity = 12;
            L2: do {
                if(humidity-- % 12 == 0)   continue L2; //fill in
                int temperature = 30;
                L3: for (;;){
                    temperature++;
                    if(temperature>50) continue L2; //fill in
                }
            } while (humidity>4);
        }
    }
}
