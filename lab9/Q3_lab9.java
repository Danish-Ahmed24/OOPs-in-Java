package lab9;

class Robot{
    protected int x,y;
    protected String direction;
    public Robot(int x,int y,String direction)
    {
        this.x=x;
        this.y=y;
        this.direction=direction;
    }
    public void displayInitialPosition()
    {
        System.out.println("initial position: ("+this.x+","+this.y+")");
    }
}

class MovingRobot extends Robot{
    public MovingRobot(int x,int y,String direction)
    {
        super(x,y,direction);
    }
    public void moveRobot(String direction,int steps)
    {
        if(direction.equals("N"))
        {
            this.y+=steps;
        }
        else if(direction.equals("S"))
        {
            this.y-=steps;
        }
        else if(direction.equals("E"))
        {
            this.x+=steps;
        }
        else if(direction.equals("W"))
        {
            this.x-=steps;
        }
        else {
            System.out.println("Invalid direction :/");
        }
    }
    public void displayUpdatedXY()
    {
        System.out.println("updated position: ("+this.x+","+this.y+")");
    }
}

public class Q3_lab9 {
    public static void main(String[] args) {
        MovingRobot robot = new MovingRobot(0,0,"S");
        robot.displayInitialPosition();
        robot.moveRobot("E",3);
        robot.moveRobot("N",5);
        robot.moveRobot("W",6);
        robot.moveRobot("S",2);
        robot.displayUpdatedXY();
    }
}
