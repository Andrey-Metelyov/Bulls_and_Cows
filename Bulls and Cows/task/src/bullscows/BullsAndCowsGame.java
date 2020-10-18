package bullscows;

import java.util.Random;

public class BullsAndCowsGame {
    private int code;
//    private int turns = 0;

    static BullsAndCowsGame init() {
        return new BullsAndCowsGame();
    }

    private BullsAndCowsGame() {
        Random random = new Random();
        code = random.nextInt();
        System.out.println("The secret code is prepared: ****.");
    }

    public boolean successGuess(int guessNumber) {
//        System.out.println("Turn " + turns++ + 1 + " Answer:");
//        System.out.println(guessNumber);
        System.out.println("Grade: " + getGrade(guessNumber) + " .");
        if (guessNumber == code) {
            System.out.println("Congrats! The secret code is " + code + ".");
            return true;
        }
        return false;
    }

    private String getGrade(int guessNumber) {
        int bulls = 1;
        int cows = 1;
        return "3 bulls";
    }
}
