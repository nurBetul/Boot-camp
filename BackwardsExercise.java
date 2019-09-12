package Exercises;

import java.util.Scanner;

public class BackwardsExercise {
    public static String printBackwards(String reverse){
        String backward = "";
        for (int i = reverse.length()-1; i>=0; i--){
            backward= backward + reverse.charAt(i);
        }

        return backward;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        System.out.println(BackwardsExercise.printBackwards(word));
    }
}
