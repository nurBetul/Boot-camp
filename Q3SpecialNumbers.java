package com.testing;

public class Q3SpecialNumbers {
    public static void main(String[] args) {
        System.out.println(isSpecialNumber(122));
    }

    public static boolean isSpecialNumber(int number){
        boolean result = false;
        if(number%11 == 0 || (number-1)%11 == 0){
            result = true;
        }

        return result;
    }
}
