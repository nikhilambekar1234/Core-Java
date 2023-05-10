//VALIDATION FORM
import java.util.Scanner;
class Name_validation12
{
       //validation for  first name
         public boolean firstName(String first)
        {
             String firstName="[A-Z][a-z]*";
            boolean b1=first.matches(firstName);
           // System.out.println(b1);
            return b1;
        }
        //validation for  last name
         public boolean lastName(String last)
        {
             String lastName="[A-Z][a-z]*";
            boolean b2=last.matches(lastName);
           // System.out.println(b2);
            return b2;
        }
      
} 
public class Test
{
       public static void main(String arg[])
       {
              Scanner sc=new Scanner(System.in);
              System.out.println("enter a first name");
             String firstName=sc.next();
              System.out.println("enter a last name");
            String  lastName=sc.next();

              Name_validation12 nv=new Name_validation12();
              boolean a1=nv.firstName(firstName);

             Name_validation12 nv2=new Name_validation12();
              boolean a2=nv2.lastName(lastName);
             
            System.out.println("\n The name is: "+firstName+" "+lastName);
            System.out.println(a1+"  "+a2);    
       }
}