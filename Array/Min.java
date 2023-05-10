//Passing Array to method in java
class Min
{
          void min(int arr[])
       //static void min(int arr[])             //static method
       {
              int min=arr[0];
              for(int i=0;i<arr.length;i++)
               {
                      if(arr[i]<min)
                      {
                             min=arr[i];
                       }
               }
               System.out.println(min);
       }
        public static void main(String arg[])
        {
               Min obj=new Min();
               int a[]={33,3,4,5};
               //min(a);                       //call without object to static method
                obj.min(a);
            
        }
}