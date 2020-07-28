package ita.vicky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnswerValidatorTest {
    @Test
    void should_return_true_when_validate_given_random_answer() {
        //given
        AnswerGenerator generateAnswer = new AnswerGenerator();
        AnswerValidator answerValidator = new AnswerValidator();
        int[] answer = generateAnswer.generate();

        //when
        boolean isAnswerValid = answerValidator.isValid(answer);

        //then
        assertTrue(isAnswerValid);
    }
}
