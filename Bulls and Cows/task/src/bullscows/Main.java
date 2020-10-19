package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        int codeLength = scanner.nextInt();
        BullsAndCowsGame game = BullsAndCowsGame.init(codeLength);
        System.out.println("Okay, let's start a game!");
        String guessNumber;
        int turn = 1;
//        String[] answers = {"1234", "9876"};
        do {
//            System.out.println();
            System.out.println("Turn " + turn + ":");
            guessNumber = scanner.next();
//            guessNumber = answers[turn - 1];
//            System.out.println(guessNumber);
            turn++;
        } while (!game.successGuess(guessNumber));
    }
}
