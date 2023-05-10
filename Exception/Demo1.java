class Demo1
{
	 void get()
                   {
    	      System.out.println("First Result");
    	 try
    	 {
    		 String s=null;
                                     System.out.println(s.length());
        	
    	 }
    	 catch(NullPointerException e)
    	 {
    		 System.out.println("Second Result");
    	 }
               }              
     
	public static void main(String arg[])
	{
		 Demo1 d=new Demo1();
    	                     d.get();

	}

}
