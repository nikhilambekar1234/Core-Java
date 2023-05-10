//STATIC METHOD CALL BY STATIC METHOD
class Calculate
{  
     static int cube(int x)
     {  
	  return x*x*x;  
     }  
	 static int square(int y)
     {  
	  return y*y;  
     } 
	 public static void main(String args[])
    {
	  int result=Calculate.cube(5);  // not call to non-static method by class name reference
	  System.out.println(result);  
	  
	  int result1=  square(10);
	  System.out.println(result1); 
	  
	  Calculate c=new Calculate();
	  int result2=c.square(7);
	  System.out.println(result2); 
    }  
}  
