package ita.vicky;

import static ita.vicky.normal.Message.END_GAME;
import static ita.vicky.normal.Message.WRONG_INPUT;

public class PlayGuessGame {
    private GuessNumberGame guessNumberGame;
    private NumberValidator numberValidator;
    private int countPlayTimes;
    private InputNumber inputNumber;

    public PlayGuessGame() {
        countPlayTimes = 6;
        numberValidator = new NumberValidator();
        inputNumber = new InputNumber();
    }


    public void play(int[] answer) {
        guessNumberGame = new GuessNumberGame(answer);
        for (int time = 0; time < countPlayTimes; time++) {
            int[] number = inputNumber.getInput();
            System.out.print(numberValidator.isValid(number) ? keepGuess(number) : WRONG_INPUT);
            if ("4A0B".equals(keepGuess(number))){
                break;
            }
        }
        endGame();
    }

    private String keepGuess(int[] inputNumber) {
        String guessGameResult = guessNumberGame.guess(inputNumber);
        return String.format("%s\n", guessGameResult);
    }

    public void endGame() {
        System.out.print(END_GAME);
    }
}
