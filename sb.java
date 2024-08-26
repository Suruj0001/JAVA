public class sb {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("suruj");
        System.out.println(sb);
        for(int i=0 ; i<sb.length()/2 ; i++){
            int first = i;
            int last = sb.length()-1-i;
            
            char frontChar = sb.charAt(first);
            char backChar = sb.charAt(last);

            sb.setCharAt(first,backChar);
            sb.setCharAt(last, frontChar);
            //System.out.println(r);
        }
        
        System.out.println(sb);
        
        
    }
}
