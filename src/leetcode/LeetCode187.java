package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode187 {

  public List<String> findRepeatedDnaSequences1(String s) {
    if (s.length() < 10) {
      return new ArrayList<>();
    }

    HashMap<Character, Integer> encoding = new HashMap<>();
    encoding.put('A', 0);
    encoding.put('C', 1);
    encoding.put('G', 2);
    encoding.put('T', 3);
    HashMap<Integer, Character> decoding = new HashMap<>();
    decoding.put(0, 'A');
    decoding.put(1, 'C');
    decoding.put(2, 'G');
    decoding.put(3, 'T');
    HashMap<Integer, Integer> map = new HashMap<>();
    int encodedInteger = 0;
    int removeMSB = Integer.parseInt("11111111111111111111", 2);
    for (int i = 0; i < 9; i++) {
      encodedInteger = encodedInteger << 2;
      encodedInteger = encodedInteger | encoding.get(s.charAt(i));
    }
    for (int i = 9; i < s.length(); i++) {
      encodedInteger = encodedInteger << 2;
      encodedInteger = encodedInteger & removeMSB;
      encodedInteger = encodedInteger | encoding.get(s.charAt(i));
      map.put(encodedInteger, map.getOrDefault(encodedInteger, 0) + 1);
    }
    int getLSB = 3;
    List<String> result = new ArrayList<>();
    for (int i : map.keySet()) {
      if (map.get(i) > 1) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 10; j++) {
          int lsb = i & getLSB;
          sb.append(decoding.get(lsb));
          i = i >> 2;
        }
        result.add(sb.reverse().toString());
      }
    }
    return result;
  }

  public List<String> findRepeatedDnaSequences(String s) {
    if (s.length() < 10) {
      return new ArrayList<>();
    }

    HashMap<Character, Integer> encoding = new HashMap<>();
    encoding.put('A', 0);
    encoding.put('C', 1);
    encoding.put('G', 2);
    encoding.put('T', 3);
    HashSet<Integer> words = new HashSet<>();
    HashSet<Integer> doubleWords = new HashSet<>();
    int encodedInteger = 0;
    int removeMSB = Integer.parseInt("11111111111111111111", 2);
    List<String> result = new ArrayList<>();
    for (int i = 0; i < 9; i++) {
      encodedInteger = encodedInteger << 2;
      encodedInteger = encodedInteger | encoding.get(s.charAt(i));
    }
    for (int i = 9; i < s.length(); i++) {
      encodedInteger = encodedInteger << 2;
      encodedInteger = encodedInteger & removeMSB;
      encodedInteger = encodedInteger | encoding.get(s.charAt(i));
      if (!words.add(encodedInteger) && doubleWords.add(encodedInteger)) {
        result.add(s.substring(i - 9, i + 1));
      }
    }
    return result;
  }
}
