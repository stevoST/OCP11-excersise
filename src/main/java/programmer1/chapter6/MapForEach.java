package programmer1.chapter6;

import java.util.Map;

public class MapForEach {
    public static void main(String[] args) {
        Map map = Map.of(1,2,3,4);
        map.values().forEach(x-> System.out.println(x));
    }
}
