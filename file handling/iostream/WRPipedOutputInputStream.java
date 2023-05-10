/*PipedInputStream and PipedOutputStream classes
The PipedInputStream and PipedOutputStream classes can be used to read and write data simultaneously. Both streams are connected with each other
 using the connect() method of the PipedOutputStream class.
Example of PipedInputStream and PipedOutputStream classes using threads
Here, we have created two threads t1 and t2. The t1 thread writes the data using the PipedOutputStream object and the t2thread reads the data from that pipe
 using the PipedInputStream object. Both the piped stream object are connected with each other.
*/
import java.io.*;
class WRPipedOutputInputStream
{
	public static void main(String args[])throws Exception
	{
		final PipedOutputStream pout=new PipedOutputStream();
		final PipedInputStream pin=new PipedInputStream();
		
		pout.connect(pin);   //connecting the streams
		//pin.connect(pout);    
		//creating one thread t1 which writes the data
		Thread t1=new Thread()
		{
			public void run()
			{
				for(int i=65;i<=90;i++)
				{
					try
					{
						pout.write(i);
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						
					}
				}
			}
		};
		Thread t2=new Thread()
		{
                                       //int v;
			public void run()
			{
				try
				{
					for(int i=65;i<=90;i++)
					{
                                                                                                          //v=pin.read();    
                                                                                                         System.out.println((char)v);                   
        
						System.out.println((char)pin.read());
						//Thread.sleep(1000);
					}
				}
				catch(Exception e)
				{
					
				}
			}
		};
		t1.start();
		t2.start();
	}
	
}