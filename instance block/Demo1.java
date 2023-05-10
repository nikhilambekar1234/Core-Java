//INITILIZER BLOCK
/*Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created.
The initialization of the instance variable can be directly but there can be performed extra operations while initializing the instance variable in the
 instance initializer block.
*/
class Demo1
{
       int a;
        Demo1()
       {
            System.out.println(a);
          
       }
       Demo1(int a)
       {
              this.a=a;
       }
       {
             a=10;
       }
       public static void main(String arg[])
       {
               Demo1 d=new Demo1(4);
               
       }
}