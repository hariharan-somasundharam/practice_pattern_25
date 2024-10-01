import java.util.Scanner;
 class Pattern15{
     public static void main(String []argg)
     {
         Scanner d = new Scanner(System.in);
         int n = d.nextInt();
         for(int i=1;i<=n;i++)
         {
             for(int j=i;j<n;j++)
             {
                     System.out.print("   ");
             }
             for(int j=1;j<=i;j++)
                System.out.print("  *");
             System.out.println();
         }
         for(int i=n;i>=1;i--)
         {
             for(int j=i;j<=n;j++)
             {
                     System.out.print("   ");
             }
             for(int j=1;j<i;j++)
                System.out.print("  *");
             System.out.println();
         }
     }
 }