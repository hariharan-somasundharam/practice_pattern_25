/*          
    Pattern 1:   
            * * * * *
            *       *
            *       *
            *       *
            * * * * *      */


import java.util.Scanner;
class Pattern1{
    public static void main(String []argg)
    {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0&&j<n-1 || j==0&&i<n-1 || i==n-1&& j>=0 || j==n-1&& i>=0)
                    System.out.print(" *");
                else
                    System.out.print("  ");
                
            }
            System.out.println();
        }
    }
}