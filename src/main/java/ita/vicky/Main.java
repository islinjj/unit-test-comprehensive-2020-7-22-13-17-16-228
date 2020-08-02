package ita.vicky;

import java.util.Scanner;

import static ita.vicky.normal.Number.NUMBER_LIMIT_LENGTH;

public class Main {
    public static void main(String[] args) {
        PlayGuessGame playGuessGame = new PlayGuessGame();
        GenerateAnswer generateAnswer = new GenerateAnswer();

        playGuessGame.play(generateAnswer.generate());
    }
}
