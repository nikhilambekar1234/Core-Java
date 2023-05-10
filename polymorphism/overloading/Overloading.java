/*NOTE-METHOD OVERLOADING
1-SAME NAME 2-SAME CLASS 3-Different Argument(no of arg,seq of arg,type of arg)
*/
 class Overloading
 {
	 void show(int a)
	 {
		 System.out.println("number of argument=> int a");
	 }
	 void show(int a,int b)
	 {
		 System.out.println("number of argument=> int a,int b");
	 }
	 void show(int a,double b)
	 {
		 System.out.println("seaquence of argument=>int a,double b");
	 }
	 void show(double a,int b)
	 {
		 System.out.println("seaquence of argument=>double a,int b");
	 }
	 void show(char a)
	 {
		 System.out.println("Type of argument=> char a");
	 }
	 void show(String  b)
	 {
		 System.out.println("Type of argument=> String b");
	 }
	 public static void main(String arg[])
	 {
		 Overloading obj=new Overloading();
		 obj.show(1);
		 obj.show(1,2);
		 obj.show(3,4.5);
		 obj.show(4.5,3);
		 obj.show('k');
		 obj.show("str");
	}
 }