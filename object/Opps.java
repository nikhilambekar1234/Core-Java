/*1:-Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)
2-Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
3-Create a class Square with a method to initialize its side, calculating area, perimeter etc.
4-Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
*/
//package com.company;
class Employee
{
    int salary;
    String name;
     public int getSalary()
	{
        return salary;
    }
    public String getName()
	{
        return name;
    }
    public void setName(String n)
	{
        name = n;
    }
}
class CellPhone
{
    public void ring()
	{
        System.out.println("Ringing...");
    }
    public void vibrate()
	{
        System.out.println("Vibrating...");
    }
    public void callFriend()
	{
        System.out.println("Calling Mukul...");
    }
}
class Square
{
    int side;
    public int area()
	{
        return side*side;
    }
    public int perimeter()
	{
        return 4*side;
    }
}
class Tommy
{
    public void hit()
	{
        System.out.println("Hitting the enemy");
    }
    public void run()
	{
        System.out.println("Running from the enemy");
    }
    public void fire()
	{
        System.out.println("Firing on the enemy");
    }
}
public class Opps
 {
    public static void main(String[] args)
	{
        
        // Problem 1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
        System.out.println("---------------------------------------------");
		
        // Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();
        System.out.println("---------------------------------------------");
  
        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        System.out.println("---------------------------------------------"); 

        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}