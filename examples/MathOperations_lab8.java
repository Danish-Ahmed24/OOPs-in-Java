package examples;

public class MathOperations_lab8 {

    int multiple(int a, int b)
    {
        return a*b;
    }
    int multiple(int a,int b,int c)
    {
        return a*b*c;
    }
    double multiple(double a, double b)
    {
        return a*b;
    }
    int subs(int a, int b)
    {
        return a*b;
    }
    int subs(int a,int b,int c)
    {
        return a*b*c;
    }
    double subs(double a, double b)
    {
        return a*b;
    }
}
class OverloadingExample{
    public static void main(String[] args) {
        MathOperations_lab8 obj = new MathOperations_lab8();
        System.out.println("Product (2 numbers): "+obj.multiple(1,3));
        System.out.println("Product (3 numbers): "+obj.multiple(2,3));
        System.out.println("Product (double): "+obj.multiple(6,3));

        System.out.println("subs (2 numbers): "+obj.subs(1,3));
        System.out.println("subs (3 numbers): "+obj.subs(2,3));
        System.out.println("subs (double): "+obj.subs(6,3));
    }
}