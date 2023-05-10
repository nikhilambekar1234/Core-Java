import java.util.Scanner;
class ScannerTest
{
         public static void main(String arg[])
         {
                  Scanner sc=new Scanner(System.in);
                  
                 Scanner sc1=new Scanner(System.in);
                  

                //   System.out.println("enter address");
                //  String address=sc.nextLine();                         //string with space

                  System.out.println("enter roll");
                  int roll=sc.nextInt();

                   System.out.println("enter name");
                  String name=sc.next();                             //string without space

                  System.out.println("enter fee");
                  Double fee=sc.nextDouble();
                  
                 

                  System.out.println("enter address");
                 String address=sc1.nextLine();   

                 //   System.out.println("    address = "+address+"roll = "+roll+"    name = "+name+"    fee = "+fee);
                      System.out.println("roll = "+roll+"    name = "+name+"    fee = "+fee+"    address = "+address);


                     sc.close();

         }
}