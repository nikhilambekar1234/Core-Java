import java.util.*;
class ArrayListObject
{
	public static void main(String arg[])
	{
		Student s1=new Student(101,"Sonoo",23);
		Student s2=new Student(102,"Ravi",21);
		Student s3=new Student(103,"Hanuman",25);
		
		//creating arraylist
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);   //adding student class object
		al.add(s2);
		al.add(s3);
		
		//Getting Iterator
		Iterator itr=al.iterator();
		//traversing element of arraylist object
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.rollno+"  "+st.name+"  "+st.age);
		}
	}
}