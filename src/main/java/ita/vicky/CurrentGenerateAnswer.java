package ita.vicky;

import java.util.Random;

/**
 * @Author LINVI7
 * @Date 7/24/2020 9:04 AM
 * @Version 1.0
 */
public class CurrentGenerateAnswer implements GenerateAnswer{
    @Override
    public int[] generate() {
        int[] answer = new int[]{0,0,0,0};
        int randomNum = new Random().nextInt(10);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = randomNum;
        }

        return answer;
    }
}
