package WeekThree;

public class ManyMethods {
    

    static void calculateBaseSalary()
    {
        System.out.println("salary generated");
    }

    static void calculateHra()
    {
        calculateBaseSalary();
        System.out.println("Base Salary done");

    }

    static void dAcalculated()
    {
        calculateHra();
        System.out.println("HRA done");
    }


    static void calculateTax()
    {
        dAcalculated();
        System.out.println("DA done");
    }

    static void calculateSalary()
    {
        calculateTax();
        System.out.println("Tax done");
    }


    public static void main(String[] args)
    {
        calculateSalary();
    }
}
