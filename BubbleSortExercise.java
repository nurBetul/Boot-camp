package Exercises;

import java.util.Arrays;

// sort a given array
public class BubbleSortExercise {

    public static void main(String[] args) {
        int[] arr = {3,7,6,1,9,67};
        sortArray(arr);
    }
    public static void sortArray (int[] array){
        int temp = 0;
        for(int i=0; i<array.length; i++){
            for(int j=1; j<array.length; j++){
                if(array[j-1]>array[j]){
                    temp= array[j];
                    array[j]= array[j-1];
                    array[j-1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(array));
    }
}
