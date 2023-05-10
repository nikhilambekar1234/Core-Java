/*1) Using packagename.* TYPE OF PACKAGE
If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages
*/
package mypack;
import pack.*; //import package only compile //  javac -d . Simple2.java
class Simple4 extends Simple2
{
                int a=10;
     public int b=20;
protected int c=30;
  private  int d=40;

    void show()
    {
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
    }
    void data()
    {
     //    System.out.println(x); //not access
           System.out.println(y);
           System.out.println(z);
      //   System.out.println(w);   //not access
    }
}
public class Simple3
{              
      public static void main(String arg[])
     {
          Simple2 obj2=new Simple2();
          Simple4 obj4=new Simple4();
          obj2.msg();
          obj4.show();
           
        System.out.println("----------------------------------------");
        System.out.println(obj4.a);
        System.out.println(obj4.b);
        System.out.println(obj4.c);
    // System.out.println(obj4.d);    //not access
       System.out.println("----------------------------------------");
        obj4.data();
       System.out.println("-----------------------------------------");
     //   System.out.println(obj2.x);
        System.out.println(obj2.y);
     //   System.out.println(obj2.z);
    //   System.out.println(obj2.w);
     }
}
//javac -d . Simple3.java
//java mypack.Simple3