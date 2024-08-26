import java.util.*;
public class Search {
    public static void main(String[] args) {
        String name = "Harry";
        char target = 'a';
        int arr[] = {18, 12, -7, 19, 8};
        System.out.println(search(name, target));
        System.out.println(min(arr));

        System.out.println(Arrays.toString(name.toCharArray()));

        int[][] arr2 = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target2 = 3;
        int[] ans = search3(arr2 , target2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search3(int[][] arr2 , int target2) {
        for (int row = 0 ; row < arr2.length ; row++) {
            for (int col = 0 ; col < arr2[row].length; col ++){
                if (arr2[row][col] == target2){
                    return new int[]{row , col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //Minimum number in the array list
    static int min(int[]  arr){
        int ans = arr[0];
        for (int i = 1 ; i < arr.length; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    static boolean search2(String str , char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray())
            if (ch == target) {
                return true;
            }
        return false;
    }
    static boolean search(String str , char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0 ; i < str.length() ; i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}


