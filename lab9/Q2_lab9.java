package lab9;

class Person{
    protected String name;
    protected String email;
    protected String phone;

    public Person(String name,String email,String phone)
    {
        this.phone=phone;
        this.name=name;
        this.email=email;
    }

    public String toString()
    {
        return "Name: "+this.name+" Email: "+this.email+" Phone: "+this.phone;
    }
}
class Student extends Person{
    private int studentId;
    private String major;
    public Student(String name,String email,String phone,String major,int studentId)
    {
        super(name,email,phone);
        this.studentId=studentId;
        this.major=major;
    }
    public void getGPA()
    {
        System.out.println("ID: "+this.studentId+"GPA: 3.5 in major: "+this.major);
    }
}
class Faculty extends Person{
    private int facultyId;
    private String department;

    public Faculty(String name,String email,String phone,String department,int facultyId)
    {
        super(name,email,phone);
        this.department=department;
        this.facultyId=facultyId;
    }

    public String getRank()
    {
        return "Professor";
    }
}
class Staff extends Person{
    private int staffId;
    private String jobTitle;

    public Staff(String name,String email,String phone,String jobTitle,int staffId)
    {
        super(name,email,phone);
        this.jobTitle=jobTitle;
        this.staffId=staffId;
    }

    public int getSalary()
    {
        return 1000;
    }
}
public class Q2_lab9 {
    public static void main(String[] args) {
        Person student = new Student("Danish","k243025@nu.edu.pk","+92 443232323","Computer",3025);
        Person faculty = new Faculty("Sir.Minhal Raza","mihal.raza@google.com","+932 448423222","CYS",001);
        Person staff = new Staff("CS","CS.staff@habib.khi","+99 424352352352","Staff",4);
        System.out.println(student.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

        Student std = (Student) student;
        std.getGPA();
        Faculty fac = (Faculty) faculty;
        System.out.println("Faculty: "+fac.getRank());
        Staff stf = (Staff) staff;
        System.out.println("Staff: "+stf.getSalary());
    }
}
