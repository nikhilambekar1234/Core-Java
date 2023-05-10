//Java String split() method example
//The given example returns total number of words in a string excluding space only. It also includes special characters

class StringSplit
{
	public static void main(String arg[]) 
	{
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");   //splits the string based on string  
		//using java foreach loop to print elements of string 
		for(String w:words)
		{
			System.out.println(w);
		}
	}
}