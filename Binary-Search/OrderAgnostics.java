// Ascending and descending order differently
public class OrderAgnostics {
    public static void main (String args[]){
        int[] arr = {-18,-12,-4,2,3,5,6,7,9};
        int target = 5;
        int ans = orderAgnostics(arr , target);
        System.out.println(ans);
    }
    static int orderAgnostics(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAc = arr[start] < arr[end];

//        while (start <= end) {
            //middle element

            while (start <= end) {
                //middle element
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (isAc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        //ans
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
    }

