public class arraycc{
                         //ARRAY INPUT OUTPUT ABD UPDATE
//   public static void main(String argd[])
//   {
//     int marks[] = new int[100];
//     Scanner sc = new Scanner(System.in);

//     marks[0] = sc.nextInt();
//     marks[1] = sc.nextInt();
//     marks[2] = sc.nextInt();

//     System.out.println("the marks of phy is :" + marks[0]);
//     System.out.println("the marks of chem is :" + marks[1]);
//     System.out.println("the marks of math is :" + marks[2]);
//     int percentage = (marks[0] + marks[1] + marks[2]) /3;

//     System.out.println(" the percentage of child is:" + percentage +"%");
  
//   }
// }
     //updating the value of integers:
     //array uses call by refrence

  //   public static void update(int marks[])
  //   {
  //       for(int i=0;i<marks.length;i++)
  //       { marks[i] = marks[i] +1;

  //       }

  //   }
  //   public static void main(String args[])
  //   {  int marks []={98,99,100};
  //      update(marks);
  //      for(int i =0;i<marks.length;i++){
  //       System.out.print(marks[i] +" " );
  //      }
  //      System.out.println();
  //   }
  // }
                                           //LINEAR SEARCH:

  //   public static int linearsearch(int number[],int key){
  //     for( int i =0; i<number.length;i++){
  //       if(number[i]==key){
  //         return i;
  //       }
  //     }
  //     return -1; //not found

  //   }
  //   public static void main(String[] args) {
  //     int number[]={2,4,6,8,10,12,14,16};
  //     int key = 16;

  //     int index =linearsearch( number,key);
  //     if(index == -1){
  //       System.out.print(" not found");
  //     } else{
  //       System.out.print("the number is at :" + index);
  //     }

  //   }
  // }
                              //linear search algorithem in strings
//   public static int LINSEARSTRI(String fruits[], String key)
//   {
//     for(int i =0;i<fruits.length;i++)
//     {
//       if(fruits[i].equals(key))
//       {
//         return i;
//       }
//     }
//      return-1;
//   }
//   public static void main(String[] args)
//   {
//     String fruits[] = {"apple","kiwi","banana","guawa"};
//     String key = "kiwi";
//     int index = LINSEARSTRI(fruits, key);
//     if(index == -1){
//       System.out.println("key does not find out");
//     }
//     else{
//       System.out.println("the key is at index:" + index);
//     }   
//   }
// }
                         //COUNT THE OCCCURENCE OF A NUMBER:

    //  public static int co_occurence(int numbers[],int key)
    //  {   int count =0;
    //     for(int i=0;i<numbers.length;i++)
    //     {
    //         if(numbers[i] ==key)
    //         {
    //              count++;// here, if we use return count ++ instead of count ++ .
                        //When Java executes return, the function ends instantly, so the loop does not check the rest of the array
    //         }    
    //     }
    //     return count;

    //  }
    //  public static void main(String args[])
    //  {
    //     int numbers[]={2,4,6,2,7,2,9};
    //     int key = 2;
    //      int count = co_occurence(numbers, key);
       
    //         System.out.print("the count of key:" + count);
    //     }
    //  }
                         // FIND THE SMALLEST ELEMENT USING LINEAR SEARCH:

    //   public static int small_element( int numbers[]){
    //     int smallest = Integer.MAX_VALUE;// largest possible integer value
    //     for(int i=0; i<numbers.length;i++){
    //         if(smallest>numbers[i]){
    //             smallest = numbers[i];
    //         }
    //     }
    //     return smallest;// → sends the final value back to main,return sends the answer outside the function


    //   }
    //   public static void  main(String args[]){
    //     int numbers[]= {8,3,5,1,9};
    //     System.out.println(" the smallest number in the arrays is:"+ small_element(numbers));
    //   }
    // }
                            //FIND THE largest ELEMENT USING LINEAR SEARCH:
    
    // public static int getlargest(int numbers[])
    // {
    //     int largest = Integer.MIN_VALUE;  //(-infinity =Integer.MIN_VALUE=largest,, +infinty =Integer.MAX_VALUE=smallest)
    //     for( int i=0;i<numbers.length;i++)
    //     {
    //         if(largest<numbers[i])
    //         {
    //             largest = numbers[i];

    //         }
    //     }
    //     return largest;

    // }
    // public static void main(String args[])
    // {
    //     int numbers[] ={1,2,3,6,5,9,10};
    //     System.out.println("the largst number is :"+ getlargest(numbers));
    // }
   


