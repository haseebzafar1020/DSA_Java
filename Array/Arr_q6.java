// search num in Array 

import java.util.Scanner;

public class Arr_q6 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter a number" );
        int x = sc.nextInt(); 
        int b = 0;
        int[] arr = {1 ,2 ,4 ,6 ,7,8};
        for (int i =0 ; i < arr.length; i++){
            if (x == arr[i]){
                b = 1;
                break;
            }
        }
        if ( b == 1){
            System.out.println("yes present");
        }
        else{
            System.out.println("not present");
        }
    }
}
