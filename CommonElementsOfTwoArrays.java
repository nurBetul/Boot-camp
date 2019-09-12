package Exercises;

public class CommonElementsOfTwoArrays {
    public static void findCommonElements(int[] arr1, int[] arr2){
        int count = 0;
        int [] arrLast = new int[arr1.length];
        for(int i = 0; i< arr1.length; i++){
            for(int j=0; j< arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    arrLast[i]= arr1[i];
                }
            }
        }

        for(int j=1; j< arrLast.length; j++){
            if(arrLast[j-1]!= arrLast[j]){
            System.out.print(arrLast[j] + " ");}
            }
        }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,9,25};
        int[] arr2 = {5,6,7,8,1,12,23,24,25,9,9,9};
        findCommonElements(arr1,arr2);
    }
}
