package FileHandling;

public class Final 
{
    final int age=18;
    void display()
    {
    	//reassinging value to age variable
    	//gives compile time error
    	age=55;
    	System.out.println("age="+age);
    }
	public static void main(String[] args) 
	{
		Final obj=new Final();
		obj.display();

	}

}
