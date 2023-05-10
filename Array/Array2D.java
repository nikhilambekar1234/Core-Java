/*Syntax to Declare Multidimensional Array in java
1.	dataType[][] arrayRefVar; (or)  
2.	dataType [][]arrayRefVar; (or)  
3.	dataType arrayRefVar[][]; (or)  
4.	dataType []arrayRefVar[];   
*/
class Array2D
{
          public static void main(String args[])
          {
                  //declaring and initializing 2D array  
                   int arr[][]={{1,2,3},{2,4,5},{4,4,5}};

                 

                   int arr1[][]=new int[3][3];
                   arr1[0][0]=1;
                   arr1[0][1]=2;
                   arr1[0][2]=3;
                   arr1[1][0]=4;
                   arr1[1][1]=5;
                   arr1[1][2]=6;
                   arr1[2][0]=7;
                   arr1[2][1]=8;
                   arr1[2][2]=9;

                      for(int i=0;i<3;i++)
                      {
                            for(int j=0;j<3;j++)
                            {
                                  System.out.print(arr[i][j]+"  ");
                            }
                             System.out.println();
                      }
                      System.out.println("ARRAY2");
                      for(int i=0;i<3;i++)
                      {
                            for(int j=0;j<3;j++)
                            {
                                  System.out.print(arr1[i][j]+"  ");
                            }
                             System.out.println();
                      }
                  
          }
}