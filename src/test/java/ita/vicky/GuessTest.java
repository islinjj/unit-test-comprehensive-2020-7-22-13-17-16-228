package ita.vicky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessTest {

    @Test
    public void should_return_4A0B_when_guess_given_1234() {
        //given
        int[] answer = {1,2,3,4};
        GuessGame guessGame = new GuessGame(answer);
        int[] inputNumber = {1,2,3,4};

        //when
        String result = guessGame.play(inputNumber);

        //then
        Assertions.assertEquals("4A0B",result);
    }

    @Test
    public void should_return_0A0B_when_guess_given_5678() {
        //given
        int[] inputNumber = {5,6,7,8};
        int[] answer = {1,2,3,4};
        GuessGame guessGame = new GuessGame(answer);

        //when
        String result = guessGame.play(inputNumber);

        //then
        Assertions.assertEquals("0A0B",result);
    }
}
