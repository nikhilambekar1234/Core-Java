class Demo
{
	 void get()
                   {
    	      System.out.println("First Result");
    	 try
    	 {
    		 int c=50/0;
        	
    	 }
    	 catch(ArithmeticException e)
    	 {
    		 System.out.println("Secon Result");
    	 }
               }              
     
	public static void main(String arg[])
	{
		 Demo d=new Demo();
    	                     d.get();

	}

}
