/*
import java.util.*;
public class Solutions{
    public static void CheckAge(int a){
        if(a>=18){
            System.out.println("You can Vote");
        }else{
            System.out.println("You cant vote");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int a = sc.nextInt();
        CheckAge(a);
    }
}
*/
/*
import java.util.*;
public class Solutions{
    public static boolean IsAge(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println((IsAge(age)));
    }
}
*/
/*
import java.util.*;
public class Solutions{
    public static void main(String args[]){
        do{

        }
        while(true);
    }
}
*/
/*
import java.util.*;
public class Solutions{
    public static void main(String args[]){
        int positive = 0 ; 
        int negative = 0 ; 
        int zero = 0;
        System.out.println("Press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input == 1){
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            if(number > 0){
                positive ++;
            }else if(number < 0){
                negative ++;
            }
            else{
                zero ++;
            }
            System.out.println("Press 1 to continue and 0 to stop");
            input = sc.nextInt();
        } 
        System.out.println("Positive is " + positive);
        System.out.println("Negative is " + negative);
        System.out.println("Zero " + zero);
    }
}
*/
/*
import java.util.*;
public class Solutions{
    public static void PowerChck(int x , int n){
        int result = 1;
        for(int i = 0; i<n ; i++){
            result = result * x;
        }
        System.out.println(x + " to the power " + n + " is " + result);
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
         System.out.println("Enter the x" );
         int x = sc.nextInt();
         System.out.println("Enter the n");
         int n = sc.nextInt();
         //System.out.println((PowerChck(x, n)));
         PowerChck(x, n);
    }
}
*/
