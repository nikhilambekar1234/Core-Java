//FUNCTION
class Demo8
{
     int rollno;
     String name;
    
     void get(int r,String n)
    {
       rollno=r;
       name=n;

    }
    void show()
    {
       System.out.println(rollno +"  "+name);

    }
    public static void main(String args[])
    {
        Demo8 d1=new Demo8();
        Demo8 d2=new Demo8();
         d1.get(4,"kin");
        d2.get(5,"sir");
      
        d1.show();
        d2.show();
        
        
    }
}