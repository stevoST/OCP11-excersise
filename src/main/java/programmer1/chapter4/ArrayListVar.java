package programmer1.chapter4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListVar {
    public static void main(String[] args) {
        List parrots = new ArrayList<>();
        for (var macaw : parrots){
            System.out.println(macaw);
        }
    }
}
