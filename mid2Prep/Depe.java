package mid2Prep;
class DIsp{
    public void d()
    {
        System.out.println("HI");
    }
}
class Child1 extends DIsp{
    @Override
    public void d()
    {
        super.d();
        System.out.println("bro");
    }
}
public class Depe {
//run time pol ==> overriding
//compile time ===> overloading
}
