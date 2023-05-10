//CALL CONSTRUCTOR TO CONSTRUCTOR
class Demo30
{ 
     int b=20;
     Demo30()
    {
        System.out.println(b);
    }
    Demo30(int a)
    {
        
        Demo30 d= new  Demo30();
    }
   public static void main(String arg[])
  {
         Demo30 d= new  Demo30(10);
  }
}