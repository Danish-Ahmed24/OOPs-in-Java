package A2.Q2_k243025;

public class Team {
    private String teamName;
    private Robot robot;
    public Team(String name,Robot robot)
    {
        this.teamName=name;
        this.robot=robot;
    }

    public Robot getRobot() {
        return robot;
    }

    public String getTeamName() {
        return teamName;
    }
}
