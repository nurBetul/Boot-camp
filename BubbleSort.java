package Java8Week;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] bubbleArr = {12,456,234,68,2342,69,8678,2343567,34456,1,7,0};
        for (int element: bubbleArr
             ) {
            System.out.print(element+ " ");
        }
        System.out.println();
        sort(bubbleArr);
    }
    static void sort(int[] arr){
        int n= arr.length;
        int temp = 0;
        for(int i=0; i< n; i++){
            for(int j=1; j<n; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
