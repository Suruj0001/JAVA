/* 
public class sorted {
    public static boolean sort( int arr[] , int idx ){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return sort(arr , idx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,7,8};
        System.out.println(sort(arr , 0));

    }
}
*/
public class sorted{
    public static void moveALLX(String str , String newString , int idx , int count  ){
        if(idx == str.length())
        {
            for(int i=0 ; i<count ; i++){
                newString = newString + 'x';
            }
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == 'x'){
            count++;
            moveALLX(str, newString, idx+1, count);
        }else{
            newString += currchar;
            moveALLX(str, newString, idx+1, count);
        }
    }
    public static void main(String args[]){
        String str = "axbcxxd";
        moveALLX(str , " " , 0 , 0 );
    }
}