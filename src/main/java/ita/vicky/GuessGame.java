package ita.vicky;

import java.util.Arrays;

public class GuessGame {

    private int[] answer;

    public GuessGame(int[] answer) {
        this.answer = answer;
    }

    public String play(int[] inputNumber) {
        return getGameResult(inputNumber);
    }

    private String getGameResult(int[] inputNumber) {
        int numA = 0;
        int numB = 0;
        String result = "";
        int[] visited = new int[4];
        
        for (int i = 0; i < inputNumber.length; i++) {
            if (inputNumber[i] == answer[i]){
                numA++;
                visited[i] = 1;
            }
        }
        for (int i = 0; i < inputNumber.length; i++) {
            if (visited[i] != 1){
                for (int j = i; j < answer.length; j++) {
                    if (inputNumber[i] == answer[j]){
                        numB++;
                    }
                }
            }
        }

        result += Integer.valueOf(numA) + "A" + Integer.valueOf(numB) + "B";

        return result;
    }
}
