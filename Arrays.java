//public class Arrays {
//    public static void main(String args[]){
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 94;
//        marks[2] = 99;
//        // System.out.println(marks[0]);
//        // System.out.println(marks[1]);
//        // System.out.println(marks[2]);
//        for(int i = 0 ; i<3; i++){
//            System.out.println(marks[i]);
//        }
//        }
//}





//import java.util.*;
//public class Arrays{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//        //input
//        for(int i=0; i<size; i++){
//            numbers[i] = sc.nextInt();
//        }
//        System.out.println("Enter the number u want to search");
//        int x = sc.nextInt();
//        //output
//        for(int i=0; i<size; i++)//for(int i=0; i<numbers.length ; i++)
//        {
//            if(numbers[i] == x){
//                System.out.println(i+1 + " found at index : " + i);
//            }
//        }
//    }
//}

// Result

//    Enter the size of array
//        5
//        1
//        2
//        3
//        4
//        5
//        Enter the number u want to search
//        4
//        4 found at index : 3



/*
//Take n array of names from the user and print them on the screen
import java.util.*;
public class Arrays{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String names[] = new String[size];
    //input
    for(int i=0; i<size; i++){
        names[i] = sc.next();
    }
    for(int i=0; i<size; i++){
        System.out.println(names[i]);
    }
    }
}

//        5
//        suruj
//        asif
//        paraj
//        gaurav
//        himaku
//        suruj
//        asif
//        paraj
//        gaurav
//        himaku

/*



Find the maximum & minimum numbers in an array of integers.
import java.util.*;
public class Arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<size; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Largest number is " + max);
        System.out.println("Lowest number is " + min);
    }
}


//Take an array of numbers as input and check if it is an array sorted in ascending orders  
import java.util.*;
public class Arrays{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];
    // input
    for(int i=0;i<size;i++){
         numbers[i] = sc.nextInt();
    }
    boolean isAscending = true;

    for(int i=0; i<size-1;i++){
        if(numbers[i]>numbers[i+1]){
            isAscending = false;
        }
    }
    if(isAscending){
        System.out.println("The array is sorted in ascending order");
    }else{
        System.out.println("The array is sorted in descending order");
    }
    }
}
*/
