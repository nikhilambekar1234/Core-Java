//ACCESS MODIFIER

class C1
{
    public int x = 5;         //Within a class / package /outside package by subclass only / outside package 
    protected int y =45;   //Within a class / package /outside package by subclass only
    int z = 6;                   //Within a class / package
    private int a = 78;      //Within a class
    public void meth1()
	{
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class AccessModifier
 {
    public static void main(String[] args)
	{
        C1 c = new C1();
        c.meth1();
	    System.out.println("---------------------------------------");
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
     // System.out.println(c.a);
    }
}
