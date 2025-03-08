package A2.Q4_k243025;

import java.util.*;

public class BusStop {
    private String stopID;
    private String location;
    private ArrayList<Student> studentsList = new ArrayList<>();
    
    public BusStop(String stopID, String location) {
        this.stopID = stopID;
        this.location = location;
    }
    
    public void assignStudent(Student student)
    {
        studentsList.add(student);
    }
}