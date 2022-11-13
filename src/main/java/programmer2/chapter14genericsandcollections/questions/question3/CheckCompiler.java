package programmer2.chapter14genericsandcollections.questions.question3;

import java.util.List;

public class CheckCompiler {
        public static void main(String[] args) {
            List<?> q = List.of("Mouse", "parrot");
            var v = List.of("Mouse", "parrot");
            v.removeIf(String::isEmpty);
        }
}
