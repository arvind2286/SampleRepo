package mythread;

public class ThreadA2 extends Thread
{
	public ThreadA2()
	{
		setName("A2");

		System.out.println(getName()+" THREAD CREATED.");

		start();

		System.out.println(getName()+" THREAD STARTED.");

		try
		{	
			join(2000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	
	public void run()
	{
		String name=getName();
		try
		{
			for(int x=1;x<=5;x++)
			{
				System.out.println(name+" THREAD EXECUTING : "+x);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println(name+" THREAD ENDING.");
	}
}