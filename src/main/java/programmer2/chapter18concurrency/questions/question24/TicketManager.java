package programmer2.chapter18concurrency.questions.question24;

public class TicketManager {
    private int tickets;
    private static TicketManager instace;
    private TicketManager(){}
    static synchronized TicketManager getInstance(){
        if (instace == null) instace = new TicketManager();
        return instace;
    }

    public int getTicketCount() {return tickets;}
    public void addTickets(int value){ tickets += value;}
    public void sellTickets(int value){
        synchronized (this){
            tickets -= value;
        }
    }
}
