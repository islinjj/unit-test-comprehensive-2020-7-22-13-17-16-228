package ita.vicky;

import java.util.Arrays;

import static ita.vicky.Number.NUMBER_LIMIT_LENGTH;

public class NumberValidator {
    public boolean isValid(int[] number) {
        return isValidLength(number) && isNotRepeatNumber(number);
    }

    private boolean isValidLength(int[] number) {
        return number.length == NUMBER_LIMIT_LENGTH;
    }

    public boolean isNotRepeatNumber(int[] number) {
        return (int)Arrays.stream(number).distinct().count() == number.length;
    }
}
