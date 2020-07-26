package ita.vicky;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberValidator {
    public boolean isValid(int[] number) {
        return isValidLength(number) && isNotRepeatNumber(number);
    }

    private boolean isValidLength(int[] number) {
        return number.length == 4;
    }

    private boolean isNotRepeatNumber(int[] number) {
        return (int)Arrays.stream(number).distinct().count() == number.length;
    }
}
