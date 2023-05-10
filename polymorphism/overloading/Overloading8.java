/*NOTE-METHOD OVERLOADING
1-SAME NAME 2-SAME CLASS 3-Different Argument(no of arg,seq of arg,type of arg)
on the basis of different datatype and access modifier not overload
*/
 class Overloading8
 {
	public void show(int a)
	 {
		 System.out.println("number of argument=> int a");
	 }
      void show(int a)
	 {
		 System.out.println("number of argument=> int a,int b");
		 
	 }
	
	 public static void main(String arg[])
	 {
		 Overloading8 obj=new Overloading8();
		 obj.show(1);
		// obj.show(1);
		 
	}
 }