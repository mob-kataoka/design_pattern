package practice02;

import practice02.Answer.Triple;

public class Main {
	public static void main(String[] args){
		System.out.println("Start.");
		for(int i=0; i<9; i++){
			Triple triple = Triple.getInstance( i % 3 );
			System.out.println( i + ":" + triple.toString() );
		}
		System.out.println("End.");
	}
}
