public class string {

    //  char arr[] = { 'a','b','c','d','e'};
    //      String str = "abcd";
    //      String str2 = new String("xyz");

    //      //strings are imutable
    //      Scanner sc = new Scanner (System.in);
    //      String name;
    //      name = sc.nextLine();
    //      System.out.println(name);
                         //String length:
                        //  
        // public static void main(String[] args) 
        // {   
        // String fullName = "tony stark";
        // System.out.println(fullName.length()); 
        //    }
                       // CONCATINATION:
                       //
        //   public static void main(String[] args) 
        //   {                 
    //    String firstName = "lokesh";
    //    String lastName = "manjhi";
    //    String fullName =  firstName + " " + lastName;
    //    System.out.println(fullName); 
            //  }    
                      //CHAR AT METHORD:
                    //    
    // public static void printLetters(String str)
    // {
    //     for(int i =0;i<str.length();i++)
    //     {
    //         System.out.print(str.charAt(i) + " ");
    //     }
    //      System.out.println("");
    // }

    // public static void main(String args[]){                
    //     String firstName = "lokesh";
    //     String lastName = "manjhi";
    //     String fullName =  firstName + " " + lastName;
    //      printLetters(fullName);              
    // }

                   //CHECK IF A STRING IS PALINDROME:
                // (Palindrome means a word, number, or sentence that reads the same forward and backward.)    
         // public static boolean isPalindrome(String str) 
//     {
//         for (int i = 0; i < str.length() / 2; i++)
//         {
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(n - 1 - i)) 
//                 {
//                   return false; // not a palindrome
//                 }
//         }

       
//         return true; // is a palindrome
//     }

// public static void main(String[] args)
//  {
//         String str = "madam";
//      if (isPalindrome(str))
//     {
//         System.out.println(str + " is a palindrome.");
//     } 
//     else
//     {
//      System.out.println(str + " is not a palindrome.");
//      System.out.println(isPalindrome(str));
//     }   
//  }                    


                            // GIVE AROUTE CONTAINIG FOUR DIRECTION (E,W,N,S). FIND THR SHORTEST
                            // PATH TO REACH THE DESTINATION.
                            
//      public static float getshortestpath(String path)  {
//     int x = 0;
//     int y = 0;

//     for (int i = 0; i < path.length(); i++) {
//         char direction = path.charAt(i);
//         //north
//         if (direction == 'N') {
//             y++;
//             //south
//         } else if (direction == 'S') {
//             y--;
//             //east
//         } else if (direction == 'E') {
//             x++;
//             //west
//         } else if (direction == 'W') {
//             x--;
//         }
//     }

//     int x2 = x * x;
//     int y2 = y * y;
//     return (float) Math.sqrt(x2 + y2);
//  }

//  public static void main(String[] args) {
//     String path = "NNESWWS";
//     System.out.println("Shortest path: " + getshortestpath(path));
//   }
 
  

                                  //STRING FUNCTION COMPARE
                                 //  
                                 // 

   //  public static void main(String[] args) {
   //      String name = "hello";
   //      String name2 = "hello";
   //      String name3 = new String("hello");

   //      if(name == name2) // true because both name and name2 are pointing to the same string literal in the string pool
   //      {
   //       System.out.println("STRNIG IS EQUAL");
   //      }
   //      else
   //      {
   //       System.out.println("STRNIG IS NOT EQUAL");
   //      }
   //      if(name == name3)// false because name3 is created using new keyword and it is pointing to a different memory location in the heap
   //      {
   //       System.out.println("STRNIG IS EQUAL");
   //      }
   //      else
   //      {
   //       System.out.println("STRNIG IS  NOT EQUAL");
   //      }
   //      if(name.equals(name3)) // true because equals() method compares the content of the string and both name and name3 have the same content "hello"
   //      {
   //       System.out.println("STRNIG IS EQUAL");
   //      }
   //      else
   //      {
   //       System.out.println("STRNIG IS NOT EQUAL");
   //      }
        
   //  // if we compare two strings using == operator then it will compare the reference of the string and if we compare two strings using equals() method then it will compare the content of the string
   //    }  
   // }
                                    // STRING FUNCTION(SUBSTRING)
                                    // 
                                    // 
//    public static String subString(String str , int si , int ei)
//    {
//       String substr = " ";
//       for(int i = si; i<ei;i++)
//       {
//          substr += str.charAt(i);

//       }
//      return substr;

//    }
//    public static void main(String args[])
//    {
//       String str = "hello bro";
//       // System.out.println(str.substring(0,5));
//       String sub = subString(str ,0 , 5);
//       System.out.println(sub);
//    }
// }
                       //print the largest string(lexicographic order)
                        // 
// public static void main(String args[])
// {  
//    String fruits[] = {"apple","mango","orange"};

//    String largest = fruits[0];
//    for(int i =1;i<fruits.length;i++)
//    {
//      if (largest.compareTo(fruits[i])<0) 
//       {
//          largest = fruits[i];
//      }
//    }
//    System.out.println("largest string is:" + largest);
// }
// }
                                        // STRING BUILDER:
                                       // 
// public static void main(String args[])
// {
//     StringBuilder sb = new StringBuilder("tony strak");   
                                                            
//     for(char ch = 'a'; ch<='z'; ch++)
//     {
//         sb.append(ch + " ");
//     }
//     System.out.println(sb);

// }           
// }   
  // StringBuilder is a mutable string class (can be changed). 
 // "tony strak" is the initial value stored in it.
// sb is the object name.

// 👉 Why StringBuilder?

 // Because normal String is immutable (cannot change)                                                           // StringBuilder is faster when modifying string
// string builder is faster when modifying strings.

// sb.append(ch + " ");
// append() is used to add data at the end of StringBuilder.

// Now important part 👇

// ch + " " → character + space
// It converts ch into a string and adds a space after it.

// 👉 Example:

// First iteration → "a "
// Second → "b "
// …
// Last → "z "

// So it keeps adding: tony stark a b c d .....z
 }   

