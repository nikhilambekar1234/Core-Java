//MULTIPLE OBJECT BY COMMA
 class Demo22
{
   int roll;
   String name;
  
   Demo22(int n,String m)
  {
     roll=n;
     name=m;
  }
  void display()
  {
     System.out.println(roll+"  "+name);
  }
  public static void main(String arg[])
  {
     Demo22 d1=new Demo22(2,"nik"),d2=new Demo22(3,"nil");       //multiple type object by comma
     d1.display();
     d2.display();
  }
}
