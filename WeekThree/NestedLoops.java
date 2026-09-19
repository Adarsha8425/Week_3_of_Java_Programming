package WeekThree;

public class NestedLoops {
    public static void main(String[] args)

    {
        for(int i = 1; i <=3; i++)//outer loop works for row
        {
            for(int j = 1; j <= 3; j++)//inner loop works for columns
            {
                System.out.print("(" + i + "," + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
