package Q11;

class Tournament {
    Tournament() {
        System.out.println("Champions Trophy 2025 Tournament Created");
    }

    Tournament(String hostCountry) {
        this();
        System.out.println("Host Country: " + hostCountry);
    }
    Tournament(String hostCuntry,int noOfMatches){
        this(hostCuntry);
        System.out.println("The Tournament has "+noOfMatches+" matches");
    }
}

class Team extends Tournament {
    Team() {
        this("Unknown Team");
        System.out.println("Team's Default Constructor");
    }

    Team(String teamName) {
        super("Pakistan",15);
        System.out.println("Participating Team: " + teamName);
    }
}

class Player extends Team {
    Player() {
        this("Unknown Player", "All-Rounder");
        System.out.println("Player's Default Constructor");
    }

    Player(String playerName) {
        super("Pakistan Team");
        System.out.println("Player Name: " + playerName);
    }

    Player(String playerName, String role) {
        this(playerName);
        System.out.println("Player Role: " + role);
    }
}

