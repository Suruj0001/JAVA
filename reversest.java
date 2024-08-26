// public class reversest {
//     public static void printrev(String str , int indx){
//         if(indx==-1){
//             return;
//         }
//         System.out.print(str.charAt(indx));
//         printrev(str, indx-1);

//     }
//     public static void main(String args[]){
//         String str = "abcd";
//         printrev(str, str.length()-1);
//     }
// }    



//complex program check python -- 
public class reversest{
public static int first = -1;
public static int last = -1;
public static void findocc(String str , int idx , char element){
    char currchar = str.charAt(idx);
    if(idx==str.length()){
        System.out.println(first);
        System.err.println(last);
        return ;
    }
    if(currchar == element){
        if(first == -1){
            first = idx;
        }else{
            last = idx;
        }
    }
    findocc(str, idx+1, element);
}
public static void main(String args[]){
    String str = "abaacdaefaaah";
    findocc(str, 0 , 'a');
}
}

