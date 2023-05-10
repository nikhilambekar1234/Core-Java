//4) THIS KEYWORD CAN BE PASSED AS AN ARGUMENT IN THE METHOD.
class MethodArgument
{  
     int r; 
    String name;

	void run(MethodArgument obj)
	{  
	   System.out.println("method is invoked");  
	   System.out.println(r+"    "+name);  
	}  
	MethodArgument(int  r, String name)
	{  
        run(this);                        //prints 0 Null
        this.r=r;
        this.name=name;
	  //run(this);                       //prits 1 XYZ
	}  
    public static void main(String args[])
	{  
	  MethodArgument s1 = new MethodArgument(1,"xyz");  
    }  
}  
