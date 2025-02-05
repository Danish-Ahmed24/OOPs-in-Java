package Q4;

public class Course {
    private String courseCode,courseName;
    private float creditHours;
    void setCourseCode(String cc){
        if(cc.length()==5){
        this.courseCode =cc;
        }
        else{
            System.out.println("Invalid Format");
        }
    }
    void setCourseName(String cn){
        this.courseName = cn;
    }
    void setCreditHours(float ch){
        if(ch>=1 && ch<=4)
        {this.creditHours = ch;}
        else
        {
            System.out.println("Credit Hours should be between 1 and 4");
        }
    }

    String getCourseCode(){
        return(this.courseCode);
    }
    String getCourseName(){
        return (this.courseName);
    }
    float getCreditHours(){
        return (this.creditHours);
    }
}

//Design a Course class with private attributes courseCode, courseName, and creditHours. Implement
//getter and setter methods to access and modify these attributes while maintaining encapsulation.
//         The setter methods should validate that courseCode follows a standard format (e.g., "CS101") and that
//creditHours is between 1 and 4.
//         The getter methods should allow students to view course details.
//Create an object of the Course class, use the setter methods to assign values, and then retrieve and display the course
//details using getter methods.