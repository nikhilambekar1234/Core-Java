//ABSTRACT CLASS AND METHOD

//package com.company;
abstract class Parent2
{
    public Parent2()
	{
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello()
	{
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2
{
    @Override
    public void greet()
	{
        System.out.println("Good morning");
    }
    @Override
    public void greet2()
	{
        System.out.println("Good afternoon");
    }
}
// class Child3 extends Parent2           //  NOT WRITE LIKE :-error Class3 either be declared abstract or override method
abstract class Child3 extends Parent2
{
    public void th()
	{
        System.out.println("I am good");
    }
}
public class abstractClassMethod
 {
    public static void main(String[] args) 
	{
       // Parent2 p = new Parent2(); //-- error
	//    p.sayHello();           //can not be instantiated error
		 Child2 c = new Child2();
		 c.greet();
      // Child3 c3 = new Child3(); //-- error
	   
		
    }
}
