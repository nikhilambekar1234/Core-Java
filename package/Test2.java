//Encapsulation Package from another package
package java2;
import  java1.*;

 class Test2
{
         public static void main(String arg[])
         {
               Student obj=new Student();
                            obj.setName("Vijay");
               System.out.println(obj.getName());
         }
         
}
