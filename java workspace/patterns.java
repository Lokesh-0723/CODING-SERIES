public class patterns {
    public static void star_problem(int r, int c )
    {
        for(int i =1;i<=r; i++)
        {
            for(int j =1; j<=c;j++)
            {
                System.out.print("*");

            }
            System.out.println();

        }

    }
    public static void q1()
    {
      for (int line = 1; line <= 5; line++) 
        {
            for(int star = 1;star<= 5-line+1;star ++)
            {
                 System.out.print("* "); 

            }
            System.out.println();
               
                
        }
    }
    public static void q2(int totrows,int totcols){
        //outer loop
        for(int i =1; i<=totrows; i++)
        {
            //iner loop
            for(int j =1; j<=totcols; j++)
            {
                //boundary condition
                if(i==1||i==totrows||j==1||j==totcols)
                {
                    System.out.print("*");

                }
                else
                {
                    System.out.print(" ");

                }
            }
            System.out.println();

        }

    }
    public static void inverted_rotated_pyramid(int n)
    {
        //outer loop
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j =1;j<=n-i;j++)
            {
                System.out.print(" ");

            }
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();

        }
   
    }
    public static void inverted_half_pyramid_withno(int n)
    {
        //outer loop
        for(int i =1; i<=n;i++)
        {
            //ineer loop
            for(int numb =1; numb<=n-i+1;numb++)
            {
                System.out.print(numb+" ");

            }
            System.out.println();

        }

    }
    public static void floyds_triangle(int n  )
    {    int counter =1;
        //outer loop
        for(int i =1;i<=n;i++)
        {   //inner loop how many time the value of counter is printed
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter + " ");
                counter++;

            }
            System.out.println(" ");

        }
        

    }
    public static void zero_one_triangle(int n)
    {
        for (int i =1; i<= n; i++)
        {
            for(int j =1; j<= i; j++)
            {
            if((i+j) %2 ==0)
            {
                System.out.print("1");

            }
            else
            {
                System.out.print("0");


            }

            }
            System.out.println(" ");

        }

    }
    public static void butterfly_pattern(int n)
    {  //1st half
        for (int i =1; i<=n;i++)
        {  // star 
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            //for spaces
            for( int j =1; j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            //star 2
            for(int j =1; j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();

        }
        //2nd loop
        for(int i = n; i>=1;i--)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            //for spaces
            for( int j =1; j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            //star 2
            for(int j =1; j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();

        }

    }
    public static void solid_rohbus(int n)
    {  //outer loop
        for(int i=1;i<=n;i++)
        {  //only space
            for(int j=1;j<=n-i;j++)
            {  
                System.out.print(" ");
            }
            //solid pattern or star pattern
            for(int j =1; j<=n;j++)
            {
                System.out.print("*");

            }
            System.out.println(" ");

        }

    }
    public static void hollow_rohmbus(int n)
    {
        for(int i =1; i<=n;i++)
        {  // hollow spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");

            }//hollow rohmbus -star
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {System.out.print("*");

                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();

        }

    }
    public static void diamond_pattern(int n)
    {   //1st loop upper part
        for(int i =1; i<=n;i++)
        {  // spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }//stars
            for(int j =1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
                System.out.println(); 
        }
        //2nd loop lower part
        for(int i =n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
                System.out.println(); 

        }
        

    }
    public static void inverted2_pyramid(int n)
    {   //outerloop
        for(int i=1;i<=n;i++)
        {
            for(int j=1 ;j<=n-i; j++)
            {
                System.out.print(" ");

            }
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();

        }

    }  
    public static void adv_pattern(int n,int m) 
    {//outerloop
        for(int i =1;i<=n;i++)
        {//innerloop
            for(int j=1;j<=m;j++)
            {//cells(i,j)
                if(i==1||i==n||j==1||j==m)
                {
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }   
    public static void Pyramid3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print( " ");

            }
            for( int j=0;j<2*i-1;j++)
            {
                System.out.print("*");

            }
            System.out.println();

        }
        

    } 
    public static void practices(  )
      {
        for(int i=1;i<=4;i++)
        {   
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");
        

            }
            System.out.println();

        }

      }
    
    
    public static void main(String args[]) 
    {
    //      star_problem(6,5);
    //    q1();
    //     System.out.println();
    //      q2(5,6);
    //       System.out.println();
    //      inverted_rotated_pyramid(5);
    //       System.out.println();
    //      inverted_half_pyramid_withno(9);
    //       System.out.println();
    //      floyds_triangle(18);
    //      System.out.println();
    //     zero_one_triangle(8);
    //      System.out.println();
    //     butterfly_pattern(4);
    //     System.out.println();
    //     solid_rohbus(7);
        //  System.out.println();
        //  hollow_rohmbus(7);
        //  System.out.println();
        // diamond_pattern(4);
        //  System.out.println();
        // inverted2_pyramid(5);
        // adv_pattern(5, 6);
        // Pyramid3(4);
        practices();


        
            
    }
}