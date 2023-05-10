class Demo3
{
	 void get()
                   {
    	      System.out.println("First Result");
    	 try
    	 {
    		 int a[]=new int[5];
                                     a[10]=13;
                                    
                                    
        	
    	 }
    	 catch(ArrayIndexOutOfBoundsException e)
    	 {
    		 System.out.println("Second Result");
    	 }
               }              
     
	public static void main(String arg[])
	{
		 Demo3 d=new Demo3();
    	                     d.get();

	}

}
