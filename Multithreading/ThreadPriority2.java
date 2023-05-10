//importing the java.lang package
import java.lang.*;
public class ThreadPriority2 extends Thread
{
	//Method whenever the start() method is called by a thread the run() method is invoked

      public void run()
	  {
		  //the print statement
		  System.out.println("Inside the run() method");
	  }	  
	  //the main method
	  public static void main(String arg[])
	  {
		  //Now,priority of the main thread is set to 7
		  Thread.currentThread().setPriority(7);
		  
		  //the current thread is retrieved using the currentThread() method
		  
		  //Displaying the main thread priority using the getPriority() method of the Thread class
		  System.out.println("priority of the main thread is : "+Thread.currentThread().getPriority());
		  
		  //creating a thread by creating an object of the class ThreadPriority2
		  ThreadPriority2 th1=new ThreadPriority2();
		  
		  //th1 thread is the child of the main thread therefore the th1 thread also gets the priority 7
		  
		  //Displaying the priority of the current thread 
		  System.out.println("Priority of the thread th1 is: "+th1.getPriority());
	  }
}