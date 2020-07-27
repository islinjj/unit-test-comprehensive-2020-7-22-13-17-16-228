package ita.vicky;

import java.util.ArrayList;
import java.util.List;

import static ita.vicky.Number.NUMBER_LIMIT_LENGTH;

public class GenerateAnswer{

    public int[] generate() {
        List<Integer> answer = new ArrayList<>();
        while (answer.size() < NUMBER_LIMIT_LENGTH) {
            int ans = (int) (Math.random() * 10);
            if (!answer.stream().anyMatch(num -> num == ans)) {
                answer.add(ans);
            }
        }
        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }
}
