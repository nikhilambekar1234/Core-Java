 //NOTE-CAN NOT ACHIEVE OVERLOADING BY CHANGING RETURN TYPE
 class Overloading1
 {
	 void show(int a)
	 {
		 System.out.println("return type void");
	 }
	int show(int a)
	 {
		 System.out.println("return type int ");
		 return 0;
	 }
	
	 public static void main(String arg[])
	 {
		 Overloading1 obj=new Overloading1();
		 obj.show(1);                  //ERROR- method allready defined
		 
	}
 }