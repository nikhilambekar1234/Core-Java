//DEFAULT METHOD
interface Animal
{
    // Default method
	//void say()  ERROR interface abstract method can not have body
    default void say()
	{
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void bark();
}
public class Default implements Animal
{
    @Override
    public void bark()
	{
        System.out.println("Dog barks!");
    }
    public static void main(String[] args) 
	{
        Default obj1 = new Default();
        obj1.bark();
        obj1.say();
     }
}