//COUNTER BY STATIC VARIABLE
//NOTE-static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value.
class Counter1
{
     static int count=0;  //will get memory only once and retain its value  
 
     Counter1()
     {
               count++;
               System.out.println(count);
         
     }
     public static void main(String arg[])
     {
             Counter1 s1=new Counter1();
            Counter1 s2=new Counter1();
            Counter1 s3=new Counter1();
     }
   
}