public class practice
{       
                //PAIRS IN ARRAY:
    // public static void PrintPairs(int numbers[])
    // {
    //     int totalpairs = 0;
    //     for(  int i = 0; i<numbers.length; i++)
    //     { int CurrNum = numbers[i];
    //         for( int j = i+1;j<numbers.length;j++)
    //         {
    //             System.out.print("("+ CurrNum +", "+ numbers[j]+")");
    //             totalpairs++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("total pairs are : " + totalpairs);
    // }
    // public static void main(String args[])
    // {
    //     int numbers [] ={2,4,6,8,10};
    //     PrintPairs(numbers);


    // }

       // PRINT SUBARRAYS :
    //   
    
//      public static void SubArrays(int numbers[])
//  {
//       int CurSUM = 0;
//       int maxnum = Integer.MIN_VALUE;

//     for(int i =0;i<numbers.length;i++)
//     {
//         int start = i;
//         for(int j = i;j<numbers.length;j++)
//         {
//             int end =j;
//             CurSUM = 0;

//             for( int k =start; k<=end;k++) //print
//             {  //subarray sum
//                 CurSUM += numbers[k];
//             }
//             System.out.println(  CurSUM + " ");
//                 if( maxnum < CurSUM)
//                 {
//                     maxnum = CurSUM;
//                 }
//         }
//     }
//     System.out.println( "print max sum :" +maxnum);
//  }
//  public static void main(String args[])
//  {
//     int numbers[] ={2,4,6,8,10};
//     SubArrays(numbers);
//  }
// }
   
//   PRINT SUM OF ELEMENT OF THE ARRAY:
// public static void arrsum(int numbers[])
// {
//     int sum =0;
//     for(int i =0; i<numbers.length;i++)
//     {
//         sum += numbers[i];
//     } 
//     System.out.println( "the sum of the given array is:" +sum);

// }
// public static void main(String args[])
// {
//     int numbers[] = {2,4,6,8,10};
//        arrsum(numbers);

//  print the maximum element of the array:
//  public static void ArrMaxEle(int numbers[])
//  {
//     int max = Integer.MIN_VALUE;
//     for(int i =0;i<numbers.length; i++)
//     {
//         if(numbers[i]>max)
//         {
//             max = numbers[i];
//         }
//     }
//     System.err.println(max);
//  }
//  public static void main (String args[])
//  {
//     int numbers [] = { 3,4,5,67,98,88};
//      ArrMaxEle(numbers);
//  }
// 
// 

// 
// 
// public static void pairarr(int num[])
// {
//     int totalpairs = 0;
//     for(int i =0;i<num.length;i++)
//     {  int current = num[i];
//         for(int j = i+1;j<num.length;j++)
//         {
//             System.out.print("( "+ current +"," + num[j]+")");
//             totalpairs++;
//         }
//         System.out.println();
//     }
//     System.out.println("total pairs are :" + totalpairs);
// }
// public static void main(String args[])
// {
//     int num[] = {2,4,6,8,10};
//     pairarr(num);

// }

// public static void revarr(int arr[])
// {
//     int first = 0; int last = arr.length-1;
//     while(first<last)
//     {
//         int temp = arr[last];
//         arr[last] = arr[first];
//         arr[first] = temp;
//         first++;
//         last--;
//      }
//   }     
// public static void main(String args[])
// {
//     int arr [] = {2,3,4,5,6,7};
//     revarr(arr);
//         System.out.print(Arrays.toString(arr));


// }
// public static void pairarr(int num[])
// { int totalapirs = 0;
//    for(int i =0 ;i<num.length;i++)
//    { int current = num[i];
//       for(int j = i+1;j<num.length;j++)
//       {  int pair = num[j];
//          System.out.print("( "+ current +","+pair+")");
//        totalapirs++;
//       }
//     System.out.println(" ");
//    }
   
//    System.out.println(" total pairs are :" + totalapirs);
// }
// public static void main(String[] args) 
// {
//    int num [] = {2,4,6,8,10,12};
//    pairarr(num);
    


// public static void maxSum(int num[]) 
// {
//    int current = 0;
//    int maxsum = Integer.MIN_VALUE;

//    for(int i =0;i<num.length;i++)
//    {
//       int start = i;
//       for(int j = i; j <num.length;j++)
//       {
//          int end = j;
//          current = 0;
//          for(int k =start; k<=end;k++)
//          {
//             current = current + num[k];
//          }
//          System.err.println(current);
//          if(maxsum < current)
//          {
//             maxsum = current;
//          }
      
//       }
      
//    }
//     System.err.println("the max sum of our array is :" + maxsum);
// }
// public static void main(String[] args) 
// {
//    int num[] = {2,4,6,8,10};
//    maxSum(num);
    
// }
// }
// int arr[] = {1, 2, 3, 4};

// for (int i = 0; i < arr.length; i++) {

//     int sum = 0;

//     for (int j = i; j < arr.length; j++) {

//         sum = sum + arr[j];

//         if (sum > 5) {
//             System.out.println("Break at i=" + i + " j=" + j);
//             break;
//         }

//         if (sum % 2 == 0) {
//             System.out.println("Even Sum: " + sum);
//         } else {
//             System.out.println("Odd Sum: " + sum);
//         }
//     }

//     if (i % 2 == 0) {
//         System.out.println("Outer Even i=" + i);
//     } else {
//         System.out.println("Outer Odd i=" + i);
//     }

//     System.out.println("----");
}