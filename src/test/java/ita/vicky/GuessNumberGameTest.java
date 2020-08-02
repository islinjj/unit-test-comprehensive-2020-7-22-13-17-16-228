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
        when(generateAnswer.generate()).thenReturn(new int[]{1, 2, 3, 4});
        guessNumberGame = new GuessNumberGame(generateAnswer.generate());
    }

    @Test
    void should_return_0A0B_when_guess_given_input_5678() {
        //given
        int[] inputNumber = {5,6,7,8};

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("0A0B",guessResult);
    }

    @Test
    void should_return_1A0B_when_guess_given_input_1567() {
        //given
        int[] inputNumber = {1,5,6,7};

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("1A0B",guessResult);
    }

    @Test
    void should_return_4A0B_when_guess_given_input_1234() {
        //given
        int[] inputNumber = {1,2,3,4};

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("4A0B",guessResult);
    }


    @Test
    void should_return_0A4B_when_guess_given_input_4321() {
        //given
        int[] inputNumber = {4,3,2,1};

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("0A4B",guessResult);
    }

    @Test
    void should_return_0A2B_when_guess_given_input_2478() {
        //given
        int[] inputNumber = {2,4,7,8};

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("0A2B",guessResult);
    }

    @Test
    void should_return_1A2B_when_guess_given_input_0324() {
        //given
        int[] inputNumber = {0,3,2,4};

        //when
        String guessResult = guessNumberGame.guess(inputNumber);

        //then
        assertEquals("1A2B",guessResult);
    }
}
