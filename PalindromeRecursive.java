package InterviewPrep;

public class PalindromeRecursive {
    public static void main(String[] args) {
        System.out.println("Is ABBA palindrome? " + isPalindrome("ABBA"));
        System.out.println("Is APPLE palindrome? " + isPalindrome("APPLE"));
        System.out.println("Is ASA palindrome? " + isPalindrome("ASA"));
        System.out.println("Is eyedipadanadapideye palindrome? " + isPalindrome("eyedipadanadapideye"));

    }

    public static String reverse(String input){
        if(input==null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length()-1)+ reverse(input.substring(0,input.length()-1));
    }

    public static boolean isPalindrome(String input){
        if(input.equals(reverse(input))){
            return true;
        }
        return false;
    }
}
