package lab6;

public class Q2_lab6 {

}
class Patient{
    private MedicalRecord medicalRecord;

    public Patient(String illnessHistory,String prescriptions,String doctorNotes,String testResults)
    {
        this.medicalRecord=new MedicalRecord(illnessHistory,prescriptions,doctorNotes,testResults);

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
}
