package WeekThree;

public class InstanceMethod {
    
    // demo of instace method to creating object and access
    // int max(int x, int y)
    // {
    //     if(x > y)
    //     {
    //         return x;
    //     }
    //     else
    //     {
    //         return y;
    //     }
    // }

    //no agrs and no return type
    void greet()
    {
        System.err.println("Hello");
    }

    //2 agr and no return type
    void add(int a, int b)
    {
        System.err.println("Sum = " + (a + b));
    }

    //3 no args but return
    int getNum()
    {
        return 100;
    }

    //4 agrs and returns
    int max(int x, int y)
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
        // InstanceMethod obj1 = new InstanceMethod();
        // int valu = obj1.max(10, 12);
        // System.err.println(valu);

        // InstanceMethod obj2 = new InstanceMethod();
        // obj2.add(13, 8);

        // InstanceMethod obj3 = new InstanceMethod();
        // int num = obj3.getNum();
        // System.err.println(num);

        // InstanceMethod obj4 = new InstanceMethod();
        // obj4.greet();

        InstanceMethod obj1 = new InstanceMethod();
        //1
        obj1.greet();

        //2
        obj1.add(10, 20);

        //3
        int num = obj1.getNum();
        System.err.println(num);

        //4
        int value = obj1.max(20, 15);
        System.err.println(value);

    }
}
