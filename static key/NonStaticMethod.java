//WITHOUT STATIC METHOD
class NonStaticMethod
{
     int roll;
     String name;
     String collage="ITS";
 
     NonStaticMethod(int r,String n)
     {
              roll=r;
              name=n;
     }
     
    void get()
     {
             collage="mech";   //REDECLARATION OF INSTANCE VARIABLE
     }
    
     void display()
     {
            System.out.println(roll+"  "+name+"  "+collage);
     }

     public static void main(String arg[])
     {
            NonStaticMethod s1=new NonStaticMethod(1,"nik");
            NonStaticMethod s2=new NonStaticMethod(2,"nil");

           s1.get();
           s2.get();
           s1.display();
           s2.display();
     }
   
}