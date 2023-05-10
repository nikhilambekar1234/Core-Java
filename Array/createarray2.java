//1-creat array with 10 element
import java.util.Scanner;
class createarray2
{
      public static void main(String arg[])
      {
          int arr[]=new int[5],i;   //declaration, instantiation
          int arr1[]={1,2,3,5,6};  //declaration, instantiation and initialization  
        
     
          arr[0]=5;       // initialization  
          arr[1]=8;
          arr[2]=10;
          arr[3]=2;
          arr[4]=4;
          

          System.out.println("your array");
          for(i=0;i<arr.length;i++)                       //length is the property of array
          {
                System.out.println(arr[i]);
          }
          System.out.println("your array1");
          for(i=0;i<arr1.length;i++)
          {
                System.out.println(arr1[i]);
          }
     
      }
}