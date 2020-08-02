package ita.vicky;

import java.util.HashSet;
import java.util.Set;

import static ita.vicky.normal.Number.NUMBER_LIMIT_LENGTH;
import static ita.vicky.normal.Number.RANDOM_LIMIT;

public class InputNumberGenerate {
    public int[] generate() {
        Set<Integer> repeatNum = new HashSet<>();
        StringBuilder answerString = new StringBuilder();
        while (answerString.length() < NUMBER_LIMIT_LENGTH) {
            Integer ans = (int) (Math.random() * RANDOM_LIMIT);
            if (!repeatNum.contains(ans)) {
                answerString.append(ans);
            }
            repeatNum.add(ans);
        }
        int[] inputNumber = new int[answerString.length()];
        for (int i = 0; i < answerString.length(); i++) {
            inputNumber[i] = Integer.parseInt(answerString.substring(i, i + 1));
        }
        return inputNumber;
    }
}
