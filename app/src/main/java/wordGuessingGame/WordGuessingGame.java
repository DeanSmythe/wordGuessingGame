package wordGuessingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WordGuessingGame {
    String hiddenWord;
    Integer remainingAttempts = 10 ;
    static final ArrayList<String> DICTIONARY = new ArrayList<>(Arrays.asList("MAKERS", "CANDIES", "DEVELOPER", "LONDON"));

    WordGuessingGame(){
        hiddenWord = getRandomWordFromDictionary();
    }

    public Integer getRemainingAttempts(){
        return remainingAttempts ;
    }

    public String getRandomWordFromDictionary(){
        Random rand = new Random();
        return DICTIONARY.get(rand.nextInt(DICTIONARY.size()));
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
