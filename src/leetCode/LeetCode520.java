package leetCode;

public class LeetCode520 {

  public boolean detectCapitalUse(String word) {
    if (word.length() < 2) {
      return true;
    }
    char[] charArray = word.toCharArray();
    boolean isFirstCapital = Character.isUpperCase(charArray[0]);
    boolean areRestCapital = Character.isUpperCase(charArray[1]);
    for (int i = 2; i < charArray.length; i++) {
      if (areRestCapital && !Character.isUpperCase(charArray[i])) {
        return false;
      }
      if (!areRestCapital && Character.isUpperCase(charArray[i])) {
        return false;
      }
    }
    if (!isFirstCapital) {
      return !areRestCapital;
    }
    return true;
  }

  public boolean detectCapitalUseUsingCapitalCount(String word) {
    if (word.length() < 2) {
      return true;
    }
    int capitalCount = 0;
    for (char c : word.toCharArray()) {
      if (Character.isUpperCase(c)) {
        capitalCount++;
      }
    }
    return capitalCount == 0
        || capitalCount == word.length()
        || (capitalCount == 1 && Character.isUpperCase(word.charAt(0)));
  }

  public boolean detectCapitalUseUsingStringMethods(String word) {
    if (word.length() < 2) {
      return true;
    }
    return word.equals(word.toUpperCase())
        || word.equals(word.toLowerCase())
        || word.substring(1).equals(word.substring(1).toLowerCase());
  }
}
