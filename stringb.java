import java.util.*;
public class stringb {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index o
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 's');
        System.out.println(sb);

        //insert char
        sb.insert(2, 'n');
        System.out.println(sb);

        //delete the xtra
        sb.delete(3, sb.length());
        System.out.println(sb);

        //add 
        System.out.println("new string builder ");
        StringBuilder s = new StringBuilder("h");
        s.append("e");
        s.append("l");
        s.append("l");
        s.append("o");
        System.out.println(s + " length is " + s.length());
        
        
        // reverse a string

      
    }
}
