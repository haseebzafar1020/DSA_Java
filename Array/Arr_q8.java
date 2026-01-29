// Ques: Print the second Maximum
// element in the array

public class Arr_q8 {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,8,20}; 
        int max = arr[0];
        int s_max =arr [0];
        for (int i = 0; i< arr.length; i++ ){
        // int i;
        if (max < arr[i] ){
             max = arr[i]; 
        }
      
    }
      for(int i=0; i<arr.length; i++ ){
        if(s_max < arr[i]  && arr[i]!=max ){
            s_max = arr[i];
        }
      }
    System.out.println(max);
    System.out.println(s_max);

    }
}
