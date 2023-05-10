import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
public class TestThreadPool1
{
	public static void main(String arg[])
	{
		ExecutorService executor=Executors.newFixedThreadPool(5);  //creating  a pool of 5 thread;
		for(int i=0;i<10;i++)
		{
			Runnable pool1=new ThreadPool1(" "+i);
			executor.execute(pool1);  //calling execute method of ExecutorService
		}
		executor.shutdown();
		while(!executor.isTerminated())
		{
			
		}
		System.out.println("Finished all threads");
	}
}