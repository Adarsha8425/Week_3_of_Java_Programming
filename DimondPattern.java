package WeekThree;

import java.util.Scanner;

public class DimondPattern {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        //first tringle pattern
        for(int i = 1; i <= n ; i++)
        {
            for(int k = 1; k <= n-i; k++)
            {
                System.err.print("  ");
            }
            for(int j = 1; j <= 2*i-1; j++)
            {
                System.out.print("* ");
            }
            System.err.println();
        }


        //reverse triangle pattern
        for(int i = n-1; i >= 1; i--)
        {
            for(int k = 1; k <= n-i; k++)
            {
                System.err.print("  ");
            }
            for(int j = 1; j <= 2*i-1; j++)
            {
                System.out.print("* ");
            }
            System.err.println();
        }

        sc.close();
    }
}
