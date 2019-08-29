package com.testing;

public class Q1StringMethod {

    public static void main(String[] args) {
        String myStr = "Nur Yaz ";
        System.out.println(printMultipleStrings(myStr, 10));
    }

    public static String printMultipleStrings(String str, int a){
        String result = "";
        if(a>0){
            for(int i = 0; i< a; i++){
                result = result+str;
            }
        }
        else{
            result = "Number must be bigger than 0.";
        }

        return result;
    }


}
