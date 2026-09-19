package WeekThree;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Input Number :");

        int number = sc.nextInt();

        int num = number;
        int count = 0;

        int orginal_num = number;
        int sum = 0;
        while(number > 0)
        {
            count++;
            number /= 10;
        }

        while (num > 0) 
        {
            int digit = num % 10;
            int Total_num = (int) Math.pow(digit, count);
            sum = sum + Total_num;           
            num = num / 10;
        }

        System.out.println();
        if(sum == orginal_num)
        {
            System.out.println("It's ArmStrong Number");
        }
        else
        {
            System.out.println("Not ArmStrong Number");
        }

        sc.close();
    }
}
