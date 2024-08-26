// public class TreeDataStructure {
//     static class Node {
//         Node[] children;
//         boolean eow; // end of words

//         public Node() {
//             children = new Node[26]; //a to z
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//             eow = false;
//         }
// }

    // static Node root = new Node();

    // public static void insert(String word) {
    //     Node curr = root;
    //     for (int i = 0; i < word.length; i++) {
    //         int idx = word.charAt(i) - 'a';

    //         if (curr.children[idx] == null) {
    //             //add new node
    //             curr.children[idx] = new Node();
    //         }
    //         if (i == word.lengh() - 1) {
    //             curr.children[idx].eow = true;
    //         }

    //         curr = root.children[idx];
    //     }
    // }

//     public static boolean search(String key) {
//         Node curr = root;
//         for (int i = 0; i < key.length(); i++) {
//             int idx = key.charAt[i] - 'a';
//             Node node = curr.children[idx];

//             if (root.children[idx] == null) {
//                 return false;
//             }
//             if (i == key.length() - 1 && root.children[idx].eow == false) {
//                 return false;
//             }
//             root = root.children[idx];
//         }
//         return true;
//     }


//     public static boolean wordBreak(String key) {
//         if (key.length() == 0) {
//             return true;
//         }

//         for (int i = 1; i <= key.length(); i++) {
//             String firstPart = key.substring(beginIndex:0, 1); // only one character
//             String secPart = key.substring(i);
//             if (search(firstPart) && wordBreak(secPart)) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static boolean startsWith(String prefix) {
//         Node curr = root;

//         for(int i=0; i<prefix.length();i++){
//             int idx = prefix.charAt(i) - 'a';

//             if (curr.children[idx] == null){
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return true;
//     }

//     public static int countNode(Node root) {
//         if(root == null){
//             return 0;
//         }
//         int count = 0;
//         for(int i=0; i<26; i++){
//             if(root.children[i] != null){
//                 count += countNode(root.children[i]);
//             }
//         }
//         return count+1;
//     }


//     public static String ans = "";

//     public static void longestWord(Node root, StringBuilder temp){
//         if(root == null){
//             return;
//         }

//         for(int i=0; i<26; i++){
//             if(root.children[i] != null && root.children[i] == true){
//                 temp.append((char)i+'a'));
//                 if(temp.length() > ans.length()){
//                     ans = temp.toString();
//                 }
//                 longestWord(root.children[i].temp);
//                 temp.deleteCharAt(temp.length()-1)
//             }
//         }
//     }

//     public static void main(String args[]) {
//         String str = "ababa";
//         for(int i=0 ; i<str.length();i++){
//             String suffix = str.substring(i);
//            // System.out.println(suffix);
//             insert(suffix); //  to insert
//         }
//     }
// }
//        String words[] = {"the", "a", "their", "any"};
//        String key = "ilikesamsung";
//    }
// }

//        for (int i = 0; i < words.length; i++) {
//            insert(words[i]);
//        }

//        System.out.println(wordBreak(key));
//    }
// }

//        for(int i=0; i< words.length; i++){
//            insert(words[i]);
//        }

//        System.out.println(key:"their")); //true
//        System.out.println(search(key:"thor")); //false
//        System.out.println(search(key:"an")); //false
//    }
// }