package ita.vicky;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static ita.vicky.normal.Number.NUMBER_LIMIT_LENGTH;

public class GuessNumberGame {
    private int[] answer;

    public GuessNumberGame(int[] answer) {
        this.answer = answer;
    }

    public String guess(int[] inputNumber) {
        int countOutputANum = getCountOutputANum(inputNumber);
        int countOutputBNum = getCountOutputBNum(inputNumber, countOutputANum);
        return String.format("%dA%dB", countOutputANum,countOutputBNum);
    }

    private int getCountOutputBNum(int[] inputNumber, int countOutputANum) {
        return getInputNumberEqualsAnswerIgnorePosition(inputNumber) - countOutputANum;
    }

    private int getInputNumberEqualsAnswerIgnorePosition(int[] inputNumber) {
        return (int)Arrays
                .stream(inputNumber)
                .filter(input -> Arrays.stream(answer).anyMatch(ans -> ans == input))
                .count();
    }

    private int getCountOutputANum(int[] inputNumber) {
        return IntStream
                .range(0,NUMBER_LIMIT_LENGTH)
                .mapToObj(index -> inputNumber[index] == answer[index])
                .filter(isInputNumberEqualsAnswer -> isInputNumberEqualsAnswer == true)
                .collect(Collectors.toList()).size();
    }
}
