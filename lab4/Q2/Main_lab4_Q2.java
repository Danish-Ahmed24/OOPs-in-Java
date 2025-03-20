package Q2;


public class Main_lab4_Q2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1,"Danish Ahmed",3.5f);
        s1.finalizeDemo();
        s2.finalizeDemo();
        s1 =null;
        s2=null;
        System.gc();
        System.gc();
    }
}
//finalize not working sir
