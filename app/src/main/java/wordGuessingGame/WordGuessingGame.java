package wordGuessingGame;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Random;

public class WordGuessingGame {
    String hiddenWord;
    Integer remainingAttempts = 10 ;
  
    public WordGuessingGame(WordChoser choser){
        // WordChoser wordChoser = new WordChoser();
        hiddenWord = choser.getRandomWordFromDictionary();
    }

    public Integer getRemainingAttempts(){
        return remainingAttempts ;
    } 

    public String getWordToGuess(){
        Integer lengthOfWord = hiddenWord.length();
        StringBuilder guessThisWord = new StringBuilder(lengthOfWord);
        guessThisWord.append(hiddenWord.charAt(0));
        for (int i = 1; i < hiddenWord.length(); i++){
            guessThisWord.append("_");
        }
        return guessThisWord.toString();
    }
}


