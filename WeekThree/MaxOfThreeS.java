package WeekThree;

import java.util.Scanner;

public class MaxOfThreeS {
    
    static void maxOfNum(int a, int b, int c)
    {
        System.err.println("The Max of three is : ");
        if(a > b && a > c)
        {
            System.out.println(a);
        }
        else if(b > a && b > c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
        System.err.println();
    }

    static int maxOfNumThree(int x, int y, int z)
    {   
        System.err.println("The Max of three is : ");
        if(x > y && x > z)
        {
            return x;
        }
        else if(y > x && y > z)
        {
            return  y;
        }
        else
        {
            return  z;
        }
    }

    //Instance Methods
    // void maxOfNum(int a, int b, int c)
    // {
    //     System.err.println("The Max of three is : ");
    //     if(a > b && a > c)
    //     {
    //         System.out.println(a);
    //     }
    //     else if(b > a && b > c)
    //     {
    //         System.out.println(b);
    //     }
    //     else
    //     {
    //         System.out.println(c);
    //     }
    //     System.err.println();
    // }

    // int maxOfNumThree(int x, int y, int z)
    // {   
    //     System.err.println("The Max of three is : ");
    //     if(x > y && x > z)
    //     {
    //         return x;
    //     }
    //     else if(y > x && y > z)
    //     {
    //         return  y;
    //     }
    //     else
    //     {
    //         return  z;
    //     }
    // }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Numbers 2 : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the Numbers 3 : ");
        int num3 = sc.nextInt();

        maxOfNum(num1, num2, num3);

        int maxValue = maxOfNumThree(num1, num2, num3);
        System.out.println(maxValue);

        // MaxOfThreeS MI = new MaxOfThreeS();
        // MI.maxOfNum(num1, num2, num3);

        // int maxValue = MI.maxOfNumThree(num1, num2, num3);
        // System.out.println(maxValue);

        sc.close();
    }
}
