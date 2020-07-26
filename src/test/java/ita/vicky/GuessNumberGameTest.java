package ita.vicky;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberGameTest {

    private static GuessNumberGame guessNumberGame;
    private static GenerateAnswer generateAnswer;

    @BeforeAll
    static void mockAnswer(){
        generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn("1234");
        guessNumberGame = new GuessNumberGame(generateAnswer);
    }

    @Test
    void should_return_0A0B_when_guess_given_5678() {
        //given
        String inputNumber = "5678";

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("0A0B",guessResult);
    }
}
