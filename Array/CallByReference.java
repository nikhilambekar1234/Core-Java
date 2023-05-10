/*In case of call by reference original value is changed if we made changes in the called method.
 If we pass object in place of any primitive value, original value will be changed. In this example we are passing object as a value.
*/
class CallByReference
{
	int data=50;
	void change(CallByReference op)
	{
		op.data=op.data+100;          //changes will be in the instance variable 
	}
	public static void main(String arg[])
	{
		CallByReference op=new CallByReference();
		
		System.out.println("before change = "+op.data);
		op.change(op);  //passing object
		System.out.println("after change  = "+op.data);
	}
}