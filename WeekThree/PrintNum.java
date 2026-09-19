package WeekThree;

import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int num = sc.nextInt();

         while(num > 0)
         {
            int extract = num % 10;
            System.out.print(extract + " ");
            num = num / 10;
         }
         sc.close();
    }
}
