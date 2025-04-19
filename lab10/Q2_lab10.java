package lab10;

abstract class Marks {
    abstract float getPercentage();
}
class A extends Marks{
    int sum=0;
    public A(int m1,int m2,int m3)
    {
        sum+=(m1+m2+m3);
    }
    @Override
    float getPercentage() {
        return sum/3;
    }
}

class B extends Marks{
    int sum=0;
    public B(int m1,int m2,int m3,int m4)
    {
        sum+=(m1+m2+m3+m4);
    }
    @Override
    float getPercentage() {
        return sum/4;
    }
}
public class Q2_lab10 {
    public static void main(String[] args) {
        A A = new A(45,67,78);
        B B = new B(54,87,95,24);
        System.out.println("A : "+A.getPercentage()+"%");
        System.out.println("B : "+B.getPercentage()+"%");
    }
}
