package leetCode;

public class LeetCode953 {

  public static void main(String[] args) {
    LeetCode953 l = new LeetCode953();
    System.out.println(l.isAlienSorted(new String[]{"hello", "leetcode"},
        "hlabcdefgijkmnopqrstuvwxyz"));
  }

  public boolean isAlienSorted(String[] words, String order) {
    int[] orderMap = new int[26];
    for (int i = 0; i < order.length(); i++) {
      orderMap[order.charAt(i) - 'a'] = i;
    }
    for (int i = 0; i < words.length - 1; i++) {
      if (!isLessThan(words[i], words[i + 1], orderMap)) {
        return false;
      }
    }
    return true;
  }

  private boolean isLessThan(String a, String b, int[] map) {
    int i = 0;
    int j = 0;
    while (i < a.length() && j < b.length()) {
      if (map[a.charAt(i) - 'a'] < map[b.charAt(j) - 'a']) {
        return true;
      } else if (map[a.charAt(i) - 'a'] == map[b.charAt(j) - 'a']) {
        i++;
        j++;
      } else {
        return false;
      }
    }
    return i == a.length();
  }
}
