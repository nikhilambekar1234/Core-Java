//2) THIS () CAN BE USED TO INVOKED CURRENT CLASS CONSTRUCTOR.
//RULE: CALL TO THIS() MUST BE THE FIRST STATEMENT IN CONSTRUCTOR.
class ConstructorCall
{  
	int id;  
	String name;  
	String city;  
	    ConstructorCall()
        {  
	        System.out.println("Default Constructor");
	    }  
	    ConstructorCall(int id,String name)
        {   
		    this();  
			
		    this.id = id;  
	        this.name = name;  
	    }  
	    ConstructorCall(int id,String name,String city)
        {  
		    
		    this(id,name);                                                               //now no need to initialize id and name  
	        this.city=city;  
	    }  
	    void display()
        {
		//	this();         // ERROR MUST BE FIRST STATEMENT AND IN CONSTRUCTOR
			
			System.out.println(id+" "+name+" "+city);
        }  
	    public static void main(String args[])
        {  
	        ConstructorCall e1 = new ConstructorCall(111,"karan");  
	        ConstructorCall e2 = new ConstructorCall(222,"Aryan","delhi");  
	        e1.display();  
	        e2.display();  
	   }  
}  
