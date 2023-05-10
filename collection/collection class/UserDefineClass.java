import java.util.*;
class Student implements Comparable<Student>
{
	public String name;
	public Student(String name)
	{
		this.name=name;
	}
	public int compareTo(Student person)
	{
		return name.compareTo(person.name);
	}
}
class UserDefineClass
{
	public static void main(String arg[])
	{
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("Varu"));
		al.add(new Student("Saurav"));
		al.add(new Student("Mukesh"));
		al.add(new Student("Tahir"));
		
		Collections.sort(al);
		for(Student s : al)
		{
			System.out.println(s.name);
		}
	}
}