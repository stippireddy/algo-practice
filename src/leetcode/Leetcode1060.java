//package leetcode;
//
//public class Leetcode1060 {
//    // nums = [4,7,9,10], k = 3
//    // size = 1, when k < num
//    // low = 0, high = 3
//    // mid = 1
//    //
//    //
//    public int missingElement(int[] nums, int k){
//        if(nums.length == 1) {
//            return nums[0] + k;
//        }
//        int start = nums[0];
//        int low = 0, high = nums.length - 1;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (nums[mid] == start + mid) {
//                low = mid + 1;
//            } else if (nums[mid] > mid + 1 + k) {
//                high = mid - 1;
//            } else {
//
//            }
//        }
//    }
//}
