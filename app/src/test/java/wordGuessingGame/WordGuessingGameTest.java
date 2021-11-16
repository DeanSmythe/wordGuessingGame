package wordGuessingGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WordGuessingGameTest {

    @Test public void testGetsWordToGuess() {
        WordGuessingGame game = new WordGuessingGame();
        assertEquals("M_____", game.getWordToGuess());
    }

    @Test public void testGetsRemainingAttempts(){
        WordGuessingGame game = new WordGuessingGame();
        assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
    }

    @Test public void testGetsRandomWordFromDictionary(){
        WordGuessingGame game = new WordGuessingGame();
        assertTrue(game.getRandomWordFromDictionary() instanceof String);
    }
}
