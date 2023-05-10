import java.util.*;
import java.util.Vector;
import java.util.Enumeration;

public class VectorConvert
 {

   public static void main(String args[]) 
   {
      
      Vector<String> vec = new Vector<String>();

      /* Adding elements to a vector*/
      vec.addElement("Apple");
      vec.addElement("Orange");
      vec.addElement("Mango");
      vec.addElement("Fig");
	   vec.addElement("Orange");
      vec.addElement("Banana");
      vec.addElement("Apple");

          //Converting Vector to ArrayList
     ArrayList<String> arraylist = new ArrayList<String>(vec);
 
     //Displaying ArrayList Elements
     System.out.println("\nArrayList Elements :");
     for (String s : arraylist)
	 {
        System.out.println(s);
     }
	  System.out.println("-----------------------------");
	     //Converting Vector to String Array
    String[] array = vec.toArray(new String[vec.size()]);
 
    //Displaying Array Elements
    System.out.println("String Array Elements :");
    for(int i=0; i < array.length ; i++)
	{
       System.out.println(array[i]);
    }

   }
}
