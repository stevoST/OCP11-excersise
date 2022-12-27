package programmer2.chapter18concurrency.concurrencyApi.concurrentCollections;

import java.util.concurrent.ConcurrentHashMap;

public class ModifyIteratedCollectionRemove {
    //Page 879
    public static void main(String[] args) {
        var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("penguin",1);
        foodData.put("flamingo",2);
        for(String key : foodData.keySet()){
            foodData.remove(key);
        }
        System.out.println(foodData);
    }
}
