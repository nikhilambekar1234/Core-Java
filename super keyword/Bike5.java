//2) SUPER IS USED TO INVOKE PARENT CLASS CONSTRUCTOR.
//added in each class constructor automatically by compiler.
class Vehicle
{  
	Vehicle()
	{
	       System.out.println("Vehicle is created");
	}  
}  
class Bike5 extends Vehicle
{  
	 Bike5()
	{  	  
       	super();//will invoke parent class constructor  
	    System.out.println("Bike is created");  
	    //super();
     }  
	 public static void main(String args[])
	{  
	   Bike5 b=new Bike5();  
	}  
}  
