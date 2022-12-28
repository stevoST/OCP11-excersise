package programmer2.chapter18concurrency.concurrencyApi.concurrentCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedCollection {
    //Page 883
    public static void main(String[] args) {
//        var foodData = new ConcurrentHashMap<String, Object>();
        var foodData = new HashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        var synFoodData = Collections.synchronizedMap(foodData);
        for(String key: synFoodData.keySet())
            synFoodData.remove(key);
//        for(String key: foodData.keySet())
//            foodData.remove(key);
    }
}
