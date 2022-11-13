package programmer2.chapter12fundamentals.callingHiddenMethod;

public class Cat implements Walk,Run{
    @Override
    public int getSpeed() {
        return Run.super.getSpeed();
    }
}
