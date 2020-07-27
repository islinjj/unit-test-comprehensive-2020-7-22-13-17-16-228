package ita.vicky;

import java.util.List;

public class PlayGuessGame {
    private GenerateAnswer generateAnswer;
    private GuessNumberGame guessNumberGame;
    private NumberValidator numberValidator;

    public PlayGuessGame() {
        generateAnswer = new GenerateAnswer();
        numberValidator = new NumberValidator();
    }

    public String play(int[] inputNumber,int[] answer) {
        guessNumberGame = new GuessNumberGame(answer);
        if (numberValidator.isValid(inputNumber)){
            String guessGameResult = "";
            guessGameResult = guessNumberGame.guess(inputNumber);
            System.out.printf("%s\n", guessGameResult);
        } else {
            System.out.printf("wrong input, input again\n");
        }
        return null;
    }
}
