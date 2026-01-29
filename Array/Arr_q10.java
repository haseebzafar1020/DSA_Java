// rotate array     d = 2 
// input  [1,3,4,5,7,8]
// output [4,5,7,8,1,3]


public class Arr_q10 {
    public static void main(String[] args) {
    int[] arr = {1,3,4,5,7,8,9};
    int n = arr.length;
    reverse(arr, 0, 1);
    reverse(arr, 2, n-1 );
    reverse(arr, 0, n-1);
    for(int ele: arr){
        System.out.print(ele+" ");
       }
       
    }
     public static void reverse(int[] arr , int i , int j ){
       
       while (i<j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
       }

       
}
}
