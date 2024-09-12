package mockExams.test5.question5ocpjpv1123317;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;

public class Question5 {
    public static void main(String[] args) {
        DoubleStream ds = DoubleStream.of(1.0, 2.0, 3.0);
        //INSERT CODE HERE
//        DoubleFunction<Double> doubleF = m-> n->m+n;
//        DoubleFunction<IntUnaryOperator> doubleF = m->n->(int)m+n;
        DoubleFunction<DoubleUnaryOperator> doubleF = m-> n->m+n;
        ds.map(doubleF.apply(5.0))
                .forEach(System.out::println);
    }
}
