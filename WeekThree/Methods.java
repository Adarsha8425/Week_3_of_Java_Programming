package WeekThree;

public class Methods {

    //1 no agrs and no return
    static void greet()
    {
        System.err.println("Hello");
    }

    //2 agr and no return type
    static void add(int a, int b)
    {
        System.err.println("Sum = " + (a + b));
    }

    //3 no args but return
    static int getNum()
    {
        return 100;
    }

    //4 agrs and returns
    static int max(int x, int y)
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    public static void main(String[] args)
    {
        greet();

        add(10, 20);

        int get = getNum();
        System.err.println(get);

        int a = 12, b = 20;

        int store = max(a, b);
        System.err.println(store);
    }
}
