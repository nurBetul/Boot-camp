package hangmanproject;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanMethods {

    public static String chooseMyWord() {
        String[] hangmanArray = {"computer", "language", "pleasant", "biscuits", "notebook", "precious", "television", "husband"};
        String result = "";
        for (int i = 0; i < hangmanArray.length; i++) {
            double rnd = (Math.random() * (hangmanArray.length-1)) + 1; // choose a random word from the String Array
            result = hangmanArray[(int) rnd];
        }
        return result;

    }

    public static void askUser() {
        int guess = 6; // number of our guesses
        String word = HangmanMethods.chooseMyWord(); // assigned a word from hangmanArray to String
        char[] emptyWord = new char[word.length()]; // created a new char array in order to convert our word to charArray
        ArrayList<Character> repeated = new ArrayList<>(); // arraylist is to add repeated letters
        int i=0;
        while(i< word.length()){ // first we want the word to be written like --------
            emptyWord[i]='-';
            i++;
        }
        System.out.print(emptyWord);
        System.out.println("    Your Chance: " + guess); // display how many guess remained
        System.out.println("Please make your guess! Enter a character");
        Scanner userInput = new Scanner(System.in); // user char input
        while(guess >0){
            char letter = userInput.next().charAt(0);
            if(repeated.contains(letter)){
                System.out.println("The letter was already entered!");
                continue; // we want the code to continue
            }
            repeated.add(letter); // add the repeating letters to arraylist
            if(word.contains(letter+"")){
                for(int j=0; j< word.length(); j++){
                    if(letter == word.charAt(j)){
                        emptyWord[j]=letter;       // assign the existing letters to the char array
                    }
                }
            }
            else{
                guess --;
            }
            if(word.equals(String.valueOf(emptyWord))){ // if all the letters are true, user wins
                System.out.print(emptyWord);
                System.out.println("You Won!");
            }
            System.out.print(emptyWord);
            System.out.println("    Your Chance: " + guess);

            if(guess ==0){ // end of while loop
                System.out.println("You lost!");
                System.out.println("The word was: " + word);
            }
            

        }

    }
}

















