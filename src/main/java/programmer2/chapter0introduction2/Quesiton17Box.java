package programmer2.chapter0introduction2;

public class Quesiton17Box<T> {

    T value;

    public Quesiton17Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
    public static void main(String[] args) {
        var one = new Quesiton17Box<String>(" a string");
        var two = new Quesiton17Box<Integer>(123);
        System.out.print(one.getValue());
        System.out.print(two.getValue());
    }
}
