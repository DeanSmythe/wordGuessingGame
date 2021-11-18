package wordGuessingGame;

import java.util.ArrayList;

public class Masker {
  
  public String getWordToGuess(String hiddenWord, ArrayList<Character> guessedLetters){
    Integer lengthOfWord = hiddenWord.length();
    StringBuilder guessThisWord = new StringBuilder(lengthOfWord);
    guessThisWord.append(hiddenWord.charAt(0));
    for (int i = 1; i < hiddenWord.length(); i++){
        Character currentLetter = (hiddenWord.charAt(i));
        // System.out.println(currentLetter);
        if (guessedLetters.indexOf(currentLetter)!= -1) {
        guessThisWord.append(currentLetter);
        }
        else {
            guessThisWord.append("_");
        }
    }
    return guessThisWord.toString();
  }

}
