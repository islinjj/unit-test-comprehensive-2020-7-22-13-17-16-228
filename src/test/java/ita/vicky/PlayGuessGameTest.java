package ita.vicky;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class PlayGuessGameTest {

    private static PlayGuessGame playGuessGame;
    private static GenerateAnswer generateAnswer;
    private static GuessNumberGame guessNumberGame;

    @BeforeAll
    static void mockAnswer() {
        generateAnswer = Mockito.mock(GenerateAnswer.class);
        when(generateAnswer.generate()).thenReturn(new int[]{1, 2, 3, 4});
        guessNumberGame = new GuessNumberGame(generateAnswer.generate());
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
    void should_win_when_play_given_2_valid_input_number_and_answer_is_1234() throws IOException {
        //given
        String inputNumber = "4321\n1234\n";
        System.setIn(new ByteArrayInputStream(inputNumber.getBytes()));
        playGuessGame = new PlayGuessGame();

        //when
        playGuessGame.play(generateAnswer.generate());

        //then
        assertEquals("0A4B\n4A0B\n", systemOut());
    }

    @Test
    void should_win_when_play_given_1123_and_1234_input_number_and_answer_is_1234() throws IOException {
        //given
        String inputNumber = "1123\n1234\n";
        System.setIn(new ByteArrayInputStream(inputNumber.getBytes()));
        playGuessGame = new PlayGuessGame();

        //when
            playGuessGame.play(generateAnswer.generate());

        //then
        assertEquals("wrong input, input again\n4A0B\n", systemOut());
    }

    @Test
    void should_end_game_when_play_7_times_given_6_valid_input_number_and_answer_is_1234() throws IOException {
        //given
        String inputNumber = "1345\n1432\n7890\n4563\n6543\n4326\n4562\n";
        System.setIn(new ByteArrayInputStream(inputNumber.getBytes()));
        playGuessGame = new PlayGuessGame();

        //when
        playGuessGame.play(generateAnswer.generate());

        //then
        assertTrue(systemOut().contains("end game"));
    }

}
