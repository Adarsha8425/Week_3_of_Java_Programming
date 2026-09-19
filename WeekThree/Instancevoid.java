package WeekThree;

import java.util.Scanner;

public class Instancevoid {
    
    void checkEvenOdd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        System.err.println();
    }

    boolean isEven(int x)
    {
        return x % 2 == 0;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int Number = sc.nextInt();

        Instancevoid Iv = new Instancevoid();
        Iv.checkEvenOdd(Number);

        boolean result = Iv.isEven(Number);
        System.out.println(result);

        sc.close();
    }
}
