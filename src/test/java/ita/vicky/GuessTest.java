package ita.vicky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GuessTest {

    @Test
    void should_return_wrong_input_input_again_when_input_given_1123() {
        //given
        int[] inputNumber = {1,1,3,4};
        GuessGame guessGame = new GuessGame();

        //when
        String result = guessGame.play(inputNumber);

        //then
        Assertions.assertEquals("Wrong Input，Input again",result);
    }

    @Test
    void should_return_wrong_input_input_again_when_input_given_12() {
        //given
        int[] inputNumber = {1,2};
        GuessGame guessGame = new GuessGame();

        //when
        String result = guessGame.play(inputNumber);

        //then
        Assertions.assertEquals("Wrong Input，Input again",result);
    }

    @Test
    public void should_return_4A0B_when_guess_given_1234() {
        //given
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        int[] answer = {1,2,3,4};
        when(generateAnswer.generate()).thenReturn(answer);
        GuessGame guessGame = new GuessGame(generateAnswer.generate());
        int[] inputNumber = {1,2,3,4};
        GenerateInputNumber generateInputNumber = Mockito.mock(GenerateInputNumber.class);
        when(generateInputNumber.generate()).thenReturn(inputNumber);

        //when
        String result = guessGame.play(generateInputNumber.generate());

        //then
        Assertions.assertEquals("4A0B",result);
    }

    @Test
    public void should_return_0A0B_when_guess_given_5678() {
        //given
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        int[] answer = {1,2,3,4};
        when(generateAnswer.generate()).thenReturn(answer);
        GuessGame guessGame = new GuessGame(generateAnswer.generate());
        int[] inputNumber = {5,6,7,8};
        GenerateInputNumber generateInputNumber = Mockito.mock(GenerateInputNumber.class);
        when(generateInputNumber.generate()).thenReturn(inputNumber);

        //when
        String result = guessGame.play(generateInputNumber.generate());

        //then
        Assertions.assertEquals("0A0B",result);
    }

    @Test
    public void should_return_1A0B_when_guess_given_1567() {
        //given
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        int[] answer = {1,2,3,4};
        when(generateAnswer.generate()).thenReturn(answer);
        GuessGame guessGame = new GuessGame(generateAnswer.generate());
        int[] inputNumber = {1,5,6,7};
        GenerateInputNumber generateInputNumber = Mockito.mock(GenerateInputNumber.class);
        when(generateInputNumber.generate()).thenReturn(inputNumber);

        //when
        String result = guessGame.play(generateInputNumber.generate());

        //then
        Assertions.assertEquals("1A0B",result);
    }

    @Test
    public void should_return_0A2B_when_guess_given_2478() {
        //given
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        int[] answer = {1,2,3,4};
        when(generateAnswer.generate()).thenReturn(answer);
        GuessGame guessGame = new GuessGame(generateAnswer.generate());
        int[] inputNumber = {2,4,7,8};
        GenerateInputNumber generateInputNumber = Mockito.mock(GenerateInputNumber.class);
        when(generateInputNumber.generate()).thenReturn(inputNumber);

        //when
        String result = guessGame.play(generateInputNumber.generate());

        //then
        Assertions.assertEquals("0A2B",result);
    }

    @Test
    public void should_return_1A2B_when_guess_0324() {
        //given
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        int[] answer = {1,2,3,4};
        when(generateAnswer.generate()).thenReturn(answer);
        GuessGame guessGame = new GuessGame(generateAnswer.generate());
        int[] inputNumber = {0,3,2,4};
        GenerateInputNumber generateInputNumber = Mockito.mock(GenerateInputNumber.class);
        when(generateInputNumber.generate()).thenReturn(inputNumber);

        //when
        String result = guessGame.play(generateInputNumber.generate());

        //then
        Assertions.assertEquals("1A2B",result);
    }

    @Test
    public void should_return_0A4B_when_guess_4321() {
        //given
        int[] answer = {1,2,3,4};
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(answer);
        GuessGame guessGame = new GuessGame(generateAnswer.generate());
        int[] inputNumber = {4,3,2,1};
        GenerateInputNumber generateInputNumber = Mockito.mock(GenerateInputNumber.class);
        when(generateInputNumber.generate()).thenReturn(inputNumber);

        //when
        String result = guessGame.play(generateInputNumber.generate());

        //then
        Assertions.assertEquals("0A4B",result);
    }

    public void should_return_wrong_answer_when_generate_given_22(){
        //given
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        int[] answer = {2,2};
        when(generateAnswer.generate()).thenReturn(answer);
        GuessGame guessGame = new GuessGame(generateAnswer.generate());

        //when

        //then
//        Assertions.assertEquals("Wrong answer");
    }
}
