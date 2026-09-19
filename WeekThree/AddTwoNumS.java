package WeekThree;

import java.util.Scanner;

public class AddTwoNumS {

    static void sumOfTwoNumbers()//non return Type
    {
        System.out.println("Sum of Two Numbers is : " + (10 + 12));
    }

    static float sumToNum(float a, float b)//return Type
    {
        float sum = a + b;
        return sum;
    }

    
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number X :");
        float x = sc.nextFloat();

        System.out.print("Enter the Number Y :");
        float y = sc.nextFloat();

        sumOfTwoNumbers();
        
        float addTwoNum = sumToNum(x, y);
        System.out.println("Sum of Two Numbers is : " + addTwoNum);

        sc.close();
    }
}
