/*Note => super keyword is reference variable which is used to refer immediate parent class
1-super keyword can be used to refer immediate parent class instance variable
2-super keyword can be used to invoke immediate parent class method
3-super( ) keyword can be used to invoke immediate parent class constructor
*/
class Method
{
	void show()
	{
		System.out.println(" parent method");
	}
}
class SuperMethod extends Method
{
	@Override
    void show()
	{
		System.out.println(" child method");
	}
	void display()
	{
		show();
		super.show();    
	}
	public static void main(String arg[])
	{
		SuperMethod obj=new SuperMethod();
		obj.display();
	}
}