package geeksForGeeks;

import java.util.Scanner;

class GFG {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < a.length; i++) {
        a[i] = sc.nextInt();
      }
      int k = sc.nextInt();
      int left = 0, right = k - 1;
      while (left < right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
        left++;
        right--;
      }
      left = k;
      right = n - 1;
      while (left < right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
        left++;
        right--;
      }
      left = 0;
      right = n - 1;
      while (left < right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
        left++;
        right--;
      }
      StringBuffer sb = new StringBuffer();
      for (int i : a) {
        sb.append(i).append(" ");
      }
      System.out.println(sb.substring(0, sb.length() - 1));
    }
    sc.close();
  }
}
