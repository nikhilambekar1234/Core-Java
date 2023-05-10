//3) SUPER CAN BE USED TO INVOKE PARENT CLASS METHOD
class Person
{  
	void message()
	{
		System.out.println("welcome");
	}  
}  
class Student16 extends Person
{  
	void message()
	{
		System.out.println("welcome to java");
	}  
	void display()
	{  
	    message();//will invoke current class message() method  
	    super.message();//will invoke parent class message() method  
	}  
	public static void main(String args[])
	{  
	    Student16 s=new Student16();  
	    s.display();  
	}  
} 
