package com.testing;

public class Q4Stylishness {
    public static void main(String[] args) {
        System.out.println(getTheTable(1,10));
    }

    public static int getTheTable(int yourStyle, int dateStyle){
        int result = 0;
        if(dateStyle<=10 && yourStyle<=10 && yourStyle>0 && dateStyle>0){
        if(yourStyle>7 && dateStyle>2 || yourStyle>2 && dateStyle>7){
            result =2;
            System.out.println("Yes, you got the table");
        }
        else if(yourStyle<8 && dateStyle<8 && yourStyle>2 && dateStyle>2){
            result = 1;
            System.out.println("Maybe you get a table");
        }
        else if(yourStyle<3 || dateStyle<3){
            result = 0;
            System.out.println("You can not get a table");
        }}
        else{
            System.out.println("Please enter a number between 1-10");
        }

        return result;
    }
}
