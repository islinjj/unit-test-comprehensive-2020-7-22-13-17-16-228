package ita.vicky;

import java.util.Scanner;

import static ita.vicky.normal.Number.NUMBER_LIMIT_LENGTH;

public class InputNumber {
    public int[] getInput() {
        Scanner scan = new Scanner(System.in);
        int[] inputNumber = new int[NUMBER_LIMIT_LENGTH];
        for (int i = 0; i < inputNumber.length; i++) {
            inputNumber[i] = scan.nextInt();
        }
        return inputNumber;
    }
}
