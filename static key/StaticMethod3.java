//NOTE =>   //5-STATIC METHOD CAN NOT REFER TO "THIS" OR "SUPER" KEYWORD IN COMPANY
class Method3
{
	void print()
	{
		System.out.println("i am print method");
	}
} 
class StaticMethod3 extends Method3
{
	static void get()
	{
		System.out.println("static get method");
	}
	//static void set()
	void set()
	{
		super.print();
		this.get();
	}
	public static void main(String arg[])
	{
		StaticMethod3 obj=new StaticMethod3();
		obj.set();
	}
}