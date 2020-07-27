package ita.vicky;

import java.util.HashSet;
import java.util.Set;

public class InputNumberGenerate {
    public int[] generate() {
        Set<Integer> repeatNum = new HashSet<>();
        StringBuilder answerString = new StringBuilder();
        while (answerString.length() < 4) {
            Integer ans = (int) (Math.random() * 10);
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
