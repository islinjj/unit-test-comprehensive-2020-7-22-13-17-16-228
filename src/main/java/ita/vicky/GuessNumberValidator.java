package ita.vicky;

public class GuessNumberValidator {
    public boolean isValid(int[] inputNumber) {
        if (inputNumber.length < 4){
            return false;
        }
        return true;
    }
}
