//6) THE THIS KEYWORD CAN BE USED TO RETURN CURRENT CLASS INSTANCE
//NOTE-we can return the this keyword as an statement from the method. in such case, return type of the method must be the class type (non-primitive). 
class ClassInstance
{  
	ClassInstance getA()       // return type of the method must be the class type
   {  
	   System.out.println("Hii");
	     return this;     // RETURN CURRENT CLASS INSTANCE
	}  
	void msg()
	{
	    System.out.println("Hello java");
	}  
}  
class ReturnClass
{  
	public static void main(String args[])
	{  
	  new ClassInstance().getA();
	   // new ClassInstance().getA().msg();  
	    new ClassInstance().msg();
	}  
}
