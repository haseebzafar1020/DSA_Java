// Ques: Print the Maximum element in
// the array

public class Arr_q3 {
    public static void main(String[] args) {
        int arr[] = {1,4,-5,6,77,8,99,32};
        int max = arr[0];
        for(int i= 0 ; i < arr.length; i++){
            if (arr[i] > max){
            max = arr[i];
            }
        }
System.out.println(max);
    }
}
