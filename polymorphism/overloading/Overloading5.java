 //NOTE-AUTOMATIC PROMOTION
 //NOTE- OBJECT IS THE PARENT CLASS OF ALL THE CLASS IN JAVA
 //Sring and StringBuffer
 class Overloading5
 {
	 void show(StringBuffer a)
	 {
		 System.out.println("automatic promotion StringBuffer");
	 }
	void show(String a)
	 {
		 System.out.println("automatic promotion String a");
	 }
	 public static void main(String arg[])
	 {
		 Overloading5 obj=new Overloading5();
		 obj.show("abc");                                         //Run  i.e. Optional 
		 obj.show(new StringBuffer("abc")); 
		// obj.show(null);                                          // ambiguous errror
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
				   