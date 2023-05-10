public class ToolJavap1
{
	//main method
	public static void main(String arg[])
	{
		//declaring an integer array
		int arr[]={6,7,8,6,8,0,4};
		
		//caculating size of the array
		int size=arr.length;
		
		//printing size of the array
		System.out.println("The size of the array is "+size);
		
		System.out.println("The 8th index of the array  is "+arr[8]);
	}
}
//javap -c ToolJavap1
//javap -l ToolJavap1
//javap -s ToolJavap1
//javap -sysinfo ToolJavap1
//javap -constants ToolJavap1
//javap -version ToolJavap1