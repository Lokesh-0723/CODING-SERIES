public class twodimensions
{

  //                 //REPRESENTATION OF A2D -ARRAY: 
  // public static boolean  Search(int matrix[][] , int key)
  // {
  //   for(int i = 0;i<matrix.length;i++)
  //     {
  //       for(int j =0;j<matrix[0].length;j++)
  //       {
  //         if(matrix[i][j] == key)
  //         {
  //            System.out.println("found at cell(" + i + "," + j + ")");
  //           return true;
  //         }
  //       }
  //     }    
  //     System.out.println("key not found");
  //     return false;
  // }
  //                    //CREATION OF 2D ARRAY: 
  //   public static void main(String args[])
  //   {
  //       int matrix[][]= new int[3][3];
  //       int n = matrix.length;
  //       int m = matrix[0].length;

  //       Scanner sc = new Scanner(System.in);
  //       for(int i =0;i<n;i++)
  //       {
  //           for(int j= 0; j<m;j++)
  //           {
  //             matrix[i][j] = sc.nextInt();
  //           }
           
  //       }
  //                  //OUTPUT: 
  //      for(int i = 0;i<n;i++)
  //      {
  //       for(int j =0;j<m;j++)
  //       {
  //         System.out.print(matrix[i][j] + " ");
  //       }
  //       System.out.println();
  //      }     
  //      Search(matrix, 5);          
  //   }
                       //SPIRAL MATRIX CODE:
     public static void SpiralMatrix(int matrix[][])
     {
      int startRow = 0;
      int startCol= 0;
      int endRow = matrix.length-1;
      int endCol = matrix[0].length-1;
      
      while(startRow<= endRow && startCol <= endCol)
      //TOP 
      { 
        for(int j =startCol; j<=endCol; j++)
        {
          System.out.print(matrix[startRow][j] + " ");

        }
      }
     }     
     public static void main(String args[])
     {

     }              
    
}