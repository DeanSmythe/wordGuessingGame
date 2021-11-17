package wordGuessingGame;

import org.junit.Test;

// import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
// import static org.mockito.Mockito.*;

public class WordChooserTest {
    
  // @Test public void testWordChoser() {
  //     WordChoser wordChoser = new WordChoser();
  //     assertEquals("M_____", wordChoser.getRandomWordFromDictionary());
  //   }

  @Test public void testGetsRandomWordFromDictionary(){
      WordChoser wordChoser = new WordChoser();
      assertTrue(wordChoser.getRandomWordFromDictionary() instanceof String);
  }
 

 }
