package practice01;

import practice01.Answer.TicketMaker;

public class Main {
	public static void main(String[] args){
		for(int i=0; i<10; i++)
			System.out.println( TicketMaker.getInstance().getNextTicketNumber() );
	}
}