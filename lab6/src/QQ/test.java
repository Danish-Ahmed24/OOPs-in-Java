package QQ;

public class test {
    String name ;
    public test(String name){
        this.name=name;
    }
    public test (test t){
        this.name = t.name;
    }
    public void Display(){
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        test t1 = new test("ali");
        test t2 = new test(t1);
        t1.Display();
        t2.Display();
        t2.name="usman ";
        t1.Display();
        t2.Display();



    }
}
