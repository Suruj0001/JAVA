/*
import java.util.*;
public class SOL2{
    public static void GcdChck(int n1 , int n2){
      while(n1 != n2){
        if(n1>n2){
            n1=n1-n2;
        }
        else if(n1<n2){
            n2=n2-n1;
        }
      }
      System.out.println("GCD is " + n2);
       
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    GcdChck(n1, n2);
}
}
*/
import java.util.*;
public class SOL2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        // nth term
        if(n>1){
            for(int i = 2; i<=n; i++){
                System.out.print(b+" ");// 1 1 2
                int c = a+b; // 1 2
                a = b ; // 1 1
                b = c;// 1 2
            }
            //System.out.println();
        }
    }
}