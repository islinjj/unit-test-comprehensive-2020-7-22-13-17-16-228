package ita.vicky;

import static ita.vicky.normal.Message.END_GAME;
import static ita.vicky.normal.Message.WRONG_INPUT;
import static ita.vicky.normal.Number.*;

public class PlayGuessGame {
    private GuessNumberGame guessNumberGame;
    private NumberValidator numberValidator;
    private int countPlayTimes;

    public PlayGuessGame() {
        countPlayTimes = 0;
        numberValidator = new NumberValidator();
    }

    public void play(int[] inputNumber, int[] answer) {
        guessNumberGame = new GuessNumberGame(answer);
        if (countPlayTimes++ < ALLOWED_PLAY_TIMES) {
            System.out.print(startGuess(inputNumber));
        } else {
            endGame();
        }
    }

    private String startGuess(int[] inputNumber) {
        return numberValidator.isValid(inputNumber) ? keepGuess(inputNumber) : WRONG_INPUT;
    }

    private String keepGuess(int[] inputNumber) {
        String guessGameResult = guessNumberGame.guess(inputNumber);
        return String.format("%s\n", guessGameResult);
    }

    public void endGame() {
        System.out.print(END_GAME);
    }
}
