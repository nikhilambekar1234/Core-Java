class ArrayCopy1
{
	public static void main(String arg[])
	{
		int[] copyFrom={1,2,3,4,5,6};
		
		int[] copyTo=new int[7];
		
		System.arraycopy(copyFrom,2,copyTo,0,3);
		for(int i=0;i<=5;i++)
		{
			System.out.println();
		}
	}
}