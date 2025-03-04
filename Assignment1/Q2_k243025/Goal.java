package A2.Q2_k243025;

public class Goal {

    private int x , y;
    public Goal(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public boolean isGoalReached(int ballX, int ballY) {
        if (this.x == ballX && this.y == ballY) {
            return true;
        } else {
            return false;
        }
    }

}