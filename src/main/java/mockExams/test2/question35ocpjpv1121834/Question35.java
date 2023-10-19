package mockExams.test2.question35ocpjpv1121834;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question35 {
    public static void main(String[] args) {
        Map<String, List<Double>> groupedValues = new HashMap<>();
        Map<String, List<Double>> groupedValuesWrong = new HashMap<>();
        process("test", 3.0, groupedValues);
        process("test", 4.0, groupedValues);
//        processWrong("test", 4.0, groupedValuesWrong);
        System.out.println("breakpoint");
    }

    public static void process(String name, Double value, Map<String, List<Double>> groupedValues) {
        List<Double> values = groupedValues.get(name);
        if (values == null) {
            values = new ArrayList<Double>();
            groupedValues.put(name, values);
        }
        values.add(value);
    }


    public static void processWrong(String name, Double value, Map<String, List<Double>> groupedValues) {
        groupedValues.computeIfPresent(name, (a, b) -> new ArrayList<Double>()).add(value);
    }
}
