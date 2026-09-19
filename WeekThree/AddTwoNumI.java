package WeekThree;

import java.util.Scanner;

public class AddTwoNumI {

    void sumOfTwoNumbers(int x, int y)
    {
        System.out.println("The Sum of Number is : " + (x + y));
    }

    int addToNumbers(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    // void sumOfTwoNumbers()
    // {
    //     System.out.println("The Sum of Number is : " + (12 + 13));
    // }

    // int addToNumbers()
    // {
    //     return (15 - 7);
    // }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number a : ");
        int a = sc.nextInt();

        System.out.println("Enter the Number b : ");
        int b = sc.nextInt();

        System.out.println();

        AddTwoNumI Ai = new AddTwoNumI();//object created
        Ai.sumOfTwoNumbers(a, b);

        int Total = Ai.addToNumbers(a, b);
        System.out.println("The Sum of Number is : " + Total);

        sc.close();
    }
}
