//1-creat array with 10 element
import java.util.Scanner;
class createarray
{
      public static void main(String arg[])
      {
          int arr[]=new int[10],i;
          Scanner d=new Scanner(System.in);
          System.out.println("enter element");
          for(i=0;i<10;i++)
          {
                arr[i]=d.nextInt();
          }
          System.out.println("your array");
          for(i=0;i<10;i++)
          {
                System.out.println(arr[i]);
          }
      }
}