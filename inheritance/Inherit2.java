//Create a class circle and use inheritance to create another class cylinder from it .//Create a method for area and volume in 1
//package com.company;
class Circle
{
    public int radius;
    
    void getdata(int r)
	{
                this.radius = r;
    }
    public double area()
	{
        return Math.PI*radius*radius;
    }
}
class Cylinder1 extends Circle
{
    int height;
    void setdata(int r, int h)
	{
		getdata(r);
        height = h;
    }
    public double volume()
	{
        return Math.PI*radius*radius*height;
    }
}
public class Inherit2
 {
    public static void main(String[] args) {
        // Problem 3
        // Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1();
		obj.setdata(5,3);
		System.out.println(obj.area());
		System.out.println(obj.volume());
    }
}
