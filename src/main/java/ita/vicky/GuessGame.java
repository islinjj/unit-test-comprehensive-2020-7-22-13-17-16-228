package ita.vicky;

import java.util.Arrays;

public class GuessGame {

    private int[] answer;

    public GuessGame(int[] answer) {
        this.answer = answer;
    }

    public String play(int[] inputNumber) {
        if (Arrays.equals(inputNumber,answer)){
            return "4A0B";
        }
        return null;
    }
}
