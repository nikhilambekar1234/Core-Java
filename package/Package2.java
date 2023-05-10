//3) Using fully qualified name PACKAGE TYPE
/*If you use fully qualified name then only declared class of this package will be accessible.
 Now there is no need to import. But you need to use fully qualified name every time when you are accessing the class or interface
 */
package mypack1;
class Package2
{  
       public static void main(String args[])
      {  
	   pack1.A obj1 = new pack1.A();  
                    pack1.B obj2 = new pack1.B();
	   obj1.msg();  
                    obj2.msg();
       }  
} 