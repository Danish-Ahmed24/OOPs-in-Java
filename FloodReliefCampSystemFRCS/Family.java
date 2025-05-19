package FloodReliefCampSystemFRCS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Family implements NeedsUpdatable , Serializable {
    private int familyId;
    private List<FamilyMember> members;
    private String campLocation;
    private Needs needs;
    private ReliefWorker assignedWorker;

    public Family(int familyId, String campLocation, ReliefWorker worker) {
        this.familyId = familyId;
        this.campLocation = campLocation;
        this.members = new ArrayList<>();
        this.assignedWorker = worker;
        this.needs = new Needs(0, 0, 0);
    }

    public int getFamilyId() { return familyId; }
    public String getCampLocation() { return campLocation; }
    public Needs getNeeds() { return needs; }
    public ReliefWorker getAssignedWorker() { return assignedWorker; }

    public void addMember(FamilyMember member) {
        members.add(member);
    }

    public void updateNeeds(int food, int medicine, int clothing) {
        needs.updateNeeds(food, medicine, clothing);
    }

    public boolean isHighPriority() {
        return needs.getFood() > 5 || needs.getMedicine() > 5 || needs.getClothing() > 5;
    }

    public void displayFamilyInfo() {
        System.out.println("Family ID: " + familyId + ", Camp: " + campLocation);
        assignedWorker.displayInfo();
        System.out.println("Needs - Food: " + needs.getFood() + ", Medicine: " + needs.getMedicine() + ", Clothing: " + needs.getClothing());
        for (FamilyMember m : members) {
            m.displayInfo();
        }
    }

}
