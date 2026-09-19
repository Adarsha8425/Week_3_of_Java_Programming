package WeekThree;

import java.util.Scanner;

public class EvenNumberS {
    
    //Static Methods
    static void oddNumbers(int a, int b)
    {
        System.out.println("The Odd numbers : ");
        int i = a;
        while(i <= b)
        {
            System.out.print(i + " ");
            i+=2;
        }
        System.err.println();
    }

    // static int evenNumber(int y)
    // {
    //     System.out.println("The Even numbers : ");
    //     int i = 2;
    //     while(i <= y)
    //     {
    //         System.out.print(i + " ");
    //         i += 2;
    //     }
    //     return 0;
    // }

    //Instance Methods
    int evenNumbers(int y)
    {
        System.out.println("The Even numbers : ");
        int i = 2;
        while(i <= y)
        {
            System.out.print(i + " ");
            i += 2;
        }
        return 0;
    }

    // void oddNumber(int a, int b)
    // {
    //     System.out.println("The Odd numbers : ");
    //     int i = a;
    //     while(i <= b)
    //     {
    //         System.out.print(i + " ");
    //         i+=2;
    //     }
    //     System.err.println();
    // }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers : ");

        int num1 = sc.nextInt();

        System.out.println("Enter the Number : ");
        int num2 = sc.nextInt();

        oddNumbers(num1, num2);
        //evenNumber(num2);

        EvenNumberS EI = new EvenNumberS();
        EI.evenNumbers(num2);
        //EI.oddNumber(num1, num2);

        sc.close();

    }
}
