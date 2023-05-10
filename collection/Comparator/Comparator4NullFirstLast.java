import java.util.*;

class Comparator4NullFirstLast
{  
       public static void main(String args[])
      {  
             ArrayList<Student4> al=new ArrayList<Student4>();    
             al.add(new Student4(101,"Vijay",23));    
             al.add(new Student4(106,"Ajay",27));    
             al.add(new Student4(105,null,21));  
 
            
             Comparator<Student4> cm1=Comparator.comparing(Student4::getName,Comparator.nullsFirst(String::compareTo));  
            Collections.sort(al,cm1);  

            System.out.println("Consider null to be less than no-null");  
            for(Student4 st: al)
           {  
                System.out.println(st.rollno+" "+st.name+" "+st.age);  
           }  

          
          Comparator<Student4> cm2=Comparator.comparing(Student4::getName,Comparator.nullsLast(String::compareTo));  
          Collections.sort(al,cm2);  

          System.out.println("Consider null to be greater than no-null");  
          for(Student4 st: al)
         {  
              System.out.println(st.rollno+" "+st.name+" "+st.age);  
          }    
  
            
       }  
}  