package A2.Q2_k243025;

public class Main {
    public static void main(String[] args) {
        Robot roboDani = new Robot("Dani");
        Robot roboRafi = new Robot("Rafi");
        Team team1 = new Team("Danish",roboDani);
        Team team2 = new Team("Rafay",roboRafi);
        Goal goal = new Goal(3,3);
        Ball ball = new Ball(0,0);
        Game game = new Game(team1,team2,ball,goal);
        game.startGame();
        game.declareWinner();
    }
}