//FUNCTION
class Demo11
{
    int l;
    int w;
    int radius;
    
    void rect(int a,int b)
    {
        l=a;
        w=b;
    }
    void squ(int s)
    {
        l=s;
        w=s;
    }
     void circ(int r)
    {
        radius=r;
    }
    void rectangle()
    {
        System.out.println(l*w);
    }
    void square()
    {
        System.out.println(l*w);
    }
    void circle()
    {
        System.out.println(3.14*radius*radius);
    }
    public static void main(String agrs[])
    {
       Demo11 r1=new Demo11();
       Demo11 r2=new Demo11();

       Demo11 r3=new Demo11();
       Demo11 r4=new Demo11();

       Demo11 r5=new Demo11();
       Demo11 r6=new Demo11();
        
 
       r1.rect(4,8);
       r2.rect(10,20);
       r3.squ(2);
       r4.squ(3);
       r5.circ(5);
       r6.circ(4);

       r1.rectangle();
       r2.rectangle();

       r3.square();
       r4.square();

       r5.circle();
       r6.circle();
       
    }
}