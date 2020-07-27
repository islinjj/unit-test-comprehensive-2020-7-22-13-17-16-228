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
import static org.mockito.Mockito.when;

public class PlayGuessGameTest {

    private static GenerateAnswer generateAnswer;
    private static PlayGuessGame playGuessGame;

    @BeforeAll
    static void mockAnswer() {
        playGuessGame = new PlayGuessGame();
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

        //when
        for (int[] inputNumber : inputNumberList) {
            playGuessGame.play(inputNumber,generateAnswer.generate());
        }

        //then
        assertEquals("0A4B\n4A0B\n", systemOut());
    }
}
