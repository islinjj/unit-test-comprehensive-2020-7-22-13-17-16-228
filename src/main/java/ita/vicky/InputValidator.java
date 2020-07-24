package ita.vicky;

import java.util.HashSet;

/**
 * @Author LINVI7
 * @Date 7/24/2020 9:10 AM
 * @Version 1.0
 */
public class InputValidator {
    private boolean isValidInput(int[] inputNumber) {
        return inputNumber.length == 4 && isRepeatNum(inputNumber);
    }

    private boolean isRepeatNum(int[] inputNumber) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < inputNumber.length; i++) {
            hashSet.add(inputNumber[i]);
        }
        return hashSet.size() == inputNumber.length;
    }
}
