class StaticVar
{
	 static int a=10;         //     NOTE - class level variable//    static variable belongs to class ; not an object
	 int b=20;
     void fun()
	{
	//	static int c=30;     // compile time error=>     local variable not in satic
		
	}
}
//class StaticVariable1 extends StaticVar
class StaticVariable1
{
	static int d=40;
	int e=50;
	public static void main(String arg[])
	{
		StaticVar obj1=new StaticVar();
		StaticVariable1 obj2=new StaticVariable1();
		
		System.out.println(d);
        System.out.println(StaticVariable1.d);
        System.out.println(obj2.d);		
		System.out.println("--------------------------------------------");
		
   //   System.out.println(e); 	// ERROR-non static variable can not be referenece from static conetext	
	//	System.out.println(StaticVariable1.e); // ERROR-non static variable can not be referenece from static conetext	
		System.out.println(obj2.e);
		System.out.println("--------------------------------------------");
		
	//	System.out.println(a); //can not find symbol BUT in extentds access
        System.out.println(StaticVar.a);
        System.out.println(obj1.a);
		System.out.println("--------------------------------------------");
		
	//	System.out.println(b);      //ERROR-non static variable can not be referenece from static conetext after INHERIT// before can not find symbol
    //    System.out.println(StaticVariable1.b);  //ERROR-non static variable can not be referenece from static conetext after INHERIT//before can not find symbol
       System.out.println(obj1.b);		
		System.out.println("--------------------------------------------");
	}
}
