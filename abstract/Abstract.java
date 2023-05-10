//ABSTRACT CLAS AND METHOD
abstract class Principal
{
	Principal()
	{
		System.out.println("I am principal");
	}
	void sing()
	{
		System.out.println("I am singing");
	}
	abstract void play1();
	abstract void play2();
}
class Hod extends Principal
{
	@Override
	 void play1()
	{
		System.out.println("I am play1");
	}
	@Override
	 void play2()
	{
		System.out.println("I am play2");
	}
}
//class Teacher extends Principal  // NOT WRITE LIKE:- teacher is not abstract and does not override abstract method error
abstract class Teacher extends Principal // abstract can not be instantiated error
{
	void teach()
	{
		System.out.println("I am teacher");
	}
}
class Abstract
{
	public static void main(String arg[])
	{
		Hod h=new Hod();
		h.play2();
		h.sing();
		System.out.println("------------------------------------------------------");
		Principal p=new Hod();  //REFERENCE OF ABSTRACT CLASS
		p.sing();
		p.play1();
       //Teacher t=new Teacher(); //abstract can not be instantiated error
		//t.teach();
	}
}