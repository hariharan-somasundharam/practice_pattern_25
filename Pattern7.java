/*
    Pattern 7 :
         *
       *   *
     *   *   *
   *   *   *   *
 *   *   *   *   *    

 */

import java.util.Scanner;
class Pattern7{
    public static void main(String []argg)
    {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
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
    }
}