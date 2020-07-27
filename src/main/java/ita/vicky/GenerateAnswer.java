package ita.vicky;

import java.util.HashSet;
import java.util.Set;

import static ita.vicky.Number.NUMBER_LIMIT_LENGTH;

public class GenerateAnswer{

    public int[] generate() {
        Set<Integer> repeatNum = new HashSet<>();
        StringBuilder answerString = new StringBuilder();
        while (answerString.length() < NUMBER_LIMIT_LENGTH) {
            int ans = (int) (Math.random() * 10);
            if (!repeatNum.contains(ans)) {
                answerString.append(ans);
            }
            repeatNum.add(ans);
        }

        return formatAnswer(answerString);
    }

    private int[] formatAnswer(StringBuilder answerString) {
        int[] answer = new int[answerString.length()];
        for (int i = 0; i < answerString.length(); i++) {
            answer[i] = Integer.parseInt(answerString.substring(i, i + 1));
        }
        return answer;
    }
}
