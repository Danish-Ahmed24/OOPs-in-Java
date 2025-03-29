package Assignment2;

import java.util.ArrayList;

class HauntedHouse{
    private String name;
    private ArrayList<Ghost> ghosts;//run time polymorphism

    public HauntedHouse(String name)
    {
        this.name=name;
        this.ghosts=new ArrayList<>();
    }
    public ArrayList<Ghost> getGhosts() {
        return ghosts;
    }
    public void addGhost(Ghost g)
    {
        this.ghosts.add(g);
    }
}
class Ghost{
    private String nameOfWorker;
    private int scareLevel;

    public Ghost(String nameOfWorker,int scareLevel){this.nameOfWorker=nameOfWorker;this.scareLevel=scareLevel;}
    public Ghost(String nameOfWorker1,String nameOfWorker2,int scareLevel1,int scareLevel2){
        this.nameOfWorker=nameOfWorker1+" "+nameOfWorker2;
        this.scareLevel=scareLevel1+scareLevel2;
    }

    public void haunting() {System.out.println("Haunting");}
    public void display() {System.out.println("Name: "+this.nameOfWorker+"Scare Level : "+this.scareLevel);}
    public void increaseLevel(Ghost ghost){
        this.nameOfWorker+=ghost.nameOfWorker;
        this.scareLevel+=ghost.scareLevel;
    }

    public String getNameOfWorker() {
        return nameOfWorker;
    }

    public int getScareLevel() {
        return scareLevel;
    }
}
class Poltergeists extends Ghost{
    public Poltergeists(String nameOfWorker,int scareLevel){
        super(nameOfWorker,scareLevel);
    }
    @Override
    public void haunting() {
        System.out.println("Moving Objects");
    }
}
class Banshees extends Ghost{
    public Banshees(String nameOfWorker,int scareLevel){
        super(nameOfWorker,scareLevel);
    }
    @Override
    public void haunting() {
        System.out.println("Screaming Loudly");
    }
}
class ShadowGhosts extends Ghost{
    public ShadowGhosts(String nameOfWorker,int scareLevel){
        super(nameOfWorker,scareLevel);
    }
    @Override
    public void haunting() {
        System.out.println("Whispering Creepily");
    }
}
class HybridGhost extends Ghost{
    private Ghost g1,g2;
    public HybridGhost(Ghost g1,Ghost g2){
        super(g1.getNameOfWorker(),g2.getNameOfWorker(),g1.getScareLevel(),g2.getScareLevel());
        this.g1=g1;
        this.g2=g2;
    }
    @Override
    public void haunting() {
        g1.haunting();
        g2.haunting();
    }
}
class Visitor{
    private String name;
    private int bravery;
    public Visitor(String name,int bravery)
    {
        this.name=name;
        this.bravery=bravery;
    }
    public static void visit(Visitor[] visitors,HauntedHouse hauntedHouse){
        for(int i=0;i<visitors.length;i++)
        {
            for(int j=0;j<hauntedHouse.getGhosts().size();j++)
            {
                if(visitors[i].getBravery()>hauntedHouse.getGhosts().get(j).getScareLevel())
                {
                    System.out.println(visitors[i].getName()+" laughing to "+hauntedHouse.getGhosts().get(i).getNameOfWorker());
                }
                else if(visitors[i].getBravery()<hauntedHouse.getGhosts().get(j).getScareLevel())
                {
                    System.out.println(visitors[i].getName()+" screaming running away from "+hauntedHouse.getGhosts().get(i).getNameOfWorker());
                }
                else {
                    System.out.println(visitors[i].getName()+"Shaky voice to "+hauntedHouse.getGhosts().get(i).getNameOfWorker());
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getBravery() {
        return bravery;
    }
}
public class A2_Q2_K243025 {

    public static void main(String[] args) {
        Visitor[] visitors = {new Visitor("Danish",6),new Visitor("bisma",5),new Visitor("Rafay",10)};
        HauntedHouse house1 = new HauntedHouse("BOLLYWOOD");
        Ghost g11 = new ShadowGhosts("Adeel",1);
        Ghost g12 = new Banshees("Bilal",7);
        Ghost g13 = new Poltergeists("Adil",9);
        house1.addGhost(g11);
        house1.addGhost(g12);
        house1.addGhost(g13);
        Visitor v1 = new Visitor("Danish",5);
        Visitor.visit(visitors,house1);
    }
}
