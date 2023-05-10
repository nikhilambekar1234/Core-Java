//INSTANCE AND LOCAL VARIABLE
class Demo6
{
     int a=10;
    
     public static void main(String a[])
     {
        int b=20;
        System.out.println("Value of local = "+b);
        System.out.println("Value of instance = "+a);
        Demo6 d=new Demo6();
        System.out.println("Value of instance = "+d.a);
     }
}