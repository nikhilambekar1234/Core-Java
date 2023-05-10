//WITHOUT STATIC VARIABLE
class WithoutStaticVariable
{
     int roll;
     String name;
     String collage="ITS";    //GET MEMORY FOR EACH OBJECT
 
     WithoutStaticVariable(int r,String n)
     {
              roll=r;
              name=n;
     }
     
     void display()
     {
            System.out.println(roll+"  "+name+"  "+collage);
		//	System.out.println(WithoutStaticVariable.getObjectSize(new WithoutStaticVariable));
     }

     public static void main(String arg[])
     {
            WithoutStaticVariable s1=new WithoutStaticVariable(1,"nik");
            WithoutStaticVariable s2=new WithoutStaticVariable(2,"nil");
			System.out.println(WithoutStaticVariable.getObjectSize(new WithoutStaticVariable));

           s1.display();
           s2.display();
     }
   
}