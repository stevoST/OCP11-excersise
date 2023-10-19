package mockExams.test2.question32ocpjpv1123215;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Product {
    String variantCode;
    int position;

    public Product(String variantCode, int position) {
        this.variantCode = variantCode;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Product{" +
                "variantCode='" + variantCode + '\'' +
                ", position=" + position +
                '}';
    }
}

public class ProductMerger {

    public static List<Product> mergeLists(List<Product> list1, List<Product> list2) {
        // Create a map to keep track of variant codes and their corresponding positions
        Map<String, Integer> variantToPositionMap = new HashMap<>();

        // Initialize the result list
        List<Product> resultList = new ArrayList<>();

        // Process list1
        for (Product product : list1) {
            String variantCode = product.variantCode;
            int position = product.position;

            // If the variant code is not in the map, add it with its position
            if (!variantToPositionMap.containsKey(variantCode)) {
                variantToPositionMap.put(variantCode, position);
                resultList.add(new Product(variantCode, position));
            }
        }

        // Process list2
        for (Product product : list2) {
            String variantCode = product.variantCode;
            int position = product.position;

            // If the variant code is not in the map, add it with its position
            if (!variantToPositionMap.containsKey(variantCode)) {
                variantToPositionMap.put(variantCode, position);
                resultList.add(new Product(variantCode, position));
            }
        }

        // Sort the result list based on positions
        resultList.sort((p1, p2) -> Integer.compare(p1.position, p2.position));

        // Update positions to be unique
        for (int i = 0; i < resultList.size(); i++) {
            resultList.get(i).position = i + 1;
        }

        return resultList;
    }

    public static void main(String[] args) {
        List<Product> list1 = new ArrayList<>();
        list1.add(new Product("variant1", 1));
        list1.add(new Product("variant2", 2));
        list1.add(new Product("variant3", 3));
        list1.add(new Product("variant4", 4));

        List<Product> list2 = new ArrayList<>();
        list2.add(new Product("variant1", 2));
        list2.add(new Product("variant5", 3));

        List<Product> mergedList = mergeLists(list1, list2);

        for (Product product : mergedList) {
            System.out.println(product);
        }
    }
}
