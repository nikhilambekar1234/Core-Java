 //NOTE-AUTOMATIC PROMOTION
 class Overloading3
 {
	 void show(int a)
	 {
		 System.out.println("automatic promotion int a");
	 }
	void show(String a)
	 {
		 System.out.println("automatic promotion String a");
	 }
	 public static void main(String arg[])
	 {
		 Overloading3 obj=new Overloading3();
		 obj.show('a');                 //Run int a i.e. Optional if char not present convert character to int 
		 
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
				   