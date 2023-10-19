package mockExams.test1.question21ocpjpv1123455;

import java.util.ArrayList;
import java.util.List;

public class DoNothingFilter implements Filter {

    public DoNothingFilter(int a) {
    }

    public List<String> filter(List<String> l) {
        return l;
    }

    public static void main(String[] args) {
        Filter doNothingFilter = new DoNothingFilter(3);
        doNothingFilter.filter(new ArrayList<>());
    }
}
