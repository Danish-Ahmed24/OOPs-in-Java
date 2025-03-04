package A2.Q2_k243025;

import java.util.ArrayList;

public class Ball {
    private ArrayList<Integer> position;
    public Ball(int x,int y)
    {
        this.position=new ArrayList<>(2);
        this.position.add(x);
        this.position.add(y);
    }
    int getX()
    {
        return this.position.get(0);
    }
    int getY()
    {
        return this.position.get(1);
    }
    void move(int dx,int dy)
    {
        this.position.set(0,this.position.get(0)+dx);
        this.position.set(1,this.position.get(1)+dy);
    }
    ArrayList<Integer> getPosition()
    {
        return this.position;
    }
    void resetBall()
    {
        this.position.set(0,0);
        this.position.set(1,0);
    }
}