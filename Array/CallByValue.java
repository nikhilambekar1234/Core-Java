/*There is only call by value in java, not call by reference. If we call a method passing a value, it is known as call by value.
 The changes being done in the called method,is not affected in the calling method.
Example of call by value in java
In case of call by value original value is not changed. Let's take a simple example:
*/
class CallByValue
{
	int data=50;
	void change(int data)
	{
		data=data+100;          //changes will be in the local variable only
	}
	public static void main(String arg[])
	{
		CallByValue op=new CallByValue();
		
		System.out.println("before change = "+op.data);
		op.change(500);
		System.out.println("after change  = "+op.data);
	}
}