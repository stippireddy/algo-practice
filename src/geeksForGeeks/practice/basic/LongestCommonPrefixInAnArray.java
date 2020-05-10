/**
 * Created by Sarveswara Tippireddy on Jul 15, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/longest-common-prefix-set-1-word-by-word-matching/
 * http://www.geeksforgeeks.org/longest-common-prefix-set-2-character-by-character-matching/
 * http://www.geeksforgeeks.org/longest-common-prefix-set-3-divide-and-conquer/
 * http://www.geeksforgeeks.org/longest-common-prefix-set-4-binary-search/
 * http://www.geeksforgeeks.org/longest-common-prefix-set-5-using-trie/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class LongestCommonPrefixInAnArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      String[] input = new String[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.next();
      }
      System.out.println(findLongestCommonPrefix5(input));
    }
    sc.close();
  }

  public static String findLongestCommonPrefix1(String[] input) {
    StringBuffer sb = new StringBuffer(input[0]);
    for (int i = 1; i < input.length; i++) {
      for (int j = 0; j < sb.length(); j++) {
        if (j >= input[i].length() || input[i].charAt(j) != sb.charAt(j)) {
          sb.delete(j, sb.length());
          break;
        }
      }
    }
    return sb.length() > 0 ? sb.toString() : "-1";
  }

  public static String findLongestCommonPrefix2(String[] input) {
    StringBuffer sb = new StringBuffer();
    String firstString = input[0];
    outerLoop:
    for (int i = 0; i < firstString.length(); i++) {
      char c = firstString.charAt(i);
      for (int j = 1; j < input.length; j++) {
        if (i >= input[j].length() || input[j].charAt(i) != c) {
          break outerLoop;
        }
      }
      sb.append(c);
    }
    return sb.length() > 0 ? sb.toString() : "-1";
  }

  public static String findLongestCommonPrefix4(String[] input) {
    String minString = input[0];
    for (int i = 1; i < input.length; i++) {
      if (input[i].length() < minString.length()) {
        minString = input[i];
      }
    }
    int left = 0, res = -1, right = minString.length() - 1;
    outerLoop:
    while (left <= right) {
      int mid = left + (right - left) / 2;
      char c = minString.charAt(mid);
      for (int j = 0; j < input.length; j++) {
        if (mid >= input[j].length() || input[j].charAt(mid) != c) {
          right = mid - 1;
          break outerLoop;
        }
      }
      left = mid + 1;
      res = mid;
    }
    return res == -1 ? "-1" : minString.substring(0, res + 1);
  }

  public static String findLongestCommonPrefix5(String[] input) {
    TrieNode trie = createTrie(input);
    StringBuffer sb = new StringBuffer();
    while (trie != null) {
      int splitCount = 0;
      int currChar = -1;
      for (int i = 0; i < 26; i++) {
        if (trie.index[i] != null) {
          splitCount++;
          currChar = i;
        }
      }
      if (splitCount > 1 || currChar == -1) {
        break;
      } else {
        sb.append((char) ('a' + currChar));
        trie = trie.index[currChar];
      }
    }
    return sb.length() > 0 ? sb.toString() : "-1";
  }

  private static TrieNode createTrie(String[] input) {
    TrieNode root = new TrieNode();
    for (int i = 0; i < input.length; i++) {
      insertString(root, input[i]);
    }
    return root;
  }

  private static void insertString(TrieNode root, String input) {
    for (int i = 0; i < input.length(); i++) {
      int currCharIndex = input.charAt(i) - 'a';
      if (root.index[currCharIndex] == null) {
        root.index[currCharIndex] = new TrieNode();
      }
      root = root.index[currCharIndex];
    }
  }

  static class TrieNode {

    TrieNode[] index = new TrieNode[26];
  }
}
