package WeekThree;

public class Array {
    
    static void update(int b[])
    {
        b[0] = 100;
        System.out.println("Inside call : " + b[0]);
    }
    public static void main(String[] args)
    {
        int a[] = {10, 20, 30, 40};
        System.out.println("Before call : " + a[0]);

        update(a);

        System.out.println("After call : " + a[0]);
    }
}
