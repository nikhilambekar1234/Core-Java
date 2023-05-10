//Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible 
class Rectangle
{
	int length;
	int width;
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	int area1()
	{
		return length*width;
	}
}
class Cuboid extends Rectangle
{
	Cuboid(int l,int b)
	{
		super(l,b);
		length=l;
	}
	int volume()
	{
		return length*length*length;
	}
}
class Main
{
	public static void main(String arg[])
	{
		Cuboid c=new Cuboid(4,6);
		System.out.println(c.area1());
		System.out.println(c.volume());
	}
}