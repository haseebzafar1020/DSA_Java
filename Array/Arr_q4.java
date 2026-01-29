 // Ques: Print the Minimum element in
// the array

public class Arr_q4 {
    public static void main(String[] args) {
        int arr[] = {1,4,-5,6,77,8,99,32};
        int min = arr[0];
        for(int i= 0 ; i < arr.length; i++){
            if (arr[i] < min){
            min = arr[i];
            }
        }
System.out.println(min);
    }
}



