/*
    Pattern 2 :
        *
        * *
        * * *
        * * * *
        * * * * *    
 */

import java.util.Scanner;
class Pattern2{
    public static void main(String []argg)
    {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                    System.out.print(" *");
                
            }
            System.out.println();
        }
    }
}