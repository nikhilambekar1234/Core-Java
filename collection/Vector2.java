import java.util.*;
import java.util.Vector;
import java.util.Enumeration;

public class Vector2
 {

   public static void main(String args[]) 
   {
      /* Vector of initial capacity(size) of 2 */
      Vector<String> vec = new Vector<String>(2);

      /* Adding elements to a vector*/
      vec.addElement("Apple");
      vec.addElement("Orange");
      vec.addElement("Mango");
      vec.addElement("Fig");
	   vec.addElement("Orange");
      vec.addElement("Banana");
      vec.addElement("Apple");

         //This would start search from index 2(inclusive)
     int after_index = vec.indexOf("Orange", 2);
     System.out.println("Occurrence after index 2: "+after_index);
 
     //This would search the element backward starting from index 6(inclusive)
     int before_index = vec.lastIndexOf("Orange", 3);
     System.out.println("Occurrence before index 6: "+before_index);
	 System.out.println("------------------------------------------------");
	 
	 // Removing 3rd element from Vector
    Object obj = vec.remove(2);
 
    System.out.println("\nElement removed from Vector is:");
    System.out.println(obj);
 
    System.out.println("\nVector elements after remove():");
    for(int i=0; i < vec.size(); i++)
    {
       System.out.println(vec.get(i));
    }
     
	 // Removing  element from Vector
    Object obj1 = vec.remove("Orange");
 
    System.out.println("\nElement removed from Vector is:");
    System.out.println(obj1);        //boolean return
	
	 System.out.println("------------------------------------------------");
	// Get Enumeration of Vector elements 
    Enumeration en = vec.elements();
 
    //Display Vector elements using hashMoreElements() and nextElement() methods. 
    
    System.out.println("Vector elements are: ");
    while(en.hasMoreElements())
	{
		 System.out.println(en.nextElement());
	}       
   }
}
