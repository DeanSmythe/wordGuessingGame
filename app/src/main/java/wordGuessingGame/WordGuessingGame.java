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
        // System.out.println("In isGameWon ");
        // System.out.println(getWordToGuess());
        // System.out.println("Hiddenword....");
        // System.out.println(hiddenWord);
        // System.out.println(getWordToGuess().equals(hiddenWord));
        // System.out.println(getWordToGuess().toString().length());
        // System.out.println(" and....");
        // System.out.println(hiddenWord.length());
        if (getWordToGuess().equals(hiddenWord)) { 
            System.out.println("Congratulations, you won!");
          return true ;
         }
         else {
          return false ;
         }
      
  }

}


