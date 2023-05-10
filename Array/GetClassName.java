/*What is the class name of java array?
In java, array is an object. For array object, an proxy class is created whose name can be obtained by getClass().getName() method on the object.
*/
class GetClassName
{
	public static void main(String arg[])
	{
		int arr[]={4,4,5};
		Class c=arr.getClass();
		String name=c.getName();
		
		System.out.println(name);
	}
}