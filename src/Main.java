
interface Player{
    String name();
}
record BaseballPlayer(String name, String position) implements Player{}

public class Main {
    public static void main(String[] args) {

        Team<BaseballPlayer> Mariners = new Team("Mariners");
        Team<BaseballPlayer> Astros = new Team("Houston Astros");
        scoreResult(Mariners, 3, Astros, 5);

        var otani = new BaseballPlayer("O Syohei", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        Mariners.addTeamMember(otani);
        Mariners.addTeamMember(marsh);
        Mariners.listTeamMembers();

    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score){

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
