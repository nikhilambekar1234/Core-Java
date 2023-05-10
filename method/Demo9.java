//FUNCTION
class Demo9
{
     int rollno;
     String name;
    
     void get(int r,String n)
    {
       rollno=r;
       name=n;
       System.out.println(rollno   +"  "+name);
    }
    public static void main(String args[])
    {
        Demo9 d1=new Demo9();
        Demo9 d2=new Demo9();
         d1.get(4,"kin");
         d2.get(5,"sir");
    }
}