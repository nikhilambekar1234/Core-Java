/*//NOTE-1-STATIC METHOD BELONGS TO THE CLASS , NOT TO THE OBJECT
//2-STATIC METHOD CAN BE ACCESSED DIRECTLY BY CLASS NAME AND DOES NOT NEED ANY OBJECT
//3-STATIC METHOD CAN ACCESS ONLY STATIC DATA IT CANNOT ACCESS NON STATIC DATA(INSTANCE VARIABLE)
//4-STATIC METHOD CAN CALL ONLY OTHER STATIC METHOD AND CANNOT CALL A NON STATIC METHOD
//5-STATIC METHOD CAN NOT REFER TO "THIS" OR "SUPER" KEYWORD IN COMPANY
*/
class StaticVariable2
{
	static int a=10;
	static void fun()
	{
		 int b=20;
		 b++;
		 System.out.println(b);
	}
	public static void main(String arg[])
	{
		StaticVariable2 a1=new StaticVariable2();
		StaticVariable2 a2=new StaticVariable2();
		StaticVariable2 a3=new StaticVariable2();
		a1.fun();
		a2.fun();
		a3.fun();
	}
}
