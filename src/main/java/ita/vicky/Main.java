package ita.vicky;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PlayGuessGame playGuessGame = new PlayGuessGame();
        GenerateAnswer generateAnswer = new GenerateAnswer();
        try {
            playGuessGame.play(generateAnswer.generate());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
