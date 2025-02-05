package Q4;

public class Main {
    public static void main(String[] args) {
        Course c = new Course();
        c.setCourseCode("CS101");
        c.setCourseName("Programming Fundamentals");
        c.setCreditHours(4);

        System.out.println("Course Code: "+c.getCourseCode());
        System.out.println("Course Name: "+c.getCourseName());
        System.out.println("Credit Hours: "+c.getCreditHours());
    }
}
