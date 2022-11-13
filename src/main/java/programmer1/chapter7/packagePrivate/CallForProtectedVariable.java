package programmer1.chapter7.packagePrivate;

public class CallForProtectedVariable {
    public static void main(String[] args) {
        ProtectedVariable clazz = new ProtectedVariable();
        System.out.println(clazz.protectedVariable);
    }
}
