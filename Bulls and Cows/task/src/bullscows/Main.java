package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        int codeLength = scanner.nextInt();
        System.out.println("Input the number of possible symbols in the code:");
        int possibleSymbols = scanner.nextInt();
        BullsAndCowsGame game = BullsAndCowsGame.init(codeLength, possibleSymbols);
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
