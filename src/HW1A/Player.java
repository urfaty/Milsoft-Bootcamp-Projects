package HW1A;

public class Player {

    private long playerId;
    private String playerName;
    private double avarageScore;
    private Team team;

    public Player() {

    }

    public Player(long playerId, String playerName, double avarageScore) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.avarageScore = avarageScore;
    }

    public Player(Team team) {
        this.team = team;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getAvarageScore() {
        return avarageScore;
    }

    public void setAvarageScore(double avarageScore) {
        this.avarageScore = avarageScore;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


}
