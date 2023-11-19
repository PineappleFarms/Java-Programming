package itsc1212lab04;

/**
     * @author dlopez18 ITCS1212-101 & 102, Fall 2022
     * @version 1
     * @since 2022-09-19 Lab 04 - RPSGame
     */
import java.util.Scanner;

public class RPSGame {

    // 1 is Rock
    // 2 is Paper
    // 3 is Scissors
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Add print statement to welcome User to the game
        System.out.println("Welcome to ROCK,PAPER,SCISSORS!!!");
        // Add print statement prompting User to enter 1, 2, or 3 (explain which each number represents)
        System.out.println("Enter number 1(Rock), 2(Paper), or 3(Scissors): ");
        // User scnr.nextInt() to collect user input, save it as an int variable called choice
        int choice = scnr.nextInt();
        
	int computerChoice = ((int)(Math.random() * 4));// Complete this line using Math.random() to generate a int
                             // In the range 1-3
        playGame(choice, computerChoice);
    }


    public static void playGame(int choice, int computerChoice) {

	//Print statements for User choice
        if (choice == 1) {
            System.out.println("User chose Rock");
        } else if (choice == 2) {
            System.out.println("User chose Paper");
        } else {
            System.out.println("User chose Scissors");
        }

	//Print statements for Computer choice
	if (computerChoice == 1) {
            System.out.println("Computer chose Rock.");
        } else if (computerChoice == 2) {
            System.out.println("Computer chose Paper.");
        } else {
            System.out.println("Computer chose Scissors.");
        }

	// Determining the Winner 	
        if (computerChoice == choice) {
            System.out.println("It's a tie!");
        } else if (computerChoice == 1 && choice == 2) {
            System.out.println("Paper beats rock, Player wins!");
        } else if (computerChoice == 2 && choice == 1) {
            System.out.println("Paper beats rock, Player loses!");
        } else if (computerChoice == 2 && choice == 3) {
            System.out.println("Scissors beats rock, Player wins!");
        } else if (computerChoice == 3 && choice == 2) {
            System.out.println("Scissors beats rock, Player loses!");
        } else if (computerChoice == 1 && choice == 3) {
            System.out.println("Rock beats Scissors, Player loses!");
        } else if (computerChoice == 3 && choice == 1) {
            System.out.println("Rock beats Scissors, Player wins!");
        }

    }

}