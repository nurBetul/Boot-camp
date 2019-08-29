package com.testing;

public class Q5NumberOf9 {
    public static void main(String[] args) {
        int[] arr = {9,1,2,3,4,5,6,7,8,9};
        System.out.println(print9s(arr));
    }
    public static int print9s(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==9){
                count++;
            }
        }

        return count;
    }
}
