package WeekThree;

public class Patterns {
    public static void main(String[] args)
    {
        // for(int i = 1; i<= 5; i++)
        // {
        //     for(int j = 1; j<= 5; j++)
        //     {
        //         System.out.print(i + j + " ");
        //     }
        //     System.out.println();
        // }
        // int count = 0;
        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= 5; j++)
        //     {
        //         ++count;
        //         //System.out.println(count + " ");
        //         System.out.format("%02d ", count);

        //     }
        //     System.err.println();
        // }

        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= i; j++)
        //     {
        //         //System.out.print("*");
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // int count = 0;
        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= i; j++)
        //     {
        //         count++;
                
        //         System.out.print(count+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i<=5; i++)
        // {
        //     for(int j = 1; j<=5-i+1; j++)
        //     {
        //         //System.out.print(j + " ");
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 10; i++)
        // {
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //  for(int i = 1; i <= 10; i++)
        //  {
        //      for(int j = 10; j >= 1; j--)
        //      {
        //         if(j <= i)
        //          {
        //              System.out.print("*" + " ");
        //          }
        //          else
        //          {
        //              System.out.print("  ");
        //          }
        //      }
        //      System.out.println();
        // }

        //int n = 5;

        // int i = 1;
        // while(i <= n)
        // {
        //     int j = 1;
        //     while(j < i)
        //     {
        //         System.err.print("  ");
        //         j++;
        //     }

        //     j=1;
        //     while(j <= n-i+1)
        //     {
        //         System.err.print("* ");
        //         j++;
        //     }
        //     System.err.println();
        //     i++;
        // }
        
        
        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j<5-i+1; j++)
        //     {
        //         System.err.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.err.print(j);
        //     }
        //     System.err.println();
        // }

        int n = 10;
        int i = 1;
        while(i <= n)
        {
            int j = 1;
            while(j < n-i+1)
            {
                System.err.print("  ");
                j++;
            }

            j = 1;
            while(j <= i)
            {
                System.err.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }


    }
}
