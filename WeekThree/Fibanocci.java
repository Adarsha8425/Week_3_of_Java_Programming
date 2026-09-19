package WeekThree;

import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");

        int number = sc.nextInt();

        int num = 0;
        int prev = 1;
        while(num <= number)
        {
            System.out.print(num + " ");
            int temp = num + prev;
            num = prev;
            prev = temp;
        }
        sc.close();
    }
}
