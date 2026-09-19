package WeekThree;

public class NesteLoop {
    public static void main(String[] args)
    {
        int Start = 1;
        int end = 4;

        for(int i = Start; i <= end; i++)//rows 
        {
            for(int j = Start; j <= end; j++)
            {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
