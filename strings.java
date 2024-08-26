/*
import java.util.*;
public class  strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String last = sc.next();
        String fullname = name + " " + last;
        System.out.println(fullname);
        System.out.println(fullname.length());
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
       
    }
   
}
*/
/*
// compare of string
import java.util.*;
public class strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        if(name1.equals(name2)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("not equal");
        }
    }
}
*/
/*
//substring
//beg index o and ending index number.length()-1
public class strings{
    public static void main(String args[]){
        String name = "surujkalita";
        System.out.println(name.substring(0 , 3));
    }
}
*/
/*
public class strings{
    public static void main(String args[]){
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}
*/
/*
public class strings{
    public static void main(String args[]){
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());
    }
}
*/
/*
import java.util.*;
public class strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];

    }
}
*/
/*
import java.util.*;
public class strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totlength = 0;
        //input
        for(int i=0; i<size; i++){
            array[i] = sc.next();
            totlength = totlength + array[i].length();
        }
        System.out.println(totlength);
    }
}
*/
