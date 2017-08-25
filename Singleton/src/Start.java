public class Start {

	public static void main(String[] args)
	{
		for(int i=0; i<10; i++)
		{
			new SThread("t" + i).start();
		}
		System.out.println("main Finish");
	}
}

class SThread extends Thread {
	private String name;
	public SThread (String name){
		this.name = name;
	}

	public void run(){
		Singleton s = Singleton.getInstance();

		while( s.getCount_1() < 1000 )
//		for(int i=0; i<100; i++)
		{
			System.out.println( name + ":" + s.getIncrement_1() + "::" + s.getIncrement_2());

			try{
				sleep(10L);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}

class Singleton {

	private static Singleton singleton = new Singleton();
	private Singleton(){
		this.count_1 = 0;
		this.count_2 = 0;
	}

	public static Singleton getInstance(){
		return singleton;
	}

	public int getCount_1()
	{
		return count_1;
	}
	public int getCount_2()
	{
		return count_2;
	}

	private int count_1 = 0;
	public int getIncrement_1()
	{
		return count_1++;
	}
	private int count_2 = 0;
	public int getIncrement_2()
	{
		return count_2++;
	}
}
