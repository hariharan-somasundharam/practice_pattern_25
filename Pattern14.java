import java.util.Scanner;
class Pattern14{
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
        for(int i=n-1;i>=1;i--)
         {
             for(int j=1;j<=i;j++)
             {
                     System.out.print(" *");
             }
             System.out.println();
         }
    }
}