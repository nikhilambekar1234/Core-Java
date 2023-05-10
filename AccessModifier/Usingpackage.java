//ACCESS MODIFIER
import PUBLIC.AccessModifier1;
//import PUBLIC.*;
class Using extends AccessModifier1
{
	void data()
	{
		System.out.println(x);
		System.out.println(y);
	//	System.out.println(z);
	//	System.out.println(a);
	}
}
 class UsingPackage
 {
    public static void main(String[] args)
	{
        AccessModifier1 c = new AccessModifier1();
        System.out.println("i am using package");
	    System.out.println(c.x);
		//System.out.println(c.y);
		//System.out.println(c.z);
		//System.out.println(c.a);
		System.out.println("-----------------------------------");
		Using k=new Using();
		k.data();
        
    }
}
