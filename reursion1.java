import javax.print.attribute.standard.PrinterName;
// public class reursion1{
//     public static int calfactorial(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         int fac_nm1 = calfactorial(n-1);
//         int fac_nm2 = n * fac_nm1;
//         return fac_nm2;
//     }

//     public static void main(String args[]){
//         int n = 5;
//         int ans = calfactorial(n);
//         System.out.println(ans);
//     }
// }
public class reursion1{
    public static void printfib(int a , int b , int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfib(b, c, n-1);
    }

    public static void main(String args[]){
        int a = 0 ;
        int b = 1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);
        printfib(a, b, n-2);
    }
}

