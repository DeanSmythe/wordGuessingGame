package wordGuessingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WordChoser {

    static final ArrayList<String> DICTIONARY = new ArrayList<>(Arrays.asList("MAKERS", "CANDIES", "DEVELOPER", "LONDON"));
       
    public static void main(String[] args) {
    
    }

    public String getRandomWordFromDictionary(){
        Random rand = new Random();
        return DICTIONARY.get(rand.nextInt(DICTIONARY.size()));
    }
}
