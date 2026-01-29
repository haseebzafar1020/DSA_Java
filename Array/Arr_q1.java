// Ques: Given an Array, print negative
// elements only
import java.util.Scanner;
public class Arr_q1 {
public static void main(String[] args) {
  // input number
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number:");
  int n = sc.nextInt(); 
 // input array
  int[] arr = new int[n]; 
  System.out.println("Enter the Array: ");
  for(int i=0; i<n; i++ ){
    arr[i] = sc.nextInt();
  }  
  // print negative array
  for(int i =0; i<n ; i++){
    if (arr[i] < 0){
    System.out.println(arr[i]);
    }
  }
}
}