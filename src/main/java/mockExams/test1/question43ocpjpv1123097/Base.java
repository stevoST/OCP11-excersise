package mockExams.test1.question43ocpjpv1123097;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

class Base {
    public <T> Collection<T> transform(Collection<T> list) {
        return new ArrayList<T>();
    }
}

class Derived extends Base {
//    public <T> Collection<T> transform(Collection<T> list) {
//        return new HashSet<String>();
//    }
    //1

//    public <T> Collection<T> transform(Stream<T> list) {
//        return new HashSet<T>();
//    }
    //2

// public <T> List<T> transform(Collection<T> list) {
//     return new ArrayList<T>();
// }
// 3

// public <X> Collection<X> transform(Collection<X> list) {
//     return new HashSet<X>();
// }
    //4

//    public Collection<CharSequence> transform(
//            Collection<CharSequence> list) {
//        return new HashSet<CharSequence>();
//    }
    // first it will use type erasure and then its confused because its not overload either
    //5

//    public Collection<CharSequence> transform(
//            Collection list) {
//        System.out.println("override");
//        return new HashSet<CharSequence>();
//    }
    //test


    public static void main(String[] args) {
        Base derived = new Derived();
//     this will work with test scenario which means its a valid override
        derived.transform(new ArrayList());
    }
}