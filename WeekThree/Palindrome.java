package WeekThree;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] arsg)
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number : ");

        int number = sc.nextInt();
        
        int num = number;
        int count = 0;

        while(number > 0)
        {
            int digit = number % 10;
            count = count * 10 + digit;
            number = number / 10;
        }
        
        System.out.println();
        System.err.println("The Given Number is :");
        if(num == count)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
