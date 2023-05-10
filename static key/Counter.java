//COUNTER WITHOUT STATIC VARIABLE
/*NOTE-instance variable gets the memory at the time of object creation, each object will have the copy of the instance variable,
 if it is incremented, it won't reflect to other objects. So each objects will have the value 1 in the count variable.*/
class Counter
{
     int count=0;
 
     Counter()
     {
               count++;
               System.out.println(count);
         
     }
     public static void main(String arg[])
     {
             Counter s1=new Counter();
            Counter s2=new Counter();
            Counter s3=new Counter();
	}
   
}