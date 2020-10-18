package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        BullsAndCowsGame game = BullsAndCowsGame.init();
        Scanner scanner = new Scanner(System.in);
        String guessNumber;
        int turn = 1;
//        String[] answers = {"1234", "9876"};
        do {
//            System.out.println();
//            System.out.println("Turn " + turn + ". Answer:");
            guessNumber = scanner.nextLine();
//            guessNumber = answers[turn - 1];
//            System.out.println(guessNumber);
            turn++;
        } while (!game.successGuess(guessNumber));
    }
}
