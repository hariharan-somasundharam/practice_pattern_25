/*
    Pattern 4 :
        *       *
          *   *
            *   
 */

import java.util.Scanner;
class Pattern4{
    public static void main(String []argg)
    {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(j==(n-1)/2-i || j==(n-1)/2+i)
                    System.out.print(" *");
                else
                    System.out.print("  ");
                
            }
            System.out.println();
        }
    }
}