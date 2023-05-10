//DEFAULT VALUE 0 AND NULL
class Student1
{
    int id,roll=20;
    String name,address="pune";

    public static void main(String args[])
    { 
       Student1 s1=new Student1();
       System.out.println(s1.id);
       System.out.println(s1.name);

        System.out.println(s1.roll);
       System.out.println(s1.address);
    }
}