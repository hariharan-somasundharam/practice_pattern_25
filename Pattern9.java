/*
    Pattern 9 :
          *
        *   *
      *   *   *
    *   *   *   *
  *   *   *   *   *
    *   *   *   *
      *   *   *
        *   *
          *   


 */

import java.util.Scanner;
class Pattern9{
    public static void main(String []argg)
    {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        // Upper Pattern
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>1;j--)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++)
                System.out.print("*   ");
            System.out.println();
        }
        // Lower Pattern
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=n-2-i;j++)
                System.out.print("*   ");
            System.out.println();
        }
    }
}