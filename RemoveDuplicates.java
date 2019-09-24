package InterviewPrep;
// write a code to filter duplicates from ab array and print as a list
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8,7,3,5,9,1,23,8,45};
        System.out.println(removeDuplicates(arr));

    }

    public static String removeDuplicates(int[] array){
        String result = "";
        for(int i=0; i<array.length; i++){
            for(int j=0; j< array.length; j++){
                if (i!=j){
                    if(array[i]==array[j]){
                        result = result + array[i] + " ";
                    }
                }
            }
        }
        System.out.println("Duplicate values in the array are: ");
        return result;
    }

}
