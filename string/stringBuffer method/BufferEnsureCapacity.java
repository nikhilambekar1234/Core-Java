/*7) StringBuffer ensureCapacity() method
The ensureCapacity() method of StringBuffer class ensures that the given capacity is the minimum to the current capacity. If it is greater than the current capacity,
 it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.
*/
class BufferEnsureCapacity
{
	public static void main(String arg[])
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());  //default 16
		sb.append("Hello");
		System.out.println(sb.capacity());//now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity()); //now(16*2)+2=34 i.e(oldcapacity*2)+2
		sb.ensureCapacity(10);//now no change
		System.out.println(sb.capacity());//now 34
		sb.ensureCapacity(50);//now(34*2)+2
		System.out.println(sb.capacity());//now 70
	}
}