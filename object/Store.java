/*You have to implement a library using Java Class "Library"
Methods: addBook, issueBook, returnBook, showAvailableBooks
 Properties: Array to store the available books,
 Array to store the issued books*/
		
class Library
{
	String[] books;
	int noofbooks=0;
	
	Library()
	{
		books=new String[5];
	}
	void addbook(String Book)
	{
		
		books[noofbooks]=Book;
		noofbooks++;
		System.out.println(Book);
	}
	void availablebook()
	{
		System.out.println("Available books");
		for(int i=0;i<=noofbooks;i++)
		{
			if(books[i]==null)
			{
				continue;
			}
			System.out.println(books[i]);
		}
		/*for (String book : books)
		{
			if(book == null)
			{
				continue;
			}
			System.out.println("*" + book);
		}*/
	
	}
	void issuebook(String book)
	{
		/*for(int i = 0;i<this.books.length;i++)
		{
			if(this.books[i].equals(book))
			{
				System.out.println("The book has been issued! "+book);
				this.books[i] = null;
				return;
			 }
		 }
		System.out.println("This book does not exist");
		*/
		for(int i = 0;i<=noofbooks;i++)
		//for(int i = 0;i<books.length;i++)
		{
			//if(books[i]==book)
			if(books[i].equals(book))
			{
				System.out.println("The book has been issued! "+book);
				books[i] = null;
				return;
			 }
		 }
		System.out.println("This book does not exist");
	}
	void returnBook(String book)
	{
		System.out.println("returnBook=");
		addbook(book);
	}
}
class Store
{
	public static void main(String arg[])
	{
		Library s=new Library();
	
	    System.out.println("Added books");
	    s.addbook("C");
	    s.addbook("C++");
	    s.addbook("JAVA");
		
		s.availablebook();
		
		s.issuebook("C++");
		
		s.availablebook();
		
		s.returnBook("C++");
		
		s.availablebook();
	}
	
	
}