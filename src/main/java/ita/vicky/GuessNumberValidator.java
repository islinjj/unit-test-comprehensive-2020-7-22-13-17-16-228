package ita.vicky;

import java.util.Arrays;

public class GuessNumberValidator {
    public boolean isValid(int[] inputNumber) {
        return isValidLength(inputNumber) && isNotRepeatNumber(inputNumber) && isAllNumber(inputNumber);
    }

    private boolean isValidLength(int[] inputNumber) {
        return inputNumber.length == 4;
    }

    private boolean isAllNumber(int[] inputNumber) {
        return !String.valueOf(inputNumber).matches(".*^[\\d]+.*");
    }

    private boolean isNotRepeatNumber(int[] inputNumber) {
        return Arrays.stream(inputNumber).noneMatch(input -> Arrays.stream(inputNumber).noneMatch(i -> i == input));
    }
}
