/*import java.util.*;
public class all {
    public static void main(String[] args) 
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int  sum = 0 ; 
        for(int i = 0 ; i<= n ; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

*/
// Print the table of  a number input by the user 

import java.util.*;
public class all{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number : ");
          int n = sc.nextInt();
        //outer loop
        for(int i = 1 ; i<=n ; i++){
            // inner loop
            for(int j=1 ; j<=n ; j++){
                System.out.println("*");
            }
        }
    }
}

