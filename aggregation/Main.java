abstract class Parent
{
       abstract int b;  //not allowed
       int a=10;
        Parent()
       {
             System.out.println("Parent class");
       }
       void fun()
       {
             System.out.println("not abstract fun method");
       }
       abstract void run();
       public static void main1()
       {
              
             System.out.println("MAIN method");
       }
}
class Child extends Parent
{
       
      
       void run()
       {
             System.out.println("abstract run method");
       }
}
class Main
{
       public static void main(String arg[])
       {
               Child obj=new Child();
              obj.run();
               obj.fun();
               obj.main1();
              System.out.println(obj.a);
             
       }
}