import java.util.Scanner;

public class Game {



    public static void main(String[] args) {

        Team team1 = getTeamDetails();
        Team team2 = getTeamDetails();

        if (team1.getScore() > team2.getScore()) {
            System.out.println(team1.getName() + " won the match.");
        }
        else if (team2.getScore() > team1.getScore()) {
            System.out.println(team2.getName() + " won the match.");
        }
        else {
            System.out.println("The match was a draw.");
        }
    }

    private static Team getTeamDetails() {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team();
        System.out.println("Please enter the team name");
        team.setName(scanner.nextLine());
        System.out.println("Please enter the team's score");
        team.setScore(scanner.nextInt());
        return team;
    }
}
