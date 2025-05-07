package Quiz3SolutionSectionB;

public abstract class Person {
    protected String name;
    protected int id;
    public String getName()
    {
        return this.name;
    }
    public int getInt()
    {
        return this.id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    abstract void displayInfo();
}
