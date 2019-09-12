package Exercises;

public class FindCapitalLetters {
    public static int findCapitals(String word){
        int number = 0;
        for(int i =0; i< word.length(); i++){
            if(word.charAt(i)>=65 && word.charAt(i)<= 90){
                number ++;
                System.out.print(word.charAt(i)+ ",");
            }

        }


        return number;
    }

    public static void checkCapitals(String word){
        int number = findCapitals(word);
        if(number > 4){
            System.out.println("Your word is accepted");
        }
        else if(number <= 4){
            System.out.println("Your word is rejected");
        }

    }



    public static void main(String[] args) {
        System.out.println(findCapitals("Ben Java Ogreniyorum Cok Eglenceli ve Zor Bir Dil"));
        checkCapitals("Ders Calismak Denize Nazir Ne de Guzel Cok Sukur");
    }
}
