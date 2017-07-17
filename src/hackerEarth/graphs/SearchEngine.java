/**
 * Created by Sarveswara Tippireddy on Jul 9, 2017
 *
 * <p>This HackerEarth problem can be found @
 * https://www.hackerearth.com/practice/data-structures/advanced-data-structures/trie-keyword-tree/practice-problems/algorithm/search-engine/
 */
package hackerEarth.graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchEngine {
  public static void main(String args[]) throws Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    ArrayList<String> inputStrings = new ArrayList<>();
    ArrayList<Integer> inputWeights = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      inputStrings.add(s.next());
      inputWeights.add(s.nextInt());
    }
    TrieNode root = createTrie(inputStrings, inputWeights);
    while (k-- > 0) {
      System.out.println(findMaximumWeightPrefix(root, s.next()));
    }
    s.close();
  }

  private static int findMaximumWeightPrefix(TrieNode root, String s) {
    int i = 0;
    for (; i < s.length(); i++) {
      char c = s.charAt(i);
      if (root.chars[c - 'a'] != null) {
        root = root.chars[c - 'a'];
      } else {
        return -1;
      }
    }
    return root.weight;
  }

  private static class TrieNode {
    int weight;
    TrieNode[] chars = new TrieNode[26];

    TrieNode(int weight) {
      this.weight = weight;
    }
  }

  private static TrieNode createTrie(ArrayList<String> strings, ArrayList<Integer> weights) {
    TrieNode root = new TrieNode(-1);
    for (int i = 0; i < strings.size(); i++) {
      addNode(root, strings.get(i), weights.get(i));
    }
    return root;
  }

  private static void addNode(TrieNode trie, String s, int weight) {
    int i = 0;
    for (; i < s.length(); i++) {
      char c = s.charAt(i);
      if (trie.chars[c - 'a'] != null) {
        trie = trie.chars[c - 'a'];
        trie.weight = Integer.max(trie.weight, weight);
      } else {
        break;
      }
    }
    while (i < s.length()) {
      char c = s.charAt(i);
      trie.chars[c - 'a'] = new TrieNode(weight);
      trie = trie.chars[c - 'a'];
      i++;
    }
  }
}
