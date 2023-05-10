 //NOTE-AUTOMATIC PROMOTION
 //NOTE- OBJECT IS THE PARENT CLASS OF ALL THE CLASS IN JAVA
 //Sring and StringBuffer
 //THE VARARG ALLOWS THE METHOD TO ACCEPT ZERO OR MULTIPLE ARGUMENTS.
 class Overloading7
 {
	 void show(int a)
	 {
		 System.out.println("int  method");
	 }
	 void show(int...a)
	 {
		 System.out.println("vararg method");
	 }
	public static void main(String arg[])
	 {
		 Overloading7 obj=new Overloading7();
		 obj.show(12);                                         
		 obj.show(10, 12) ; 
         obj.show();		 
	
	}
}
 /*
 One type is promoted to another implicitly if no matching datatype is found.below is the diagram
 AUTOMATIC PROMOTION
                   BYTE
				   short
	char	=>   int =>     float
				   long=>   double
*/				   
				   