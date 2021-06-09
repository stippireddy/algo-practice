package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SixSense {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
    ArrayList<String> array = new ArrayList<>();
    while (true) {
      String s = reader.readLine();
      if (s.equals("")) {
        break;
      }
      array.add(s);
    }
    ArrayList<String> words = new ArrayList<>();
    int maxLength = 0;
    while (true) {
      String word = reader.readLine();
      if (word == null || word.equals("")) {
        break;
      }
      word = word.trim();
      maxLength = Integer.max(maxLength, word.length());
      words.add(word);
    }
    TrieNode root = buildTrie(array, maxLength);
    for (String word : words) {
      int[] position = findWord(root, word);
      System.out.println(word + " " + position[0] + " " + position[1]);
    }
  }

  private static int[] findWord(TrieNode root, String word) {
    for (char c : word.toCharArray()) {
      if (root.children[c - 'A'] == null) {
        return new int[]{-1, -1};
      }
      root = root.children[c - 'A'];
    }
    return root.startPos;
  }

  private static TrieNode buildTrie(ArrayList<String> input, int length) {
    TrieNode root = new TrieNode(-1, -1);
    for (int i = 0; i < input.size(); i++) {
      for (int j = 0; j < input.get(i).length(); j++) {
        if (root.children[input.get(i).charAt(j) - 'A'] == null) {
          root.children[input.get(i).charAt(j) - 'A'] = new TrieNode(i, j);
        }
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {-1, -1},
            {1, -1}, {-1, 1}};
        for (int[] direction : directions) {
          int x = i, y = j;
          TrieNode prev = root.children[input.get(x).charAt(y) - 'A'];
          for (int l = 0; l < length; l++) {
            if (!isValidNextIndex(input, x, y, direction)) {
              break;
            }
            x += direction[0];
            y += direction[1];
            if (prev.children[input.get(x).charAt(y) - 'A'] == null) {
              prev.children[input.get(x).charAt(y) - 'A'] = new TrieNode(i, j);
            }
            prev = prev.children[input.get(x).charAt(y) - 'A'];

          }
        }
      }
    }
    return root;
  }

  private static boolean isValidNextIndex(ArrayList<String> input, int x, int y, int[] direction) {
    x += direction[0];
    y += direction[1];
    return x >= 0 && y >= 0 && x < input.size() && y < input.get(x).length();
  }
}

class TrieNode {

  TrieNode[] children;
  int[] startPos;

  TrieNode(int x, int y) {
    children = new TrieNode[26];
    startPos = new int[]{x, y};
  }
}
