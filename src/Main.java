import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String PlayerA = "";
        String PlayerB = "";
        String KeepPlaying = "";
            do {
                System.out.println("PlayerA, pick a move R, P or S: ");
                PlayerA = in.nextLine();
                System.out.println("PlayerB, pick a move R, P or S: ");
                PlayerB = in.nextLine();
                    if (PlayerA.equals ("R") && PlayerB.equals ("R")) {
                        System.out.println("ROCK vs ROCK, it's a tie!");
                    }
                    else if (PlayerA.equals ("R") && PlayerB.equals ("P")) {
                        System.out.println("PAPER covers ROCK, PlayerB wins!");
                    }
                    else if (PlayerA.equals ("R") && PlayerB.equals ("S")) {
                        System.out.println("ROCK crushes SCISSORS, PlayerA wins!");
                    }
                    else if (PlayerA.equals ("P") && PlayerB.equals ("P")) {
                        System.out.println("PAPER vs PAPER, it's a tie!");
                    }
                    else if (PlayerA.equals ("P") && PlayerB.equals ("R")) {
                        System.out.println("PAPER covers ROCK, PlayerA wins!");
                    }
                    else if (PlayerA.equals ("P") && PlayerB.equals ("S")) {
                        System.out.println("SCISSORS cuts PAPER, PlayerB wins!");
                    }
                    else if (PlayerA.equals ("S") && PlayerB.equals ("S")) {
                        System.out.println("SCISSORS vs SCISSORS, it's a tie!");
                    }
                    else if (PlayerA.equals ("S") && PlayerB.equals ("R")) {
                        System.out.println("ROCK crushes SCISSORS, PlayerB wins!");
                    }
                    else if (PlayerA.equals ("S") && PlayerB.equals ("P")) {
                        System.out.println("SCISSORS cuts PAPER, PlayerA wins!");
                    }
        }
    }
}