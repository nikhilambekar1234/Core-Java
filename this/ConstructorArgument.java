//5) THE THIS KEYWORD CAN BE PASSED AS ARGUMENT IN THE CONSTRUCTOR CALL.
//NOTE-WE CAN PASS THIS KEYWORD IN THE CONSTRUCTOR ALSO. IT IS USEFUL IF WE HAVE TO USE ONE OBJECT IN MULTIPLE CLASSES
class ConstruArg
{ 
   ConstructorArgument arg;
  
   ConstruArg (ConstructorArgument arg)
   {
       this.arg=arg;
   }
  void show()
   {
	   System.out.println(arg.num+"  "+arg.alpha);
   }
    
}
class ConstructorArgument
{
     int num=100;
	String alpha="xyz";
    ConstructorArgument()
    {
        ConstruArg b=new ConstruArg(this);               //this refer to current class object
	    b.show();
    }
    public static void main(String arg[])
    {
         ConstructorArgument a2=new ConstructorArgument();
       //ConstruArg b=new ConstruArg(this); //Error non static variable this can not be refernced from static context
	 
    }
    
}
