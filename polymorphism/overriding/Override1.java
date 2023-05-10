/*NOTE=> METHOD OVERRIDING
COVARIENT RETURN TYPE
From java5.0 onward it is possible to have different return type for a overriding method in child class,
but childs return type should be sub-type of parents return type.this phenomenon known as covariant return type.
1 same name; 2-different class; 3- same argument; 4-inhert class
*/
class Over1
{
	//String show()
	Object show()                                                  // PARENT COVARIENT RETURN TYPE
	{
		System.out.println("parent class");
		return null;
	}
}
class Override1 extends Over1
{
	//Object show()                                                  //ERROR-object is not compatible with string
	String show()                                                // CHILD COVARIENT RETURN TYPE
	{
		System.out.println("child class");
		return null;
	}
	public static void main(String arg[])
	{
		Override1 obj=new Override1();
		obj.show();
	}
}
/*
COVARIANT RETURN TYPE

 parent=>                     object
 child=>	String    StringBuffer    StringBuilder     Number     Character     Boolean          void	

parent=>                     Number
childe=>   Byte         Short         Integer            Long             Float              Double 
*/
					  