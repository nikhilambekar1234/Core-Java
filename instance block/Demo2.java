//INITILIZER BLOCK
class Demo2
{
       int a;
        Demo2()
       {
            System.out.println(a);
            System.out.println("Hello");
       }
       Demo2(int a)
       {
              this.a=a;
       }
       {
             System.out.println("Hii");  
       }
       public static void main(String arg[])
       {
               Demo2 d=new Demo2(4);
                Demo2 d1=new Demo2();
       }
}