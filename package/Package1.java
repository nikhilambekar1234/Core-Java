//2) Using packagename.classname =>PACKAGE TYPE
//Rule: There can be only one public class in a java source file and it must be saved by the public class name.
//How to put two public classes in a package?
//If you want to put two public classes in a package, have two java source files containing one public class, but keep the package name same. For example:
//If you import package.classname then only declared class of this package will be accessible.
package mypack1;  
import pack1.A;  
import pack1.B;
class Package1
{  
       public static void main(String args[])
      {  
	   A obj1 = new A();  
                    B obj2 = new B();
	   obj1.msg();  
                    obj2.msg();
       }  
}  

 