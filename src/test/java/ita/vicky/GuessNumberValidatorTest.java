package ita.vicky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessNumberValidatorTest {

    @Test
    void should_return_true_when_validate_given_input_1234() {
        //given
        int[] inputNumber = {1,2,3,4};
        NumberValidator guessNumberValidator = new NumberValidator();

        //when
        boolean isGuessNumberValid = guessNumberValidator.isValid(inputNumber);

        //then
        assertTrue(isGuessNumberValid);
    }

    @Test
    void should_return_false_when_validate_given_input_11() {
        //given
        int[] inputNumber = {1,1};
        NumberValidator guessNumberValidator = new NumberValidator();

        //when
        boolean isGuessNumberValid = guessNumberValidator.isValid(inputNumber);

        //then
        assertFalse(isGuessNumberValid);
    }

    @Test
    void should_return_false_when_validate_given_input_1123() {
        //given
        int[] inputNumber = {1,1,2,3};
        NumberValidator guessNumberValidator = new NumberValidator();

        //when
        boolean isGuessNumberValid = guessNumberValidator.isValid(inputNumber);

        //then
        assertFalse(isGuessNumberValid);
    }

    @Test
    void should_return_false_when_validate_given_input_11123() {
        //given
        int[] inputNumber = {11,1,2,3};
        NumberValidator guessNumberValidator = new NumberValidator();

        //when
        boolean isGuessNumberValid = guessNumberValidator.isValid(inputNumber);

        //then
        assertFalse(isGuessNumberValid);
    }
}
