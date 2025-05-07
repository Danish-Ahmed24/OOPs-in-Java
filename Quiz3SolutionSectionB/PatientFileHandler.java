package Quiz3SolutionSectionB;

import java.io.*;
import java.util.ArrayList;

public class PatientFileHandler implements Serializable,FileOperations {
    @Override
    public void saveToFile(String filename, ArrayList<Patient> patients) {
        try{
          ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
          out.writeObject(patients);
          out.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<Patient> loadFromFile(String file) {
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
            return (ArrayList<Patient>) inputStream.readObject();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public ArrayList<Patient> filterHotspotPatients(ArrayList<Patient> patients, double tempThreshold , int caseThreshold) {
        ArrayList<String> campLocations=new ArrayList<>();
        ArrayList<Integer> caseCounts=new ArrayList<>();
        for(Patient patient:patients)
        {
            if(campLocations.contains(patient.getCampLocation()))
            {
                caseCounts.set(campLocations.indexOf(patient), caseCounts.get(campLocations.indexOf(patient))+1);
            }else{
                campLocations.add(patient.getCampLocation());
                caseCounts.add(1);
            }
        }

        ArrayList<Patient> result = new ArrayList<>();
        for(Patient patient:patients)
        {
            if(     campLocations.contains(patient.getCampLocation())
                    && patient.getVitals().getTemperature()>tempThreshold
                    && caseCounts.get(campLocations.indexOf(patient.getCampLocation()))>caseThreshold
            )
            {
                result.add(patient);
            }
        }
        return result;
    }
}
