package ita.vicky;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class PlayGuessGameTest {

    private static PlayGuessGame playGuessGame;
    private static GenerateAnswer generateAnswer;
    private static InputNumberGenerate generateInputNumber;

    @BeforeAll
    static void mockAnswer() {
        generateInputNumber = new InputNumberGenerate();
        generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(new int[]{1, 2, 3, 4});
    }

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    public String systemOut() {
        return outContent.toString();
    }

    @Test
    void should_win_when_play_given_2_valid_input_number_and_answer_is_1234() {
        //given
        int[] inputNumberOne = {4, 3, 2, 1};
        int[] inputNumberTwo = {1, 2, 3, 4};
        List<int[]> inputNumberList = new ArrayList<>();
        inputNumberList.add(inputNumberOne);
        inputNumberList.add(inputNumberTwo);
        playGuessGame = new PlayGuessGame();

        //when
        for (int[] inputNumber : inputNumberList) {
            playGuessGame.play(inputNumber,generateAnswer.generate());
        }

        //then
        assertEquals("0A4B\n4A0B\n", systemOut());
    }

    @Test
    void should_win_when_play_given_1123_and_1234_input_number_and_answer_is_1234() {
        //given
        int[] inputNumberOne = {1, 1, 2, 3};
        int[] inputNumberTwo = {1, 2, 3, 4};
        List<int[]> inputNumberList = new ArrayList<>();
        inputNumberList.add(inputNumberOne);
        inputNumberList.add(inputNumberTwo);
        playGuessGame = new PlayGuessGame();

        //when
        for (int[] inputNumber : inputNumberList) {
            playGuessGame.play(inputNumber,generateAnswer.generate());
        }

        //then
        assertEquals("wrong input, input again\n4A0B\n", systemOut());
    }

    @Test
    void should_end_game_when_play_7_times_given_6_valid_input_number_and_answer_is_1234() {
        //given
        playGuessGame = new PlayGuessGame();
        for (int times = 0; times < 6; times++) {
            playGuessGame.play(generateInputNumber.generate(),generateAnswer.generate());
        }

        //when
        playGuessGame.play(new int[]{1,2,5,6},generateAnswer.generate());

        //then
        assertTrue(systemOut().contains("end game"));
    }

}
