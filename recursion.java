// import java.util.*;
// public class recursion {
//     public static void printNum(int n){

//         if(n == 0){
//             return;
//          }
//         System.out.println(n);
//          printNum(n-1);
//      }
    
//      public static void main(String args[]){
//          int n = 5;
//          printNum(n);
// }
// }
//  }
// import java.util.*;
// public class recursion{
//     public static void PrintSum(int i , int n , int sum ){
//         if(i==n){
//             sum+=i;
//             System.out.println("sum is " + sum);
//            // System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         PrintSum(i+1 , n , sum);
//         System.out.println(i);
//     }
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the first number");
//     int i = sc.nextInt();
//     System.out.println("Enter the last number");
//     int n = sc.nextInt();
//     PrintSum(i, n, 0);
//     }    
// }
// public class recursion{
//     public static int calfactorial(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         int fac = calfactorial(n-1);
//         int fac2 = n * fac;
//         return fac2;

//     }

// public static void main(String args[]){
//     int n = 5;
//     int ans = calfactorial(n);
//     System.out.println(ans);

// }

// }
// import java.util.*;
// public class recursion{

//     public static int stckh(int x , int n){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }
//         int stckm1 = stckh(x, n-1);
//         int ans = x * stckm1;
//         return ans;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("print x");
//         int n = sc.nextInt();
//         System.out.println("print n");
//         int x = sc.nextInt();
//         stckh(x, n);
//         int ans = stckh(x, n);
//         System.out.println(ans);
//     }
// }
import java.util.*;
public class recursion{
    public static int stacklog(int x , int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        //if n is even
        if(n%2==0){
            return stacklog(x, n/2) * stacklog(x, n/2);
        }
        else{
            return stacklog(x, n/2) * stacklog(x, n/2) * x;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print x");
        int x = sc.nextInt();
        System.out.println("print n");
        int n = sc.nextInt();
        int ans = stacklog(x, n);
        System.out.println(ans);
    }
}