                  // Write a Java program to find the largest number in an array of integers.
                 // The program should take an array as input and print the largest element.
    
    
    // public static int getlargest(int numbers[]) {
    //     int largest = Integer.MIN_VALUE;

    //     for (int i = 0; i < numbers.length; i++) {
    //         if (largest < numbers[i]) {
    //             largest = numbers[i];
    //         }
    //     }
    //     return largest;
    // }

    // public static void main(String args[]) {

    //     Scanner numbers = new Scanner(System.in);

    //     int numbe[] = new int[5];

    //     System.out.println("Enter 5 numbers:");

    //     for (int i = 0; i < numbe.length; i++) {
    //         numbe[i] = numbers.nextInt();
    //     }

    //     System.out.println("The largest number is: " + getlargest(numbe));
    // }
 //                 // Write a Java method getLargest(int numbers[]) that returns the largest element in the array.
 //                 // Test the method in the main() function using the array:

 //     // {4, 7, 2, 9, 5, 1}
    

 //     public static int getLargest(int numbers[]) {
 //         int largest = Integer.MIN_VALUE;

 //         for (int i = 0; i < numbers.length; i++) {
 //             if (numbers[i] > largest) {
 //                 largest = numbers[i];
 //             }
 //         }

 //         return largest;
 //     }

 //     public static void main(String args[]) {

 //         int numbers[] = {4, 7, 2, 9, 5, 1};

 //         int result = getLargest(numbers);

 //         System.out.println("The largest element is: " + result);
 //     }  

               // program to finf out both largest and smallest with the help to same program
     
    // public static void SmallestLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;
    //     for(int i =0;i<numbers.length;i++){
    //         if (numbers[i]>largest) {
    //             largest =numbers[i];  
    //         }
    //         if(numbers[i]<smallest){
    //             smallest=numbers[i];
    //         }
            
    //     }   
    //     System.out.println("the largest number is:"+ largest);
    //     System.out.println("the smallest number is:"+ smallest); 

    // }   
    
    // public static void main(String args[]){
    //     int numbers[]={4,5,6,7,8,9};
    //     SmallestLargest(numbers);

    // }
                                         //binary search:
//     public static int BinarySearch(int numbers[],int key)
//     {   int start = 0;
//         int end = numbers.length-1;
//         while(start<=end){
//             int mid =(start + end)/2;
//             if(numbers[mid]==key){
//                 return  mid;
//             }
//             if(numbers[mid]< key){
//                 start = mid+1;
//             }
//             if(numbers[mid]>key){
//                 end = mid-1;
//             }
//         }
//         return -1;

//     }

//     public static void main(String args[])
//     {  
//          int numbers[] ={ 2,4,6,8,10,12,14,16};
//          int key = 14;
//          System.out.println("the found key is:" +BinarySearch(numbers, key));
         

//     }
// }  
 
                                   //reverse an array :
//   public static void RevArray(int numbers[])
//   {
//     int first = 0;
//     int last = numbers.length-1;
//     while(first< last)  //frist (index from start), lase(index from end)
//     {
//       int temp = numbers[last];
//       numbers [last] = numbers[first]; 
//       numbers[first] = temp;
//       first ++;
//       last --;
//     }
//   }
//   public static void main(String args[])
//   {   
//     int numbers[] = { 10,8,6,4,2};
//     RevArray(num);
//
//     for( int i =0; i<numbers.length;i++)
//     {
//       System.out.print(+ numbers[i] + " ");
//     }
//     System.out.println();

//   }
// }
  
                                  // PAIRS IN ARRAY:

//     public static void PairForArrays(int number[]) {
//         int TotalPair = 0;

//         for (int i = 0; i < number.length; i++) {
//             int curr = number[i];

//             for (int j = i + 1; j < number.length; j++) {
//                 System.out.println("(" + curr + "," + number[j] + ")");
//                 TotalPair++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total Pairs = " + TotalPair);
//     }

//     public static void main(String args[]) {
//         int number[] = {2, 4, 6, 8, 10};
//         PairForArrays(number);
//     }
// }


