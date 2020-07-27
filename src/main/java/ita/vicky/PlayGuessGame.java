package ita.vicky;

import java.util.List;

public class PlayGuessGame {
    private GuessNumberGame guessNumberGame;
    private NumberValidator numberValidator;
    private int countPlayTimes = 0;

    public PlayGuessGame() {
        numberValidator = new NumberValidator();
    }

    public void play(int[] inputNumber, int[] answer) {
        guessNumberGame = new GuessNumberGame(answer);
        if (countPlayTimes++ < 6) {
            if (numberValidator.isValid(inputNumber)) {
                String guessGameResult = "";
                guessGameResult = guessNumberGame.guess(inputNumber);
                System.out.printf("%s\n", guessGameResult);
            } else {
                System.out.printf("wrong input, input again\n");
            }
        } else {
            endGame();
        }
    }

    public void endGame() {
        System.out.print("End Game");
    }
}
