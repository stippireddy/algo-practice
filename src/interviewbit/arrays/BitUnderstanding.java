/** Created by Sarveswara Tippireddy on Jul 3, 2017 */
package interviewbit.arrays;

public class BitUnderstanding {
  public static void main(String[] args) {
    int i = 14;
    System.out.println(i & ~(i - 1));
    System.out.println(i & -i);
    System.out.println(Integer.toBinaryString(i));
    System.out.println(Integer.toBinaryString(~i));
    System.out.println(~i);
    System.out.println(Integer.toBinaryString(-i));
    System.out.println(-i);
    System.out.println(Integer.toBinaryString(i - 1));
    System.out.println(Integer.toBinaryString(~(i - 1)));
  }
}
