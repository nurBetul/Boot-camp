package InterviewPrep;

import java.util.Scanner;

//factorial of given number
public class Factorial {

    public static void main(String args[]){
        System.out.println("Please enter the number for factorial");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result = displayFactorial(number);
        System.out.println("Factorial of "+ number+" solved with iteration is: " + result  );

        int recursiveREsult = recursiveFactorial(number);
        System.out.println("Factorial of " +number+" solved with recursive is: " + recursiveREsult);

    }

    public static int displayFactorial(int n){
        int result = 1;
        for(int i=2; i<=n; i++){
            result = result *i;
        }

        return result;
    }

    public static int recursiveFactorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n* recursiveFactorial(n-1);
        }

    }

}