                               // total pair 2:
//   public static void TPAirs(int numbers[])
//   {
//     int tp = 0;
//     for(int i=0; i<numbers.length; i++)
//     {
//         int current = numbers[i];
//         for(int j =i+1; j<numbers.length;j++)
//         {
//             System.out.println("(" + current +"," + numbers[j] + " )");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.print("total pairs :" + tp);
//   }
//   public static void main (String args[])
//   {
//     int numbers [] = {1,2,3,4,5,6,7,8,9,10};
//     TPAirs(numbers);
//   }
 
// }
//  PRINT SUB ARRAYS:
// public static void subarr(int arr[])
// {
//    for (int i = 0; i <arr.length; i++) 
//    {
//       int start = i;
//       for (int j = i; j <arr.length; j++) 
//       { int end = j;
          
//          for(int k= start; k<=end;k++)
//          {
//             System.out.print(arr[k] + " ");
//          }
//          System.out.println();
//       }
//        System.out.println();
//    }
// }
    
//  public static void main(String[] args) 
//  {
//      int arr[] = {2,4,6,8,10,12};
//      subarr(arr);
//  }

// }

                                 // PRINT  max SUB ARRAYS sum : (brute force): 
//   public static void SubArrays(int numbers[])
//  {
//       int CurSUM = 0;
//       int maxnum = Integer.MIN_VALUE;

//     for(int i =0;i<numbers.length;i++)
//     {
//         int start = i;
//         for(int j = i;j<numbers.length;j++)
//         {
//             int end =j;
//             CurSUM = 0;            // we need to upgrade the value of currsum

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
   
                               // MAX SUB ARRAY SUN :(prefix sum)
//  public static void arrsum(int numbers[])
//  {
//   int maxSum = Integer.MIN_VALUE;
//   int currsum = 0;
//   int prefix [] = new int[numbers.length];
//    prefix [0] = numbers[0];
//      for(int i=1;i<prefix.length;i++)
//      { 
//       prefix[i] = prefix[i-1] + numbers[i];

//      }

//       for(int i =0;i<numbers.length;i++)
//       { int start =i;
//         for(int j=i;j<numbers.length;j++)
//         { int end = j;
//           currsum =  start ==0 ? prefix[end] :prefix[end] - prefix [start-1];
//              if(maxSum<currsum)
//               { maxSum = currsum;

//              }
//         }

//       }
//     System.err.println(" " + maxSum);
//  }
//  public static void main(String args[])
//  {
//   int numbers [] = {1,-2,6,-1,3};
//   arrsum(numbers);

//  }
// }


                       //  MAX SUM OF ARRAY BY KADANS ALGORITHEM:
//   public static void maxsum(int numbers[])
//   {
//     int ms = Integer.MIN_VALUE;
//     int currsum = 0;
//     for(int i=0;i<numbers.length;i++)
//     {  currsum =  currsum +numbers[i];
     
//       if(currsum < 0)
//       {  currsum = 0;
//       }  
//       ms = Math.max(currsum, ms);
//     }
//     System.out.println("the max sum is :" + ms);
//   }
//   public static void main(String args[])
//   { int numbers[] = {-2,-3,4,-1,2,-1,5,-3};
//    maxsum(numbers);
//   }
// }

// TRAPPING RAINWATER(AUXILARY ARRAY):
    
public static int RainWater(int height[])
{
  //calculate the left max boundary 
  int leftMax[] = new int[height.length];
  leftMax[0] =height[0];
  for(int i =1;i<height.length;i++)
    {
      leftMax[i] = Math.max(height[i], leftMax[i-1]);

    }
   //calculate the right max boundary
   int rightMax[] = new int[height.length];
   rightMax[height.length-1] = height[height.length-1];
   for(int i = height.length-2;i>=0;i--)
    {
      rightMax[i] = Math.max(height[i], rightMax[i+1]);
   }
    int trappedWater = 0;
    //loop
    for(int i =0;i<height.length;i++)
    {
       //waterlevel = min(leftmaxboundary, rightmax boundary)
     int waterlevel = Math.min(leftMax[i],rightMax[i]);
        //trapped water = waterlevel - height[i]
     trappedWater += waterlevel -height[i];
    }
    return trappedWater;

}
public static void main(String agrs[])
{ 
  int height[]= {4,2,0,6,3,2,5};
  System.out.print(RainWater(height));
}
}

                             //  BEST TIME TO BUY AND SELL STOCK :
 
// public static int BuyAndSell(int prices[])
// {
//   int buyprices =Integer.MAX_VALUE;
//   int maxProfit =0;

//   for(int i=0;i<prices.length;i++)
//   {
//     if(buyprices < prices[i])  //profit
//     {int profit = prices[i]-buyprices; //todays profit
//       maxProfit = Math.max(maxProfit,profit);
//     }
//     else
//     {
//       buyprices = prices[i];
//     }
//   }
//   return maxProfit;
// }
 
// public static void main(String args[])
// {
//   int prices [] ={7,1,5,3,6,4};
//   System.out.println(BuyAndSell(prices));
// }
// }
