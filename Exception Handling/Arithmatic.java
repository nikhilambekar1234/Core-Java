package FileHandling;

public class Arithmatic 
{
	int c;
     void get()
     {
    	 System.out.println("First Result");
    	  c=50/0;
    	 System.out.println("Secon Result");
    	 
     }
     public static void main(String arg[])
     {
    	 Arithmatic d=new Arithmatic();
    	 d.get();
     }
}
