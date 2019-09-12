package Exercises;
// Program displays the fibonacci numbers as the given number.
public class Fibonacci {
    public static void displayFibonacci(int n){
        System.out.print("0, 1, 1,");
        int [] arr = new int[n];
        for(int i=3; i<arr.length; i++){
            arr[0]=0;
            arr[1]=1;
            arr[2]=1;
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+ " ,");

        }

        }


    public static void main(String[] args) {
        displayFibonacci(20);
    }
}
