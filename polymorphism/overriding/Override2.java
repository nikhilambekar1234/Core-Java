/*NOTE=> METHOD OVERRIDING
COVARIENT RETURN TYPE
NOTE=>From java5.0 onward it is possible to have different return type for a overriding method in child class,
              but childs return type should be sub-type of parents return type.this phenomenon known as covariant return type.
NOTE=>1 same name; 2-different class; 3- same argument; 4-inhert class
OVERRIDING AND ACCESS MODIFIER
NOTE=>Access Modifire in child class always take large as compare to parent class
*/
class Over2
{
	  void show()                                       // access modifier small
	//protected void show()                                                                                           // access modifier small
	{
		System.out.println("parent class");
	}
}
class Override2 extends Over2
{        
       protected void show()                    // access modifier large              
	//public void show()                                                                                               // access modifier large       
	{
		System.out.println("child class");
	}
	public static void main(String arg[])
	{
		Over2 obj1=new Over2();
	    obj1.show();
		
		Override2 obj2=new Override2();
		obj2.show();
	}
}
/*
COVARIANT RETURN TYPE

 parent=>                     object
 child=>	String    StringBuffer    StringBuilder     Number     Character     Boolean          void	

parent=>                     Number
childe=>   Byte         Short         Integer            Long             Float              Double 
*/
					  