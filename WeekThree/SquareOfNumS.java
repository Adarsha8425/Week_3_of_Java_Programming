package WeekThree;

import java.util.Scanner;

public class SquareOfNumS {

    static void squareOfNumbers(int x, int y)
    {
        for(int i = x; i <= y; i++)
        {
            int square = i * i;
            System.out.print(square + " ");
        }
        System.out.println();
    }

    static int squareOfNum(int num1, int num2)//This method must return a result of type int
    {
        for(int i = num1; i <= num2; i++)
        {
            int Total_1 = i * i;
            System.out.println(Total_1);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int a = sc.nextInt();

        System.out.println("Enter the Number : ");
        int b = sc.nextInt();

        System.err.println();

        squareOfNumbers(a, b);

        squareOfNum(a, b);

        sc.close();
    }
}
