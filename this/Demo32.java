//"this"USE IN INSTANCE VARAIBLE
class Demo32
{
    int roll;
    String name;
    double marks;
    
    void get (int roll,String name,double marks)
    {
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    void display()
   {
         System.out.println(roll+"  "+name+"  "+marks);
   }
   public static void main(String arg[])
  {
      Demo32 d1=new Demo32();
      Demo32 d2=new Demo32();
      d1.get(1,"nik",98.67);
      d2.get(2,"nil",87.58);
      d1.display();
      d2.display();
  }
}