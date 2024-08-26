//import java.util.*;
class insertion{
    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }       
    } 
    public static void main(String args[]){
        int arr[] = {9,7,8,2,3};
            
        // insertion sort -- outer loop
        for(int i=1; i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        } 
     printArr(arr);   
    }
}
