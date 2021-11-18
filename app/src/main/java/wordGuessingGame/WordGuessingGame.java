package wordGuessingGame;


import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Random;


public class WordGuessingGame {
    String hiddenWord;
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    Integer remainingAttempts = 10 ;
  
    public WordGuessingGame(WordChoser choser){
        hiddenWord = choser.getRandomWordFromDictionary();
    }

    public Integer getRemainingAttempts(){
        return remainingAttempts ;
    } 

    public String getWordToGuess(){
        Masker masker = new Masker();
        return masker.getWordToGuess(hiddenWord, guessedLetters);
    } 


    public Boolean guessLetter(Character letter){
        // System.out.println(letter);
        for (Integer i = 0; i < hiddenWord.length(); i++){
            // System.out.println(hiddenWord.charAt(i));
          if (hiddenWord.charAt(i) == letter) { 
              guessedLetters.add(letter);
            return true ;
           }
        }
        // System.out.println("false");
        remainingAttempts-- ;
        return false ;
    }
    
    public Boolean isGameLost(){
          if (getRemainingAttempts()==0) { 
            System.out.println("Sorry, you lost.");
            return true ;
           }
           else {
            return false ;
           }
        
    }

    public Boolean isGameWon(){
        Masker masker = new Masker();
        if (masker.getWordToGuess(hiddenWord, guessedLetters).equals(hiddenWord)) { 
            System.out.println("Congratulations, you won!");
          return true ;
         }
         else {
          return false ;
         }
      
  }

}


