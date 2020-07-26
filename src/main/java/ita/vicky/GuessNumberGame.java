package ita.vicky;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GuessNumberGame {
    private int[] answer;

    public GuessNumberGame(int[] answer) {
        this.answer = answer;
    }

    public String guess(int[] inputNumber) {
        int countOutputANum = getCountOutputANum(inputNumber);
        return String.format("%dA0B", countOutputANum);
    }

    private int getCountOutputANum(int[] inputNumber) {
        return IntStream.range(0,inputNumber.length).mapToObj(index -> inputNumber[index] == answer[index])
                .filter(isInputNumberEqualsAnswer -> isInputNumberEqualsAnswer == true).collect(Collectors.toList()).size();
    }
}
