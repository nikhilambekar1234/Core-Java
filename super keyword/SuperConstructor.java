/*Note => super keyword is reference variable which is used to refer immediate parent class
1-super keyword can be used to refer immediate parent class instance variable
2-super keyword can be used to invoke immediate parent class method
3-super( ) keyword can be used to invoke immediate parent class constructor
*/
class Constructor
{
	Constructor()
	{
		System.out.println(" parent defautlt Constructor");
	}
	Constructor(int a)
	{
		System.out.println(" parent Constructor");
	}
}
class SuperConstructor extends Constructor
{
	void get()
	{
	  //	super(10);                   //Error super must be first statement in costructor
		System.out.println(" get method");
	}
    SuperConstructor()
	{
		super(10);
		get();
		System.out.println(" child Constructor");
	//	super(10);                       //Error super must be first statement in costructor
	}
	
	public static void main(String arg[])
	{
		SuperConstructor obj=new SuperConstructor();
		
	}
}