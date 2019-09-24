package InterviewPrep;
/*
Given a string an a second word string, we'll say that the word matches the string
if it appears at the front of the string, except its first char does not need to match exactly.
On a match return the front of the string or otherwise return the empty string.
String hippo the word hi returns hi
xip returns hip


 */

public class BizarreStringQuestion {

    public static void main(String args[]){
        String str1 = "hippo";
        String str2 = "xip";
        System.out.println(displayString(str1, str2));

        String word1 = "merhaba";
        String word2 = "dunya";

        System.out.println(displayString(word1,word2));

    }

    public static String displayString(String str, String word){
        int len1 = str.length();
        int len2 = word.length();
        if(len1>= len2){
            String temp = word.substring(1); // 1.karakter harici kelimeyi yeni bir degiskene atadik.
            if(str.substring(1,len2).equals(temp)){
                return str.substring(0,len2);
            }

        }

        return "No match";

    }



}
