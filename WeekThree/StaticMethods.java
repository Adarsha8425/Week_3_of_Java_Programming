package WeekThree;

public class StaticMethods {
    
    // static void display()
    // {
    //     System.out.println("Hello");

    // }
    //non-void return type
    static int add(int x, int y)//x = 10, y = 20 recieve data formal parameters
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
        //scope checking
        //System.err.println(x); a is not in this method
    }
    public static void main(String[] args)
    {
        int a = 10, b = 20;
        int num = add(a, b);
        System.err.println(num);
    }
}
