package FloodReliefCampSystemFRCS;

public class FamilyMember extends Person{

    public FamilyMember(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: "+getName()+" Id: "+getId());
    }
}
