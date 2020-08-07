package ita.vicky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static ita.vicky.normal.Number.NUMBER_LIMIT_LENGTH;

public class InputNumber {
    public int[] getInput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = bufferedReader.readLine();
        return Arrays.asList(inputNumber.split(""))
                .stream()
                .mapToInt(Integer::parseInt)
                .toArray();
//        return new int[]{1,2,3,4};
    }
}
