package ita.vicky;

import java.util.List;

public class PlayGuessGame {
    private GenerateAnswer generateAnswer;
    private GuessNumberGame guessNumberGame;

    public PlayGuessGame() {
        generateAnswer = new GenerateAnswer();
    }

    public String play(int[] inputNumber,int[] answer) {
        guessNumberGame = new GuessNumberGame(answer);
        String guessGameResult = "";
        guessGameResult = guessNumberGame.guess(inputNumber);
        System.out.printf("%s\n", guessGameResult);
        return null;
    }
}
