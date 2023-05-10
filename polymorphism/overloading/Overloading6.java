 //NOTE-AUTOMATIC PROMOTION
 //NOTE- OBJECT IS THE PARENT CLASS OF ALL THE CLASS IN JAVA
 //Sring and StringBuffer
 class Overloading6
 {
	 void show(String a,float b)
	 {
		 System.out.println("String float method");
	 }
	 void show(int a,float b)
	 {
		 System.out.println("int float method");
	 }
	void show(float a,int b)
	 {
		 System.out.println("float int method");
	 }
	 public static void main(String arg[])
	 {
		 Overloading6 obj=new Overloading6();
		 obj.show(12 , 10.5f);                                         
		 obj.show(10.5f , 12) ;                                     
	//	 obj.show(10,20);                                                 // reference to show is ambiguous errror
	     obj.show("abc" , 20);                                         //automatic promotion
	//	 obj.show(10.5f,12.5f);                                       //errror not suitable mehod for show (float float)
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
				   