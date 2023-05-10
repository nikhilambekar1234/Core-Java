import java.util.*;
class Books
{
	int id;
	String name,author,publisher;
	int quantity;
	public Books(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class ListBook
{
	public static void main(String arg[])
	{
		//creating list of Books
		List<Books> list=new ArrayList<Books>();
		
		//creating books
		Books b1=new Books(101,"Let us C","Yashwant kantekar","BPB",8);
		Books b2=new Books(102,"Data communication","","BPB",5);
		Books b3=new Books(103,"Operating system","Galvin","Wiley",6);
		
		//adding books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		//traversing list
		for(Books b : list)
		{
			System.out.println(b.id+"  "+b.name+"  "+b.author+"  "+b.publisher+"  "+b.quantity);
		}
	}
}