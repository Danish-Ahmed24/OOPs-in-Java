package Quiz3SolutionSectionB;

import java.util.ArrayList;
import java.util.Arrays;

public interface FileOperations {
    void saveToFile(String file, ArrayList<Patient> patients);
    ArrayList<Patient> loadFromFile(String file);
    ArrayList<Patient> filterHotspotPatients(ArrayList<Patient> patients,double tempThreshold , int caseThreshold);

}
