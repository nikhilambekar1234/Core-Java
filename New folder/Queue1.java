import java.util.*;  
class Queue1
{  
      public static void main(String args[])
    {  

         PriorityQueue<String> queue=new PriorityQueue<String>();  
         queue.add("Amit");  
         queue.add("Vijay");  
         queue.add("Karan");  
         queue.add("Jai");   
         queue.add("Rahul"); 

           System.out.println("head: "+queue.element()); 
        //  System.out.println("Remove: "+queue.remove()); 
           System.out.println("head: "+queue.peek()); 
         // System.out.println("head: "+queue.poll()); 
            
              System.out.println("Iterating the queue element"); 
              Iterator itr=queue.iterator();
              while(itr.hasNext())
              {
                   System.out.println(itr.next());
              }
             queue.remove();
              queue.poll();

               System.out.println("Afte removing two elements"); 
               Iterator<String> itr2=queue.iterator();
              
              while(itr2.hasNext())
              {
                   System.out.println(itr2.next());
              }
     }   
}  


