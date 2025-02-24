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
                    if (!PlayerA.equalsIgnoreCase("R") && !PlayerA.equalsIgnoreCase("P") && !PlayerA.equalsIgnoreCase("S")) {
                        System.out.println("This input is invalid");
                    }else {
                System.out.println("PlayerB, pick a move R, P or S: ");
                PlayerB = in.nextLine();
                    if (!PlayerB.equalsIgnoreCase("R") && !PlayerB.equalsIgnoreCase("P") && !PlayerB.equalsIgnoreCase("S")) {
                        System.out.println("This input is invalid");
                        }
                    }
                    if (PlayerA.equalsIgnoreCase("R")) {
                        if (PlayerB.equalsIgnoreCase("R")) {
                            System.out.println("Rock vs Rock, it's a tie!");
                        }else if (PlayerB.equalsIgnoreCase("P")) {
                            System.out.println("Paper covers Rock, PlayerB wins!");
                        }else if (PlayerB.equalsIgnoreCase("S")) {
                            System.out.println("Rock breaks Scissors, PlayerA wins!");
                        }
                    }else if (PlayerA.equalsIgnoreCase("P")) {
                        if (PlayerB.equalsIgnoreCase("P")) {
                            System.out.println("Paper vs Paper, it's a tie!");
                        } else if (PlayerB.equalsIgnoreCase("R")) {
                            System.out.println("Paper covers Rock, PlayerA wins!");
                        } else if (PlayerB.equalsIgnoreCase("S")) {
                            System.out.println("Scissors cuts Paper, PlayerB wins!");
                        }
                    }else if (PlayerA.equalsIgnoreCase("S")) {
                        if (PlayerB.equalsIgnoreCase("S")) {
                            System.out.println("Scissors vs Scissors, it's a tie!");
                        } else if (PlayerB.equalsIgnoreCase("R")) {
                            System.out.println("Rock breaks Scissors, PlayerB wins!");
                        } else if (PlayerB.equalsIgnoreCase("P")) {
                            System.out.println("Scissors cuts Paper, PlayerA wins!");
                        }
                    }
                System.out.println("Do you want to play again, type Y for Yes or N for No: ");
                KeepPlaying = in.nextLine();
            }while (KeepPlaying.equals("Y"));
    }
}