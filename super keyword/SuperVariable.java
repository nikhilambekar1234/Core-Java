/*Note => super keyword is reference variable which is used to refer immediate parent class
1-super keyword can be used to refer immediate parent class instance variable
2-super keyword can be used to invoke immediate parent class method
3-super( ) keyword can be used to invoke immediate parent class constructor
*/
class Variable
{
	int a=10;
}
class SuperVariable extends Variable
{
	int a=20;
	void show(int a)
	{
		System.out.println(" local a ="+a);
		System.out.println("(by this ) istance a ="+this.a);
		System.out.println("(by super ) parent instance a  ="+super.a);
	}
	public static void main(String arg[])
	{
		SuperVariable obj=new SuperVariable();
		obj.show(30);
	}
}