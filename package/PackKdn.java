package pack1.subpackage1;
public class PackKdn
{
          protected int a=10;
          public int b=20;
        protected void fun()
       {
             System.out.println("protected fun method");
       }
       public void msg()
       {
             System.out.println("public msg method");
       }
       public static void main(String arg[])
       {
             System.out.println("sub package main method");
       }
   
}
/*NOTE=> to run main method of subpackage
javac -d . PackKdn.java
java pack1.subpackage1.PackKdn
*/
