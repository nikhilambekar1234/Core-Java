 class CloneMethod implements Cloneable
{
        int i=10;
		int j=20;
 
       public static void main(String arg[]) throws CloneNotSupportedException
       {
               CloneMethod t1=new CloneMethod();
               CloneMethod t2=(CloneMethod)t1.clone();
			   
			   t2.i=888;
			   t2.j=999;

              System.out.println(t1.i+"  "+t1.j);
         
       }
}