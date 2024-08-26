 //BUBBLE-SORT
 import java.util.*;
 public class sorting{
     public static void printArray(int arr[]){
         for(int i=0; i<arr.length;i++){
             System.out.print(arr[i] + " ");
         }
         System.out.println();
     }
     public static void main(String args[]){
         int arr[] = {7,8,1,3,4};
         // outer loop
         //bubble sort
         System.out.println(arr.length);
         for(int i=0; i<arr.length-1;i++){ // n-1
             for(int j=0;j<arr.length-i-1;j++){
                 if(arr[j] > arr[j+1]){
                     //swap
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
             }
         }
         printArray(arr);
     }
}



// SELECTIOM SORT

//import java.util.*;
//public class sorting{
//    public static void printArray(int arr[]){
//        for(int i=0; i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//        //System.out.println();
//    }
//    public static void main(String args[]){
//        int arr[] = {7,8,1,3,4};
//        // outer loop
//        //selction sort
//        System.out.println(arr.length);
//        for(int i=0; i<arr.length-1;i++){ // n-1
//            int smallest = i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[smallest] > arr[j]){
//                    smallest = j;
//
//                }
//            }
//            int temp = arr[smallest];
//                    arr[smallest] = arr[i];
//                    arr[i] = temp;
//
//        }
//        printArray(arr);
//    }
//}

