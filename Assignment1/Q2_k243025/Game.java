package A2.Q2_k243025;

import java.util.Scanner;

public class Game {
    private Team[] teams;
    private Ball ball;
    private Goal goal;
    private String directionTemp;
    Scanner in = new Scanner(System.in);
    public Game(Team t1,Team t2,Ball ball,Goal goal)
    {
        this.teams=new Team[2];
        this.teams[0]=t1;
        this.teams[1]=t2;
        this.ball=ball;
        this.goal=goal;
    }
    void startGame()
    {
        int turn =0;
        while(!this.goal.isGoalReached(this.ball.getX(),this.ball.getY()))
        {
            this.play(this.teams[turn]);
        }
        System.out.println(this.teams[turn].getTeamName()+" Goaled :)");
        this.ball.resetBall();
        turn = 1;
        while(!this.goal.isGoalReached(this.ball.getX(),this.ball.getY()))
        {
            this.play(this.teams[turn]);
        }
        System.out.println(this.teams[turn].getTeamName()+" Goaled :)\n\n");

    }
    void play(Team team)
    {
        System.out.println("Enter direction (left,right,up,down) "+team.getTeamName()+" "+this.ball.getPosition()+": ");
        this.directionTemp=in.next();
        team.getRobot().hitBall(this.ball,this.directionTemp);
    }
    void declareWinner()
    {
        System.out.println(this.teams[0].getTeamName()+" Hits: "+this.teams[0].getRobot().getHits());
        System.out.println(this.teams[1].getTeamName()+" Hits: "+this.teams[1].getRobot().getHits());
        if(this.teams[0].getRobot().getHits()<this.teams[1].getRobot().getHits())
        {
            System.out.println("Team "+this.teams[0].getTeamName()+" Won");
        }
        else if(this.teams[0].getRobot().getHits()>this.teams[1].getRobot().getHits())
        {
            System.out.println("Team "+this.teams[1].getTeamName()+" Won");
        }
        else {
            System.out.println("TIE");
        }
    }
}
