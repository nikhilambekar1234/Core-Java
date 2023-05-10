//WITH STATIC VARIABLE
//NOTE=The static variable can be used to refer the common property of all objects (that is not unique for each object)
//	The static variable gets memory only once in class area at the time of class loading.
class WithStaticVariable 
{
     int roll;
     String name;
    static String collage="ITS";   //Java static property is shared to all objects.
 
     WithStaticVariable(int r,String n)
     {
              roll=r;
              name=n;
     }
     
     void display()
     {
            System.out.println(roll+"  "+name+"  "+collage);
     }

     public static void main(String arg[])
     {
            WithStaticVariable s1=new WithStaticVariable(1,"nik");
            WithStaticVariable s2=new WithStaticVariable(2,"nil");

           s1.display();
           s2.display();
     }
}