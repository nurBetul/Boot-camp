package InterviewPrep;

public class PalindromeStringBuilder {
    public static void main(String[] args) {
        System.out.println("is ARABIC palindrome? " + isPalindrome2("ARABIC"));
        System.out.println("is ARARA palindrome? " + isPalindrome2("ARARA"));

    }

    public static boolean isPalindrome2(String text){
        if(text == null || text.isEmpty()){
            return true;
        }

        java.lang.StringBuilder newContainer = new java.lang.StringBuilder(text.length());
        for(int i= text.length()-1; i>=0; i--){
            newContainer.append(text.charAt(i));
        }

        String reversedText = newContainer.toString();

        return text.equals(reversedText);

    }
}

