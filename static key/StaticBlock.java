//STATIC BLOCK
//NOTE 1-	Is used to initialize the static data member.
//NOTE 2-	It is executed before main method at the time of classloading

class StaticBlock
{  
     static int a;
	 
     static
    {
	     a=20;
	     System.out.println("static block is invoked");
    }  
     public static void main(String args[])
    {  
                System.out.println("Hello main");  
    }  
}  
