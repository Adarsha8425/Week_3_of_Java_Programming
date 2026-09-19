package WeekThree;

import java.util.Scanner;

public class CountDigit {
    public  static void main(String[] args)
    {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int num = sc.nextInt();


        int count = 0;
        while(num > 0)
        {
            count++;
            num = num / 10;
        }
        System.out.println(count);

        for(int i = num; i > 0; i = i / 10)
        {
            count = count + 1;
        }
        System.out.println(count);

        sc.close();
    }
}
