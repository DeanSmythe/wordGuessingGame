package wordGuessingGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class WordGuessingGameTest {

    // @Test public void testGetsWordToGuess() {
    //     WordGuessingGame game = new WordGuessingGame();
    //     assertEquals("M_____", game.getWordToGuess());
    // }

    @Test public void testGetsRemainingAttempts(){
        WordChoser choser = new WordChoser();
        WordGuessingGame game = new WordGuessingGame(choser);
        assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
    }
    @Test public void testGetsRandomWordFromDictionary(){
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGuessingGame game = new WordGuessingGame(mockedChoser);
        assertEquals(game.getWordToGuess(), "D________");

}
}


