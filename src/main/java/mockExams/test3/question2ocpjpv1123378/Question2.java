package mockExams.test3.question2ocpjpv1123378;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

    public static void main(String[] args) {
        doElements(new ArrayList<>());
    }
    static void doElements(List l) {
        l.add("string"); //1
        System.out.println(l.get(0)); //2
        }
    }
