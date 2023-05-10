class LocalInner
{
	private  int n=25;
	void get()
	{
		class LInner
		{
			int num=20;   //local variable must be final till jdk 1.7 only  
			void print()
			{
				System.out.println(n);
				System.out.println(num);
			}
		}
		LInner in=new LInner();
		in.print();
	}
	public static void main(String arg[])
	{
		LocalInner out=new LocalInner();
		out.get();
	}
}