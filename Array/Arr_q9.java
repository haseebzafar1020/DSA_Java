//Revrse array 

public class Arr_q9 {

   
    public static void main(String[] args) {
       int[] arr ={1,77,5,6,48,88,22,55};
       int n = arr.length;
       int i = 0 , j = n-1;
       int temp;
       while (i<j) {
        temp = arr[i];
        arr[i] = arr[j];
         arr[j] = temp;
         i++;
         j--;
       }
        
       for (int ele : arr){
        System.out.print(ele + " ");
       }   
}
}