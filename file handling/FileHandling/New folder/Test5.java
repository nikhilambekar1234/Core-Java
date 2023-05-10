package FileHandling;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Test5 {

	public static void main(String[] args) throws IOException {
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
                                       
			public void run()
			{
				try
				{
					for(int i=65;i<=90;i++)
					{
                                                                                             
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
