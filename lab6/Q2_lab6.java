package lab6;

import java.util.ArrayList;

public class Q2_lab6 {
    public static void main(String[] args) {
        Patient p1 = new Patient(   "Hamza",
                                    13,
                                    "3 months ago",
                                    "Prescription",
                                    "Get well soon",
                                    "50% ok!");
        Patient p2 = new Patient(   "Bilal",
                18,
                "4 months ago",
                "Prescription",
                "Take rest",
                "No desease");
        for(Patient patient : Patient.getPatients())
        {
            patient.displayPatient();
        }


    }
}
class Patient{
    private static ArrayList<Patient> patients = new ArrayList<>();
    private MedicalRecord medicalRecord;
    private String name;
    private int age;
    public Patient(String name,int age,String illnessHistory,String prescriptions,String doctorNotes,String testResults)
    {
        this.name=name;
        this.age=age;
        this.medicalRecord=new MedicalRecord(illnessHistory,prescriptions,doctorNotes,testResults);
        patients.add(this);
    }
    public void displayPatient()
    {
        System.out.println("----------");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        this.medicalRecord.displayMedicalReport();
    }

    public static ArrayList<Patient> getPatients() {
        return patients;
    }
}
class MedicalRecord{
    private String illnessHistory,prescriptions,doctorNotes,testResults;
    public MedicalRecord(String illnessHistory,String prescriptions,String doctorNotes,String testResults)
    {
        this.doctorNotes=doctorNotes;
        this.prescriptions=prescriptions;
        this.testResults=testResults;
        this.illnessHistory=illnessHistory;
        System.out.println("Medical Record Generated!");
    }
    public void displayMedicalReport()
    {
        System.out.println("----REPORT----");
        System.out.println("Illness History: "+this.illnessHistory);
        System.out.println("Prescriptions: "+this.prescriptions);
        System.out.println("Doctor Notes: "+this.doctorNotes);
        System.out.println("Test Results: "+this.testResults);
    }
}
