package ita.vicky;

import java.util.Arrays;
import java.util.stream.IntStream;

import static ita.vicky.normal.Number.NUMBER_LIMIT_LENGTH;

public class GuessNumberGame {
    private int[] answer;

    public GuessNumberGame(int[] answer) {
        this.answer = answer;
    }

    public String guess(int[] inputNumber) {
        int countAllCorrectPositionNumber = getAllCorrectPositionNumber(inputNumber);
        int countCorrectNumber = getCorrectNumber(inputNumber, countAllCorrectPositionNumber);
        return String.format("%dA%dB", countAllCorrectPositionNumber,countCorrectNumber);
    }

    private int getCorrectNumber(int[] inputNumber, int countOutputANum) {
        return getInputNumberEqualsAnswerIgnorePosition(inputNumber) - countOutputANum;
    }

    private int getInputNumberEqualsAnswerIgnorePosition(int[] inputNumber) {
        return (int)Arrays
                .stream(inputNumber)
                .filter(input -> Arrays.stream(answer).anyMatch(ans -> ans == input))
                .count();
    }

    private int getAllCorrectPositionNumber(int[] inputNumber) {
        return (int) IntStream
                .range(0, NUMBER_LIMIT_LENGTH)
                .mapToObj(index -> inputNumber[index] == answer[index])
                .filter(isInputNumberEqualsAnswer -> isInputNumberEqualsAnswer).count();
    }
}
