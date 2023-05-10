//ACCESS MODIFIER
package PUBLIC;
 public class AccessModifier1
{
    public int x = 100;         //Within a class / package /outside package by subclass only / outside package 
    protected int y =45;   //Within a class / package /outside package by subclass only
    int z = 6;                   //Within a class / package
    private int a = 78;      //Within a class
    public void run()
	{
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
	 public static void main(String[] args)
	 {
		 System.out.println("PUBLIC PACKAGE");
	 }
}
