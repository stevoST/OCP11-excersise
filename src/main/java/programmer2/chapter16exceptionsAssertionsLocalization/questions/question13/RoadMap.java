package programmer2.chapter16exceptionsAssertionsLocalization.questions.question13;

import java.util.Locale;

public class RoadMap implements AutoCloseable{
    private Locale locale;
    private boolean closed = false;

    void check(){
        assert !closed;
    }
    @Override
    public void close() throws Exception {
        check();
        System.out.println("Folding map");
        locale = null;
        closed = true;
    }

    public void open() {
        check();
        this.locale = new Locale("wp", "VW");
        this.locale = new Locale("xm");
        this.locale = new Locale("MQ", "ks");
    }

    public void use(){
        //meh
    }
}
