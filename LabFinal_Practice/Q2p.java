package LabFinal_Practice;

class AdmissionRecord<T>{
    T detail;
    public AdmissionRecord(T detail)
    {
        this.detail=detail;
    }

    public T getDetail() {
        return detail;
    }
}
public class Q2p {
    public static void main(String[] args) {
        AdmissionRecord<String> name = new AdmissionRecord<>("Name");
        System.out.println(name.getDetail());
    }
}
