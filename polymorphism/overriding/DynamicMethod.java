//DYNAMIC METHOD DISPATCH
class Phone
{
    public void showTime()
	{
        System.out.println("Time is 8 am");
    }
    public void on()
	{
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone
{
    public void music()
	{
        System.out.println("Playing music...");
    }
   @Override
    public void on()
	{
        System.out.println("Turning on SmartPhone...");
    }
}
public class DynamicMethod
 {
    public static void main(String[] args) 
    {

        Phone obj = new SmartPhone(); // Yes it is allowed      UPCASTING
        // SmartPhone obj2 = new Phone(); // Not allowed       DOWNCASTING

        obj.showTime();
        obj.on();
        //obj.music(); //Not Allowed due to phone reference
         
        SmartPhone obj2 = new SmartPhone();
                            obj2.music();


    }
}
