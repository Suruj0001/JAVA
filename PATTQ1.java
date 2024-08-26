// BE CAREFULL WITH PATTQ QUESTION FOCUS MORE ON THE OUTER LOOP AND INNER LOOP N FOR ROWS M FOR COLUMN I -- ROWS J -- COLUMN 
// import java.util.*;
// public class PATTQ1{
//      public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the length");
//         int m = sc.nextInt();
//         System.out.println("Enter the breadth");
//         int n = sc.nextInt();
//         //patt q1 solid rectangle
//         System.out.println("A Solid Rectangle");
//         //outer loop
//         for(int i=1 ; i<=n ; i++){
//             //inner loop
//             for(int j=1 ; j<=m; j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//      }    

//     }
        /*
        import java.util.*;
        public class PATTQ1{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //length row
        int m = sc.nextInt(); //breadth column
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
            if(i == 1 || j == 1 || i == n || j == m) {
                System.out.print("*");
            }   else{
                System.out.print(" ");
            }  
            }
            System.out.println();
        }
    }
} 
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=n-i; j<=i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
*/
/*
public class PATTQ1{
    public static void main(String args[]){
        int n = 4;
        // outer loop
        for(int i=1 ; i<=n; i++){
            // inner loop ->> space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop ->> star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<=n ; i++){
        //inner loop
        for(int j=1; j<=i; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }     
    }
}
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);{
           int n = sc.nextInt();
           // int number = 1;
            for(int i=1 ; i<=n; i++){
                 for(int j=1; j<=i; j++){
                     int sum = i+j;
                     if(sum % 2 ==0){
                     System.out.print(" 1 ");
                     } else {
                         System.out.print(" 0 ");
                     }
                    
            }
            System.out.println();
        }
    }
}
}
*/
// rhombus
/*
import java.util.*;
public class PATTQ1{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
        //System.out.print("*");
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outer loop
        for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i + " ");
        }
        System.out.println();
        }
    }
}
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // outer loop
    for(int i=1; i<=n ; i++){
        // inner loop
        for(int j=1; j<=n-i; j++){
            System.out.print("  ");
        }
        for(int j=i; j>=1; j--){
           System.out.print(j + " ");
        }
       
        for(int j=2;j<=i;j++){
        System.out.print(j + " ");
        }
     
        System.out.println();

    }
    }
}
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //outer loop
    for(int i=1; i<=n; i++){
        //inner loop
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        for(int j=1; j<=2 * (n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    // lower part
    for(int i=n;i>=1;i--){
        // inner loop
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<= 2 * (n-i); j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop
        for(int i=1; i<=n; i++){
        // inner loop
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // first half sec part
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // sec part
        for(int i=n; i>=1; i--){
        for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        for(int j=2;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
        }
    }
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
            for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
            System.out.print(" "); 
            }
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if(j==1 || j==i){
                System.out.print("*");
            }
        
            else{
                System.out.print(" ");
            }
        }
            int space= 2*(n-i);
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
        System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if( j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
           int space=2*(n-i);
           for(int j=1;j<=space;j++){
               System.out.print(" ");
           }
           for(int j=1; j<=i;j++){
               if( j==1 || j==i){
               System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }

            System.out.println();
        }
        
    }
    }
*/
/*
import java.util.*;
public class PATTQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++){
                if(j==1 || j==n ){
                    System.out.print("*");
                }else if( i==1 || i==n){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                }
            System.out.println();
        }

    }
    }
*/
/*
import java.util.*;
class PATTQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            //space
            for(int j=0 ; j<=n-i; j++){
                System.out.print(" ");
            }
            //number
            int val = 1;
            for(int k=0; k<=i; k++){
            System.out.print(val +" ");
            val = val*(i-k)/(k+1);

        }
System.out.println();
        }
    }
}    
*/
/*
import java.util.*;
class PATTQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(  (n+1)-i + " ");
            }
            System.out.println();
        }
    }
}
*/
