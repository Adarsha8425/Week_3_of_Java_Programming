package WeekThree;

public class CharAtoZ {
    public static void main(String[] args)
    {
        
        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
            if(ch == 'N')
            {
                break;
            }
            System.out.print(ch + " ");
        }
    }
}
