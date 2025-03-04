package A2.Q2_k243025;

public class Robot {
    private String name;
    private int hits;
    public Robot(String name)
    {
        this.name=name;
        this.hits=0;
    }

    public int getHits() {
        return hits;
    }

    public void hitBall(Ball ball, String direction) {
        this.hits++;
        if (direction.equals("up"))
            ball.move(0, 1);
        else if (direction.equals("down"))
            ball.move(0, -1);
        else if (direction.equals("left"))
            ball.move(-1, 0);
        else if (direction.equals("right"))
            ball.move(1, 0);
        else {
            this.hits--;
            System.out.println("Invalid direction!");
        }
    }
}
