package ita.vicky;

public class Main {
    public static void main(String[] args) {
        PlayGuessGame playGuessGame = new PlayGuessGame();
        GenerateAnswer generateAnswer = new GenerateAnswer();
        playGuessGame.play(generateAnswer.generate());
    }
}
