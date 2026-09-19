package WeekThree;

import java.util.Scanner;

public class CountsDigits {
    
    //static Method
    // static void countNum(int a)
    // {
    //     System.out.println("The Length of the Number is : ");
    //     int count = 0;
    //     while(a > 0)
    //     {
    //         count++;
    //         a = a / 10;
    //     }
    //     System.out.println(count);
    // }

    // static int countNumber(int x)
    // {
    //     System.out.println("The Length of the Number is : ");
    //     int count = 0;
    //     while(x > 0)
    //     {
    //         count++;
    //         x = x / 10;
    //     }
    //     return count;
    // }

    //instance Method

    void countNum(int a)
    {
        System.out.println("The Length of the Number is : ");
        int count = 0;
        while(a > 0)
        {
            count++;
            a = a / 10;
        }
        System.out.println(count);
    }

    int countNumber(int x)
    {
        System.out.println("The Length of the Number is : ");
        int count = 0;
        while(x > 0)
        {
            count++;
            x = x / 10;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number : ");
        int Number = sc.nextInt();

        //Static Method
        // countNum(Number);
        // int length = countNumber(Number);
        // System.out.println(length);

        //Instance Method
        CountsDigits ci = new CountsDigits();
        ci.countNum(Number);

        int digitCount = ci.countNumber(Number);
        System.out.println(digitCount);

        sc.close();
    }
}
