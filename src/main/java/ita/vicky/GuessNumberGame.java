package ita.vicky;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GuessNumberGame {
    private int[] answer;

    public GuessNumberGame(int[] answer) {
        this.answer = answer;
    }

    public String guess(int[] inputNumber) {
        int countOutputANum = getCountOutputANum(inputNumber);
        int countOutputBNum = getInputNumberEqualsAnswerIgnorePosition(inputNumber) - countOutputANum;
        return String.format("%dA%dB", countOutputANum,countOutputBNum);
    }

    private int getInputNumberEqualsAnswerIgnorePosition(int[] inputNumber) {
        return (int)Arrays.stream(inputNumber).filter(input -> Arrays.stream(answer).anyMatch(ans -> ans == input)).count();
    }

    private int getCountOutputANum(int[] inputNumber) {
        return IntStream.range(0,inputNumber.length).mapToObj(index -> inputNumber[index] == answer[index])
                .filter(isInputNumberEqualsAnswer -> isInputNumberEqualsAnswer == true).collect(Collectors.toList()).size();
    }
}
