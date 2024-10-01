/*
    Pattern 11 :
        *   *   *
          *   *
            *
          *   *
        *   *   *    

 */

import java.util.Scanner;
class Pattern11{
    public static void main(String []argg)
    {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<=n-1;j++)
                System.out.print("*   ");
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<=n-1;j++)
                System.out.print("*   ");
            System.out.println();
        }
    }
}