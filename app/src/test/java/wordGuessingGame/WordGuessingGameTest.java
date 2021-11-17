package wordGuessingGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
    @Test public void testGuessLetterCorrect(){
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGuessingGame game = new WordGuessingGame(mockedChoser);
        assertTrue("Letter found.", game.guessLetter('D') == true);
        assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
    }
    @Test public void testGuessLetterIncorrect(){
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGuessingGame game = new WordGuessingGame(mockedChoser);
        assertFalse("Letter not found.", game.guessLetter('X') == true);
        assertEquals(Integer.valueOf(9), game.getRemainingAttempts());
    }
    @Test public void testGuessLetterSame(){
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGuessingGame game = new WordGuessingGame(mockedChoser);
        game.guessLetter('D');
        assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
    }
    @Test public void testGuessLetterDecrement(){
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGuessingGame game = new WordGuessingGame(mockedChoser);
        game.guessLetter('X');
        assertEquals(Integer.valueOf(9), game.getRemainingAttempts());
    }

}


