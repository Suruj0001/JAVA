import java.util.*;
public class recadvance {
    public static void towerofhanoi(int n , String src , String  help , String dest ){
        if(n==1){
            System.out.println("transfer disk " + n + "from" + src + "to" + dest);
            return;
        }
        towerofhanoi(n-1, src, dest, help);
        System.out.println("transfer disk " + n + "from" + src + "to" + dest);
        towerofhanoi(n-1, help, src, dest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of disk");
        int n = sc.nextInt();
        towerofhanoi(n, " S " , " H " , " D ");
    }
}
