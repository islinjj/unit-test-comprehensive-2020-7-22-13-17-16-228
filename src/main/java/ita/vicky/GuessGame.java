package ita.vicky;

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

        numA = getNumA(inputNumber, numA, visited);
        numB = getNumB(inputNumber, numB, visited);

        result += String.format("%dA%dB", Integer.valueOf(numA), Integer.valueOf(numB));

        return result;
    }

    private int getNumB(int[] inputNumber, int numB, int[] visited) {
        for (int i = 0; i < inputNumber.length; i++) {
            if (visited[i] != 1){
                for (int j = i; j < answer.length; j++) {
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
