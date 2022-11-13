package programmer2.chapter14genericsandcollections.passingGenericArguments;

import java.util.List;

public class WorkingClass {
        <T> T first(List<? extends T> list){
            return list.get(0);
        }

//        <T> <? extends T> second(List<? extends T> list){
//            return list.get(0);
//    }

      <B extends A> B third(List<B> list){
//            return new B();
          return list.get(0);
    }

    void fourth(List<? super B> list){

    }

//    <X> void fifth(List<X super B> list){}
    

    public static void main(String[] args) {
    }
}
