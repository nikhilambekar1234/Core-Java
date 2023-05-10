class Demo2
{
	 void get()
                   {
    	      System.out.println("First Result");
    	 try
    	 {
    		 String s="abc";
                                     int i=Integer.parseInt(s);
        	
    	 }
    	 catch(NumberFormatException e)
    	 {
    		 System.out.println("Second Result");
    	 }
               }              
     
	public static void main(String arg[])
	{
		 Demo2 d=new Demo2();
    	                     d.get();

	}

}
