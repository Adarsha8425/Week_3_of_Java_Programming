package WeekThree;

public class ReturnArray {
    
    static int[] update()
    {
        int a[] = {10, 20, 30};
        return a;
    }
    public static void main(String[] args)
    {
        int b[] = update();

        System.out.println("Before Modification :");
        //System.err.println(b[0] + " " + b[1] + " " + b[2]);
        for(int i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        b[0] = 100;

        System.out.println("After Modification :");
        //System.err.println(b[0] + " " + b[1] + " " + b[2]);
        for(int j = 0; j < b.length; j++)
        {
            System.out.print(b[j] + " ");
        }

    }
}
