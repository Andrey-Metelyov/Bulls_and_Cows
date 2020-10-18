package bullscows;

import java.util.Random;

public class BullsAndCowsGame {
    private String code;
//    private int turns = 0;

    static BullsAndCowsGame init() {
        return new BullsAndCowsGame();
    }

    private BullsAndCowsGame() {
        code = "9876";
//        code = prepareCode();
        System.out.println("The secret code is prepared: ****." + code);
    }

    private String prepareCode() {
        Random random = new Random();
        int number;
        do {
            number = random.nextInt() % 10000;
        } while (number < 999);
        String code = String.valueOf(number);
        return code;
    }

    public boolean successGuess(String guessNumber) {
//        System.out.println("Turn " + turns++ + 1 + " Answer:");
//        System.out.println(guessNumber);
        System.out.println("Grade: " + getGrade(guessNumber) + ".");
        if (guessNumber.equals(code)) {
            System.out.println("Congrats! The secret code is " + code + ".");
            return true;
        }
        return false;
    }

    private String getGrade(String guessNumber) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == guessNumber.charAt(i)) {
                bulls++;
            } else if (code.contains(guessNumber.substring(i, i + 1))) {
                cows++;
            }
        }
        if (bulls == 0 && cows == 0) {
            return "None";
        }
        String result = "";
        if (bulls > 1) {
            result = bulls + " bulls";
        } else if (bulls == 1) {
            result = bulls + " bull";
        }
        if (cows > 0) {
            if (bulls > 0) {
                result += " and ";
            }
            if (cows > 1) {
                result += cows + " cows";
            } else if (cows == 1) {
                result += cows + " cow";
            }
        }
        return result;
    }
}
