package wordGuessingGame;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import  java.util.ArrayList;

public class MaskerTest {

  // @Test public void testGetsRandomWordFromDictionary(){
  //   WordChoser mockedChoser = mock(WordChoser.class);
  //   when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
  //   WordGuessingGame game = new WordGuessingGame(mockedChoser);
  //   assertEquals(game.getWordToGuess(), "D________");
  
  @Test public void testGetsCorrectGuess() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
    WordGuessingGame game = new WordGuessingGame(mockedChoser);
    assertEquals(game.guessLetter('E'), true);
    assertEquals(game.getWordToGuess(), "DE_E___E_");
  }
 @Test public void testGetsIncorrectGuess() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
    WordGuessingGame game = new WordGuessingGame(mockedChoser);
    assertEquals(game.guessLetter('X'), false);
    assertEquals(game.getWordToGuess(), "D________");
  }

  @Test public void testGetsMaskedWord() {
    Masker masker = new Masker();
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    guessedLetters.add('E');
    guessedLetters.add('R');
    assertEquals(masker.getWordToGuess("DEVELOPER", guessedLetters), "DE_E___ER");

  }
}
