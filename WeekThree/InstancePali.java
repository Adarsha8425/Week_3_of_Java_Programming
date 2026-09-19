package WeekThree;

import java.util.Scanner;

public class InstancePali {

    //Instance Method
    String palinDrome(int x)
    {
        System.out.println("The Number is : ");
        int copyNum = x;
        int reverse = 0;

        while(x > 0)
        {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        if(copyNum == reverse)
        {
           
           return "Palindrome";
        }
        else
        {
            return "Not a Palindrome";
            //System.out.println("Not a Palindrome");
        }
    }

    void palinDromeOrNot(int x)
    {
        System.out.println("The Number is : ");
        int copyNum = x;
        int reverse = 0;

        while(x > 0)
        {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        if(copyNum == reverse)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }

    //static Method

    // static int palinDrome(int x)
    // {
    //     System.out.println("The Number is : ");
    //     int copyNum = x;
    //     int reverse = 0;

    //     while(x > 0)
    //     {
    //         int digit = x % 10;
    //         reverse = reverse * 10 + digit;
    //         x = x / 10;
    //     }

    //     if(copyNum == reverse)
    //     {
    //         System.out.println("Palindrome");
    //     }
    //     else
    //     {
    //         System.out.println("Not a Palindrome");
    //     }
    //     System.out.println();
    //     return 0;
    // }

    //static void palinDromeOrNot(int x)
    // {
    //     System.out.println("The Number is : ");
    //     int copyNum = x;
    //     int reverse = 0;

    //     while(x > 0)
    //     {
    //         int digit = x % 10;
    //         reverse = reverse * 10 + digit;
    //         x = x / 10;
    //     }

    //     if(copyNum == reverse)
    //     {
    //         System.out.println("Palindrome");
    //     }
    //     else
    //     {
    //         System.out.println("Not a Palindrome");
    //     }
    // }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int Number = sc.nextInt();

        InstancePali PI = new InstancePali();
        String pali = PI.palinDrome(Number);
        System.out.println(pali);

        PI.palinDromeOrNot(Number);

        //static calling Method
        // palinDrome(Number);
        // palinDromeOrNot(Number);
        sc.close();

    }
}
