package ita.vicky;

import java.util.Scanner;

import static ita.vicky.normal.Message.END_GAME;
import static ita.vicky.normal.Message.WRONG_INPUT;
import static ita.vicky.normal.Number.*;

public class PlayGuessGame {
    private GuessNumberGame guessNumberGame;
    private NumberValidator numberValidator;
    private int countPlayTimes;

    public PlayGuessGame() {
        countPlayTimes = 6;
        numberValidator = new NumberValidator();
    }

    public void play(int[] answer) {
        guessNumberGame = new GuessNumberGame(answer);
        for (int time = 0; time < countPlayTimes; time++) {
            int[] inputNumber = getInput();
            System.out.print(numberValidator.isValid(inputNumber) ? keepGuess(inputNumber) : WRONG_INPUT);
        }
        endGame();
    }

    private int[] getInput() {
        Scanner scan = new Scanner(System.in);
        int[] inputNumber = new int[NUMBER_LIMIT_LENGTH];
        for (int i = 0; i < inputNumber.length; i++) {
            inputNumber[i] = scan.nextInt();
        }
        return inputNumber;
    }

    private String keepGuess(int[] inputNumber) {
        String guessGameResult = guessNumberGame.guess(inputNumber);
        return String.format("%s\n", guessGameResult);
    }

    public void endGame() {
        System.out.print(END_GAME);
    }
}
