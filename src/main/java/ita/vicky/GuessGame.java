package ita.vicky;

import java.util.HashSet;

public class GuessGame {

    private int[] answer;

    public GuessGame(int[] answer) {
        this.answer = answer;
    }

    public GuessGame() {
        answer = new int[4];
    }

    public String play(int[] inputNumber) {
        if (isValidInput(inputNumber)) {
            return getGameResult(inputNumber);
        }
        return "Wrong Input，Input again";
    }

    private boolean isValidInput(int[] inputNumber) {
        return isRepeatNum(inputNumber);
    }

    private boolean isRepeatNum(int[] inputNumber) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < inputNumber.length; i++) {
            hashSet.add(inputNumber[i]);
        }
        return hashSet.size() == inputNumber.length;
    }

    private String getGameResult(int[] inputNumber) {
        int numA = 0;
        int numB = 0;
        String result = "";
        int[] visited = new int[]{0,0,0,0};

        numA = getNumA(inputNumber, numA, visited);
        numB = getNumB(inputNumber, numB, visited);

        result += String.format("%dA%dB", Integer.valueOf(numA), Integer.valueOf(numB));

        return result;
    }

    private int getNumB(int[] inputNumber, int numB, int[] visited) {
        for (int i = 0; i < inputNumber.length; i++) {
            if (visited[i] != 1){
                for (int j = 0; j < answer.length; j++) {
                    if (inputNumber[i] == answer[j]){
                        numB++;
                    }
                }
            }
        }
        return numB;
    }

    private int getNumA(int[] inputNumber, int numA, int[] visited) {
        for (int i = 0; i < inputNumber.length; i++) {
            if (inputNumber[i] == answer[i]){
                numA++;
                visited[i] = 1;
            }
        }
        return numA;
    }
}
