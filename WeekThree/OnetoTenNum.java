package WeekThree;

import java.util.Scanner;

public class OnetoTenNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int start = sc.nextInt();
        int endNum = sc.nextInt();

        for(int i = start; i <= endNum; i++)
        {
            if(i == 6)
            {
                break;
            }
            System.out.println(i);
                
        }
        
        sc.close();
    } 
}
