package wordGuessingGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Character;


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

    @Test public void testGuessLetterCorrectNoDecrement(){
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGuessingGame game = new WordGuessingGame(mockedChoser);
        game.guessLetter('D');
        assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
    }

    @Test public void testGuessLetterIncorrectAndDecrement(){
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGuessingGame game = new WordGuessingGame(mockedChoser);
        game.guessLetter('X');
        assertEquals(Integer.valueOf(9), game.getRemainingAttempts());
    }
  
    @Test public void testisGameLost() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGuessingGame game = new WordGuessingGame(mockedChoser);
        for (Integer i=1 ; i < 11 ; i++) {
        assertEquals(game.guessLetter('X'), false);
        }
        assertEquals(game.isGameLost(), true);
    }
    
    @Test public void testisGameWon() {
        
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGuessingGame game = new WordGuessingGame(mockedChoser); 
        
        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('E','V','L','O','P','R'));
        for (Character letter : letters) {
            // System.out.println("testing letter" + letter);
            assertEquals(game.guessLetter(letter), true);
        }
        assertEquals("Not lost yet", false, game.isGameLost());
        assertEquals("Game is won", true, game.isGameWon());
    }

}


