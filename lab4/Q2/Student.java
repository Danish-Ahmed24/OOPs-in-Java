package Q2;


public class Student {
    private int id;
    private String name;
    private float cgpa;
    Student()
    {
        System.out.println("Default student Profile  Created");
        this.id = 00;
        this.name = "Default Student";
        this.cgpa = 0.0f;
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("CGPA: "+this.cgpa);
        System.out.println();
        System.out.println();
    }
    Student(int id , String name , float cgpa)
    {
        System.out.println("New student Profile  Created");
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("CGPA: "+this.cgpa);
        System.out.println();
        System.out.println();
    }
    public void finalizeDemo()
    {
        System.out.println("Student record deleted: "+this.id+", "+this.name);
    }
    @Override//finalize not working sir
    protected void finalize() throws Throwable{
        System.out.println("Student record deleted: "+this.id+" , "+this.name);
    }
}

