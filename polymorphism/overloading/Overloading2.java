 //NOTE-WE CAN OVERLOAD MAIN METHOD
 class Overloading2
 {
	 public static void main(String arg[])
	 {
		 System.out.println("String arg[]");
		 Overloading2 obj=new Overloading2();
		 obj.main("str");                 
		 
	}
	public static void main(String a)
	{
		  System.out.println("String a");
	}
 }