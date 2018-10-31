import java.util.Scanner;
import java.lang.Math;

public class HungerGamesSimulator {

    public static void main(String[] args) {

        initialize_game();

    }

    public static void initialize_game() {
        Scanner playerInput = new Scanner(System.in);
        int numOfPlayers;
        int dayCounter;

        System.out.println("Initiate game? y/n");
        if (playerInput.next().equals("n")) return;

        System.out.println("Welcome to the 2018th Annual Hunger Games!\n" +
                "Two people will be selected to participate from each district.\n" +
                "Only one will make it out of the arena alive.\n" +
                "How many districts are participating this year?");

        numOfPlayers = playerInput.nextInt() * 2;

        System.out.println("Please select your players.");

        for (int i = 0; i < numOfPlayers; i++) {
            System.out.print("District " + Math.round((i + 2) / 2) + " player " + (i % 2 + 1) + ": ");



            System.out.println();
        }

    }

    public static void turn_day() {

    }

    public static void turn_night() {

    }

    public static void turn_end() {

    }
}
