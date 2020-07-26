package ita.vicky;

import java.util.Arrays;

public class GuessNumberValidator {
    public boolean isValid(int[] inputNumber) {
        return inputNumber.length == 4 && Arrays.stream(inputNumber).noneMatch(input -> Arrays.stream(inputNumber).anyMatch(i -> i == input));
    }
}
