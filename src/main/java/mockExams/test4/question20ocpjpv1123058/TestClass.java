package mockExams.test4.question20ocpjpv1123058;

import java.util.ArrayList;

class Student {
}

public class TestClass {
//    var students = new ArrayList<Student>(); //1

    public static void main(String[] args) {
        var student = new Student(); //2
        var allStudents = new ArrayList<>();  //3
        allStudents.add(student); //4
        for (var s : allStudents) { //5
            System.out.println(s);
        }
//        Student s2 = allStudents.get(0); //6
        var var = "what?"; //7
        }
}
