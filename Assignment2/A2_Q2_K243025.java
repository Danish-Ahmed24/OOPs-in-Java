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

    public String getName() {
        return name;
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
                    System.out.println(visitors[i].getName()+" laughing to "+hauntedHouse.getGhosts().get(j).getNameOfWorker());
                }
                else if(visitors[i].getBravery()<hauntedHouse.getGhosts().get(j).getScareLevel())
                {
                    System.out.println(visitors[i].getName()+" screaming running away from "+hauntedHouse.getGhosts().get(j).getNameOfWorker());
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
        Visitor[] visitors1 = {
                new Visitor("Farhan",4),
                new Visitor("Zeeshan",8),
                new Visitor("Rafay",10)
        };

        Visitor[] visitors2 = {
                new Visitor("bisma",5),
                new Visitor("Zeeshan",8),
                new Visitor("Rafay",10)
        };

        Visitor[] visitors3 = {
                new Visitor("Farhan",4),
                new Visitor("Danish",6),
                new Visitor("bisma",5),
                        };
        HauntedHouse house1 = new HauntedHouse("BOLLYWOOD");
        HauntedHouse house2 = new HauntedHouse("VINEWOOD");
        HauntedHouse house3 = new HauntedHouse("HOLLYWOOD");

        Ghost g1 = new ShadowGhosts("Vampire",2);
        Ghost g2 = new Banshees("Darcula",7);
        Ghost g3 = new Poltergeists("Granny",9);
        Ghost g4 = new HybridGhost(g1,g2);

        house1.addGhost(g1);house1.addGhost(g2);
        house1.addGhost(g3);house1.addGhost(g4);

        house2.addGhost(g1);house2.addGhost(g2);
        house2.addGhost(g3);house2.addGhost(g4);

        house3.addGhost(g1);house3.addGhost(g2);
        house3.addGhost(g3);house3.addGhost(g4);

        System.out.println("---"+house1.getName()+"---");
        Visitor.visit(visitors1,house1);
        System.out.println("---"+house2.getName()+"---");
        Visitor.visit(visitors2,house2);
        System.out.println("---"+house3.getName()+"---");
        Visitor.visit(visitors3,house3);
    }
}
