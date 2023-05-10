//importing the required classes
import java.lang.*;
public class ThreadPriority1 extends Thread
{
	//Method 1
	//whenever the start() method is called by a thread the run() method is invoked
	public void run()
	{
		//the print statement
		System.out.println("Inside the run() method");
	}
	//the main method
	public static void main(String arg[])
	{
		//creating threads with the help of ThreadPriority1 class
		ThreadPriority1 th1=new ThreadPriority1();
		ThreadPriority1 th2=new ThreadPriority1();
		ThreadPriority1 th3=new ThreadPriority1();
		
		//we did not mention the priority of the thread therefore the priority of the thread is 5,the default value
		
		//1st Thread Displaying the priority of the thread using the getPriority() method
		System.out.println("Priority of the thread th1 is: "+th1.getPriority());
		
		//2nd Thread Display the priority of the thread
		System.out.println("Priority of the thread th2 is:" +th2.getPriority());
		
		//3rd Thread Display the priority of the thread
		System.out.println("Priority of the thread th2 is: "+th2.getPriority());
		
		//setting priorities of above threads by passing integer argumetns
		th1.setPriority(6);
		th2.setPriority(3);
		th3.setPriority(9);
		
		System.out.println("Priority of the thread th1 is: "+th1.getPriority());
		System.out.println("Priority of the thread th2 is: "+th2.getPriority());
		System.out.println("Priority of the thread th3 is: "+th3.getPriority());
		
		//Main thread displaying name of the currently executing thread
		System.out.println("Currently Executig th thread: "+Thread.currentThread().getName());
		System.out.println("Priority of the main thread is: "+Thread.currentThread().getPriority());
		
		//priority of the main thread is 10 now
		Thread.currentThread().setPriority(10);
		System.out.println("Priority of the main thread is: "+Thread.currentThread().getPriority());
		
	}
}