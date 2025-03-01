package Q4;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course(1,"MVC");
        Course c2 = new Course(2,"OOPS");
        Course c3 = new Course(3,"DLD");
        Course c4 = new Course(4,"UOS");

        Instructor i1 = new Instructor("Sir Saad","SE");
        i1.teachCourse(c1);
        i1.teachCourse(c2);
        i1.teachCourse(c3);
        Instructor i2 = new Instructor("Sir Kashif","CS");
        i2.teachCourse(c2);
        i2.teachCourse(c3);
        Instructor i3 = new Instructor("Miss Urooj","SE");
        i3.teachCourse(c3);

        Student s1 = new Student("Rafay",1,"SE");
        s1.learnCourse(c1);
        s1.learnCourse(c2);
        s1.learnCourse(c3);
        s1.learnCourse(c4);
        Student s2 = new Student("Omar",2,"CS");
        s2.learnCourse(c1);
        s2.learnCourse(c2);
        s2.learnCourse(c3);
        Student s3 = new Student("Danish",3,"EE");
        s3.learnCourse(c1);
        s3.learnCourse(c2);
        Student s4 = new Student("Hashir",4,"SE");
        s4.learnCourse(c1);
        Student s5 = new Student("Zeeshan",5,"CS");
        s5.learnCourse(c1);
        s5.learnCourse(c2);
        s5.learnCourse(c4);

        Management.showALlDetails();
    }
}
