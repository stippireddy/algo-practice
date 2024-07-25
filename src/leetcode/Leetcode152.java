package leetcode;

public class Leetcode152 {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        double result = Integer.MIN_VALUE;
        double product = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                product = 1;
                result = Math.max(result, 0);
            } else {
                product *= nums[i];
                result = Math.max(result, product);
                System.out.println(product);
                System.out.println(result);
            }
        }
        // System.out.println(result);
        product = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == 0) {
                product = 1;
                result = Math.max(result, 0);
            } else {
                product *= nums[i];
                result = Math.max(result, product);
                System.out.println(product);
                System.out.println(result);

            }
        }
        System.out.println(result);
        return (int) result;
    }

    public static void main(String[] args) {
        Leetcode152 l = new Leetcode152();
        l.maxProduct(new int[]{-2});
    }
}
