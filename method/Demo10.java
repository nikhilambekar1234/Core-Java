//ACCESS INSTANCE VARIABLE
class Demo10
{
    int a=10;
    public static void main(String arg[])
    {
        Demo10 d=new Demo10();
        System.out.println(d.a);
        
        Demo10 d2=new Demo10();
        System.out.println(d2.a);
    }
}