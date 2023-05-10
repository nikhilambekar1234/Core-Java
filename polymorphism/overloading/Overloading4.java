 //NOTE-AUTOMATIC PROMOTION
 //NOTE- OBJECT IS THE PARENT CLASS OF ALL THE CLASS IN JAVA
 class Overloading4
 {
	 void show(Object a)
	 {
		 System.out.println("automatic promotion Object parent of all");
	 }
    // void show(char a)
	void show(String a)
	 {
		 System.out.println("automatic promotion String a");
	 }
	 public static void main(String arg[])
	 {
		 Overloading4 obj=new Overloading4();
		 obj.show('a');                 //Run  i.e. Optional 
		 
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
				   