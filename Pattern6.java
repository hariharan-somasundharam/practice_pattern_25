/*
    Pattern 6 :
             *
           *
         *
       *
     *
   *    
   
 */

import java.util.Scanner;
class Pattern6{
    public static void main(String []argg)
    {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j==n-1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
                
            }
            System.out.println();
        }
    }
}