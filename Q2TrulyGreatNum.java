package com.testing;

public class Q2TrulyGreatNum {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 6;
        System.out.println(isTrulyGreat(num1,num2));

    }

    public static boolean isTrulyGreat(int num1, int num2){
        boolean result = false;
        if(num1==6 || num2 == 6 || (num1+num2) == 6 || Math.abs(num1 - num2) == 6){
            result = true;
        }
        else result=false;

        return result;
    }
}
