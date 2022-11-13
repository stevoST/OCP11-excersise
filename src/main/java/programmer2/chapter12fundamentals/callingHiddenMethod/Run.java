package programmer2.chapter12fundamentals.callingHiddenMethod;

public interface Run {
    public default int getSpeed(){return 5;}
}
