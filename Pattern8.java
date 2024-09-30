/*
    Pattern 8 :
        *   *   *   *   *
          *   *   *   *
            *   *   *
              *   *
                *    


 */

import java.util.Scanner;
class Pattern8{
    public static void main(String []argg)
    {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=n-1-i;j++)
                System.out.print("*   ");
            System.out.println();
        }
    }
}