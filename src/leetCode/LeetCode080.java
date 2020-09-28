package leetCode;

public class LeetCode080 {

  public static void main(String[] args) {
    LeetCode080 l = new LeetCode080();
    System.out.println(l.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
  }

  public int removeDuplicates(int[] nums) {
    int i = 0, j = 0;
    while (j < nums.length) {
      int currentElement = nums[j];
      int count = 0;
      while (j < nums.length && nums[j] == currentElement) {
        j++;
        count++;
      }
      if (count > 2) {
        count = 2;
      }
      while (count > 0) {
        nums[i] = currentElement;
        i++;
        count--;
      }
    }
    return i;
  }
}
