class Test5
{
         void run()
         {
             /*  int age=15;
               if(age<18)
               {
                    throw new ArithmeticException("not valid");  //explicitly throw
               }
               else
              {
                    System.out.println("valid");
             }
             */  
              String s=null;
               System.out.println(s.length());
               // throw new NullPointerException("not valid");     //not required because implicitly throw
          }
        void fun()
         {
              run();
         }
         void get()
         {
               fun();
         }
         public static void main(String arg[])
         {
            Test5 obj=new Test5();
            try
            {
               obj. get();
               
            }
            
            catch(Exception e)
            {
                   System.out.println(e);
                  System.out.println("exception handle");
            }
            System.out.println("END CODE");
             
             
         }
}