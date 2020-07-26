package ita.vicky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessNumberValidatorTest {

    @Test
    void should_return_true_when_validate_given_1234() {
        //given
        int[] inputNumber = {1,2,3,4};
        GuessNumberValidator guessNumberValidator = new GuessNumberValidator();

        //when
        boolean isGuessNumberValid = guessNumberValidator.isValid(inputNumber);

        //then
        assertTrue(isGuessNumberValid);
    }

    @Test
    void should_return_false_when_validate_given_11() {
        //given
        int[] inputNumber = {1,1};
        GuessNumberValidator guessNumberValidator = new GuessNumberValidator();

        //when
        boolean isGuessNumberValid = guessNumberValidator.isValid(inputNumber);

        //then
        assertTrue(isGuessNumberValid);
    }
}
