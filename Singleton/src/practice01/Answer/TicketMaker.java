package practice01.Answer;

public class TicketMaker {
	private static TicketMaker instance = new TicketMaker();
	private TicketMaker(){}
	public static TicketMaker getInstance(){
		return instance;
	}

	private int ticket = 1000;

	public synchronized int getNextTicketNumber(){
		return ticket++;
	}
}
