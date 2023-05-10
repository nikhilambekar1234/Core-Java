//WITH STATIC METHOD
//NOTE-1-static method belongs to the class , not to the object
//2-static method can be accessed directly by class name and does not need any object
//3-static method can access only static data it cannot access non static data(instance variable)
//4-static method can call only other static method and cannot call a non static method
//5-static method can not refer to "this" or "super" keyword in company
class StaticMethod
{
     int roll;
     String name;
    static String collage="ITS";//STATIC VARIABLE
 
     StaticMethod(int r,String n)
     {
              roll=r;
              name=n;
     }
     
    static void get()   //STATIC METHOD
     {
             collage="mech";
     }
    
     void display()
     {
            System.out.println(roll+"  "+name+"  "+collage);
     }

     public static void main(String arg[])
     {
            StaticMethod.get();
            StaticMethod s1=new StaticMethod(1,"nik");
            StaticMethod s2=new StaticMethod(2,"nil");

        //  s1.get();
         // s2.get();

           s1.display();
           s2.display();
     }
   
}