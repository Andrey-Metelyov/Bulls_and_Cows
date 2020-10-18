package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        BullsAndCowsGame game = BullsAndCowsGame.init();
        Scanner scanner = new Scanner(System.in);
        int guessNumber;
        int turn = 1;
        do {
            System.out.println("Turn " + turn++ + ". Answer:");
            guessNumber = scanner.nextInt();
        } while (!game.successGuess(guessNumber));
    }
}
