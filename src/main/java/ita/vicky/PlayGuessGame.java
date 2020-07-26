package ita.vicky;

import java.util.List;

public class PlayGuessGame {
    private GenerateAnswer generateAnswer;
    private GuessNumberGame guessNumberGame;

    public PlayGuessGame() {
        generateAnswer = new GenerateAnswer();
        guessNumberGame = new GuessNumberGame(new int[]{1, 2, 3, 4});
    }

    public String play(List<int[]> inputNumberList) {
        String guessGameResult = "";
        for (int[] inputNumber:inputNumberList){
            guessGameResult = guessNumberGame.guess(inputNumber);
            System.out.printf("%s\n", guessGameResult);
        }
        return null;
    }
}
