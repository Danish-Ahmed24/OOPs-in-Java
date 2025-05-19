package FloodReliefCampSystemFRCS;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Family> families = FamilyFileHandler.loadFromFile(
                "danish.dat"
        );

//        try {
////            ReliefWorker worker = new ReliefWorker("d",2,"Doctor");
////            Family one = new Family(2,"1dft hai",worker);
////            one.updateNeeds(0,0,0);
////            families.add(one);
////
////            Family one1 = new Family(2,"2sdfast hai",worker);
////            one1.updateNeeds(0,0,0);
////            families.add(one1);
////
////            Family one2 = new Family(2,"3safdst hai",worker);
////            one2.updateNeeds(0,0,0);
////            families.add(one2);
//
//
//
//            FamilyFileHandler.saveToFile("danish.dat",families);
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//            }
//            for(Family f: FamilyFileHandler.loadFromFile("danish.dat"))
//            {
//                f.displayFamilyInfo();
//            }
            FamilyFileHandler.generateNeedsReport("danish.dat",families);
    }
}
