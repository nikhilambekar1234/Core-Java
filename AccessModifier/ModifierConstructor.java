class Access
{
      //  private Access(){}              //private constructor not access
        //protected Access(){}            // access
       // Access(){}                           // access
          public Access(){}                 //access
         void msg()
        { 
              System.out.println("Hello java"); 
        }
}
public class ModifierConstructor
{
        public static void main(String arg[])
        {
               Access obj=new Access();
               obj.msg();
        }
}