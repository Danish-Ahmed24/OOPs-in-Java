package FloodReliefCampSystemFRCS;

public class ReliefWorker extends Person{
    private String role;
    public ReliefWorker(String name,int id,String role) throws InvalidParamenterForConstructorException
    {
        super(name,id);
        if(role.equalsIgnoreCase("Doctor")||role.equalsIgnoreCase("Volunteer"))
        {
            this.role=role;
        }else {
            throw new InvalidParamenterForConstructorException("Role can be either Doctor or Volunteer");
        }
    }

    @Override
    public void displayInfo()
    {
        System.out.println("ID: "+this.id+" Name: "+this.name+" Role: "+this.role);
    }

    public void assist(Family f){

    }
}
