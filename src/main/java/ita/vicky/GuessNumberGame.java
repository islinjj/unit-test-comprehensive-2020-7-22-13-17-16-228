package ita.vicky;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String inputNumber) {
        int countOutputANum = getCountOutputANum(inputNumber);
        return String.format("%dA0B", countOutputANum);
    }

    private int getCountOutputANum(String inputNumber) {
        return IntStream.range(0,inputNumber.split("").length).
                mapToObj(i -> Integer.valueOf(inputNumber.split("")[i]) == Integer.valueOf(answer.split("")[i]))
                .filter(isInputEqualsAnswer -> isInputEqualsAnswer == true).collect(Collectors.toList()).size();
    }
}
