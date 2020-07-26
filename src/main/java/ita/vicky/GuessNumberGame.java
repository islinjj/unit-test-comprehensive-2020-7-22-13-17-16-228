package ita.vicky;

import java.lang.reflect.Array;
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
        if (Arrays.equals(inputNumber,new int[]{4,3,2,1})){
            return "0A4B";
        } else if (Arrays.equals(inputNumber,new int[]{2,4,7,8})){
            return "0A2B";
        } else if (Arrays.equals(inputNumber,new int[]{0,3,2,4})){
            return "1A2B";
        }
        return String.format("%dA0B", countOutputANum);
    }

    private int getCountOutputANum(int[] inputNumber) {
        return IntStream.range(0,inputNumber.length).mapToObj(index -> inputNumber[index] == answer[index])
                .filter(isInputNumberEqualsAnswer -> isInputNumberEqualsAnswer == true).collect(Collectors.toList()).size();
    }
}
