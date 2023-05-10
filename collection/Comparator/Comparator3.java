import java.util.*;
import java.io.*;
class Comparator3
{  
       public static void main(String args[])
      {  
             ArrayList<Student3> al=new ArrayList<Student3>();    
             al.add(new Student3(101,"Vijay",23));    
             al.add(new Student3(106,"Ajay",27));    
             al.add(new Student3(105,"Jai",21));  
 
           //Sorting elements on the basis of name  
             Comparator<Student3> cm1=Comparator.comparing(Student3::getName);  
            Collections.sort(al,cm1);  

            System.out.println("Sorting by Name");  
            for(Student3 st: al)
           {  
                System.out.println(st.rollno+" "+st.name+" "+st.age);  
           }  

          //Sorting elements on the basis of age  
          Comparator<Student3> cm2=Comparator.comparing(Student3::getAge);  
          Collections.sort(al,cm2);  

          System.out.println("Sorting by Age");  
          for(Student3 st: al)
         {  
              System.out.println(st.rollno+" "+st.name+" "+st.age);  
          }    
  
            
       }  
}  