package programmer2.chapter12fundamentals.callingHiddenMethod;

public interface Walk {
    public default int getSpeed(){return 5;}
}
