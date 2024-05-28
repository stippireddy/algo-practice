package leetcode;

public class LeetCode208 {

}

class Trie {

  /**
   * Initialize your data structure here.
   */
  TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

  /**
   * Inserts a word into the trie.
   */
  public void insert(String word) {
    if (word == null || word.length() == 0) {
      return;
    }
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      if (node.children[word.charAt(i) - 'a'] == null) {
        node.children[word.charAt(i) - 'a'] = new TrieNode();
      }
      node = node.children[word.charAt(i) - 'a'];
    }
    node.isWord = true;
  }

  /**
   * Returns if the word is in the trie.
   */
  public boolean search(String word) {
    if (word == null || word.length() == 0) {
      return false;
    }
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      if (node.children[word.charAt(i) - 'a'] == null) {
        return false;
      }
      node = node.children[word.charAt(i) - 'a'];
    }
    return node.isWord;
  }

  /**
   * Returns if there is any word in the trie that starts with the given prefix.
   */
  public boolean startsWith(String prefix) {
    if (prefix == null) {
      return false;
    }
    if (prefix.length() == 0) {
      return true;
    }
    TrieNode node = root;
    for (int i = 0; i < prefix.length(); i++) {
      if (node.children[prefix.charAt(i) - 'a'] == null) {
        return false;
      }
      node = node.children[prefix.charAt(i) - 'a'];
    }
    return true;
  }
}

class TrieNode {

  TrieNode[] children;
  boolean isWord;

  TrieNode() {
    children = new TrieNode[26];
    isWord = false;
  }
}