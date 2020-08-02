package ita.vicky;

import java.util.Arrays;

import static ita.vicky.normal.Number.*;

public class NumberValidator {
    public boolean isValid(int[] number) {
        return isValidLength(number) && isNotRepeatNumber(number) && isNumberRange0To9(number);
    }

    private boolean isValidLength(int[] number) {
        return number.length == NUMBER_LIMIT_LENGTH;
    }

    public boolean isNotRepeatNumber(int[] number) {
        return (int) Arrays.stream(number).distinct().count() == NUMBER_LIMIT_LENGTH;
    }

    public boolean isNumberRange0To9(int[] number) {
        return Arrays.stream(number).allMatch(item -> item >= NUMBER_MIN_VALUE && item < NUMBER_MAX_VALUE);
    }
}
