package WeekThree;

public class Overloading {
    
    
    int max(int x, int y)//parameter can't
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return  y;
        }
    }

    int max(byte x, int y)//parameter can't
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return  y;
        }
    }

    int max(int x, int y, int z)//parameter can't
    {
        if(x > y && x > z)
        {
            return x;
        }
        else if(y > z && y > x)
        {
            return y;
        }
        else
        {
            return  z;
        }
    }


    float max(float a, float b)//when int is not  called float executes
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return  b;
        }
    }
    public static void main(String[] args)
    {
    
        Overloading ov = new Overloading();
        int num = ov.max(10, 20);
        System.out.println(num);

        System.out.println(ov.max(10, 12, 13));
    }
}
