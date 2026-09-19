package WeekThree;

import java.util.Scanner;

public class EvenandOdd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int Start = sc.nextInt();
        int EndNum = sc.nextInt();

        for(int i = Start; i <= EndNum; i++)
        {
            if(i%2 == 0)
            {
               continue;
            }
            System.out.print(i + " ");
        }

        sc.close();
    }
}
