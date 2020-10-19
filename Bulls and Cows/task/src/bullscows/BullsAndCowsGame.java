package bullscows;

import java.security.InvalidParameterException;
import java.util.Random;

public class BullsAndCowsGame {
    private String code;
//    private int turns = 0;

    static BullsAndCowsGame init(int codeLength) {
        if (codeLength > 10) {
            System.out.println("Error: can't generate a secret number with a length of 11 because there aren't enough unique digits.");
//            throw new InvalidParameterException();
            return null;
        }
        return new BullsAndCowsGame(codeLength);
    }

    private BullsAndCowsGame(int codeLength) {
//        code = "9305";
        code = prepareCode(codeLength);
        System.out.println("The random secret number is " + code + ".");
//        System.out.println("The secret code is prepared: ****." + code);
    }

    private String prepareCode(int codeLength) {
        Random random = new Random();
        long number;
        String code = "";
        do {
            number = random.nextLong();
//            System.out.println(number);
            while (number > 0 && code.length() < codeLength) {
                String digit = String.valueOf((int) (number % 10));
                if (!code.contains(digit)) {
                    code += digit;
                }
                number /= 10;
            }
        } while (code.length() < codeLength);
//        String code = String.valueOf(number);
        return code;
    }

    public boolean successGuess(String guessNumber) {
//        System.out.println("Turn " + turns++ + 1 + " Answer:");
//        System.out.println(guessNumber);
//        System.out.println("Grade: " + getGrade(guessNumber) + ". The secret code is " + code + ".");
        System.out.println("Grade: " + getGrade(guessNumber));
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
        if (bulls > 0) {
            result = bulls + " bull(s)";
        }
        if (cows > 0) {
            if (bulls > 0) {
                result += " and ";
            }
            result += cows + " cow(s)";
        }
//        if (bulls > 1) {
//            result = bulls + " bulls";
//        } else if (bulls == 1) {
//            result = bulls + " bull";
//        }
//        if (cows > 0) {
//            if (bulls > 0) {
//                result += " and ";
//            }
//            if (cows > 1) {
//                result += cows + " cows";
//            } else if (cows == 1) {
//                result += cows + " cow";
//            }
//        }
        return result;
    }
}
