package PastPaper.Q1;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Batsman {
    private static int counter=1;
    private static int totalInnings;
    private int id;
    private String name;
    private int totalRuns;
    private int innings;
    private float avg;


    Batsman(int runs,int innings,String name)
    {
        this.innings=innings;
        this.totalRuns=runs;
        this.name=name;
        this.id=getCounter();
        this.avg=calcAvg();
        Batsman.totalInnings+=this.innings;
    }

    public static int getTotalInnings() {
        return totalInnings;
    }

    public static int getCounter() {
        return counter++;
    }

    public float calcAvg()
    {
        if(innings<=0)
        {
            System.out.println("Innings are Zero!");
            return 0.0f;
        }
        else {
            return (float) this.totalRuns/(float)this.innings;
        }
    }
    void displayDetails()
    {
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Total Runs : "+this.totalRuns);
        System.out.println("Innings: "+this.innings);
        System.out.println("Average: "+this.avg);
    }
}
class Team{
    private ArrayList<Batsman> players;
    public Team(){
        this.players=new ArrayList<>();
    }
    public void addBatsman(Batsman b)
    {
        this.players.add(b);
    }
    public void displayAll()
    {
        for(Batsman p : players)
        {
            p.displayDetails();
        }
    }
}
class Coach{
    private Team team;
    public Coach()
    {
        this.team=new Team();
    }
    public void addBatsman(Batsman b)
    {
        this.team.addBatsman(b);
    }

    public static void main(String[] args) {
        Batsman b1 = new Batsman(2,6,"Danish");
        Batsman b2 = new Batsman(4,6,"Hammad");
        Coach coach = new Coach();
        coach.addBatsman(b1);
        coach.addBatsman(b2);
        coach.team.displayAll();
    }
}
