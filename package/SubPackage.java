/* PROTECTED VARIABLE AND METHOD
NOTE=>Protected type data from the outside package access only by CHILD CLASS(object) AND ITS WON REFERENCE
              Not by parent class( object )or its Reference
*/
package pack2;
import pack1.subpackage1.*;
/*class Sub extends PackKdn
{
         void gun()
         {
                 fun();
                 System.out.println("protected a = "+a);
                 System.out.println("public b = "+b);
         }
}
public class SubPackage 
{
     
       public static void main(String arg[])
       { 
                Sub obj=new Sub(); 
                       obj.gun();
           //            obj.fun();  //protected
                      
               PackKdn obj1=new PackKdn();
         //   System.out.println("protected a ="+obj1.a);
              System.out.println("public b ="+obj1.b);
              obj1.msg();
        //   obj1.fun();         //protected
                                   
       }
} 
*/
//------------------------------------------------------------------------------------------------------------------------------OR
/* PROTECTED VARIABLE AND METHOD
NOTE=> data from the outside package access only by CHILD CLASS AND ITS WON REFERENCE
*/
public class SubPackage extends PackKdn
{
       public static void main(String arg[])
       { 
             
                    SubPackage obj=new SubPackage();              //only by CHILD CLASS AND ITS WON REFERENCE 
                    System.out.println("protected a = "+obj.a);
                    System.out.println("public b = "+obj.b);
                   obj.msg();
                   obj.fun();
                   System.out.println("--------------------------------------------------------------------");
 
                    PackKdn obj1=new SubPackage();                        
                //    System.out.println("protected a = "+obj1.a);       // Access only by CHILD CLASS AND ITS WON REFERENCE
                    System.out.println("public b = "+obj1.b);
                    obj1.msg();
               //    obj1.fun();                                                           //Access only by CHILD CLASS AND ITS WON REFERENCE
                     System.out.println("--------------------------------------------------------------------");

                    PackKdn obj2=new PackKdn();              
                 //   System.out.println("protected a = "+obj2.a);         // Access only by CHILD CLASS AND ITS WON REFERENCE
                    System.out.println("public b = "+obj2.b);
                    obj2.msg();
                 //   obj2.fun();                                                        // Access only by CHILD CLASS AND ITS WON REFERENCE
                    System.out.println("--------------------------------------------------------------------");
                                        
       }
} 