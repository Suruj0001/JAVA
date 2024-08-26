//public class BinaryQuestions {
//        public static void main(String args[]) {
//            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            int target = 11; // printing 10 as the highest index is call 11
//            int ans = BinarySearch(arr, target);
//            System.out.println(ans);

//
//        }

//        static int BinarySearch(int[] arr, int target) {
//            int start = 0;
//            int end = arr.length - 1;
//
//            while (start <= end) {
//                //middle element
//                int mid = start + (end - start) / 2;
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else if (target > arr[mid]) {
//                    start = mid + 1;
//                } else {
//                    //ans
//                    return mid;
//                }
//            }
//            return start;
//        }
//    }



// Infinite array approach
//
//public class BinaryQuestions{
//    public static void main (String args[]){
//        int[] arr = { 3 , 5 , 6 , 7 , 9 , 10 ,
//        100 ,120 , 140 , 160 , 170};
//        int target = 10 ;
//        System.out.println(ans(arr, target));
//    }
//    // start with the box of size 2
//    static int ans(int[] arr , int target ){
//        // find the range first
//        // first start with a box of size 2
//        int start = 0;
//        int end = 1 ;
//
//        // condition for the Target to lie in range
//        while (target > arr[end]){
//            int newsStart = end + 1 ;
//            // double the box value
//            //end = previous end + sizeofbox+2
//            end = end + (end - start + 1) * 2 ;
//            start = newsStart;
//        }
//
//        return BinaryQuestions(arr , target , start , end);
//
//    }
//    static int BinaryQuestions(int[] arr , int target , int start ,int end) {
//        while (start <= end) {
//                //middle element
//                int mid = start + (end - start) / 2;
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else if (target > arr[mid]) {
//                    start = mid + 1;
//                } else {
//                    //ans
//                    return mid;
//                }
//            }
//            return start;
//    }
//}
//
////Ans : 5 index simple
//

// Mountain Array no specific target
//
//public class BinaryQuestions {
//    public static void main (String args[]) {
//        int[] arr = { 1 , 2 , 3, 1 };
//
//    }
//
//    logic

//    public int peakIndexMountainArray(int[] arr) {
//
//        int start  = 0 ;
//        int end = arr.length - 1 ;
//
//        while (start < end) {
//            int mid = start + (end - start ) / 2 ;
//            if  (arr[mid] > arr[mid + 1]) {
//                    // dec array
//                    // can be ans look at the left
//                    // end is requoired != mid -1
//                    end = mid ;
//            } else {
//                // if you are in the asc
//                start = mid + 1 ;
//
//            }
//        }
//
//        //in the end == end point coz of two check above
//        // start and end are trying to find max element that is max
//
//        return start ; //  or end  means the same
//    }
//}



// Split Array Problems

//public class BinaryQuestions {
//    public static void main(String args[]){
//
//    }
//    public int splitArray(int[] nums , int m){
//        int start = 0;
//        int end = 0;
//
//        for (int i = 0 ; i < nums.length; i++){
//            start = Math.max(start, nums[i]);
//            end += nums[i];
//        }
//
//        //binary search
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//
//
//            //calculating pieces
//            int sum = 0 ;
//            int pieces = 1;
//            for(int num : nums){
//                if (sum + num > mid){
//                    //cant make sub array
//                    // adding to num aray
//                    sum = num;
//                    pieces++;
//                } else {
//                    sum += num ;
//                }
//            }
//            if ( pieces > m){
//                start = mid + 1;
//            } else {
//                end = mid;
//            }
//        }
//        return end;
//    }
//}
//




