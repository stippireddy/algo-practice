/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/validate-ip-address/description/
 */
package leetCode;

public class LeetCode468 {

  public String validIPAddress(String ip) {
    if (ip.length() < 7) {
      return "Neither";
    }
    int i = 0;
    while (i < 5) {
      if (ip.charAt(i) == '.') {
        if (isValidIPv4(ip)) {
          return "IPv4";
        } else {
          return "Neither";
        }
      } else if (ip.charAt(i) == ':') {
        if (isValidIPv6(ip)) {
          return "IPv6";
        } else {
          return "Neither";
        }
      }
      i++;
    }
    return "Neither";
  }

  private boolean isValidIPv4(String ip) {
    if (ip.length() > 15) {
      return false;
    }
    int dotCount = 0;
    for (char c : ip.toCharArray()) {
      if (c == '.') {
        dotCount++;
      } else if (!Character.isDigit(c)) {
        return false;
      }
    }
    if (dotCount > 3 || dotCount < 3) {
      return false;
    }
    int startIndex = 0, endIndex = 0;
    while (endIndex < ip.length()) {
      while (endIndex < ip.length() && ip.charAt(endIndex) != '.') {
        endIndex++;
      }
      if (endIndex - startIndex == 0 || (endIndex - startIndex > 1 && ip.charAt(startIndex) == '0')
          || endIndex - startIndex > 3) {
        return false;
      }
      int partOfIp = Integer.valueOf(ip.substring(startIndex, endIndex));
      if (partOfIp >= 256) {
        return false;
      }
      endIndex++;
      startIndex = endIndex;
    }
    return Character.isDigit(ip.charAt(ip.length() - 1));
  }

  private boolean isValidIPv6(String ip) {
    if (ip.length() > 39) {
      return false;
    }
    int colonCount = 0;
    for (char c : ip.toCharArray()) {
      if (c == ':') {
        colonCount++;
      } else if (!Character.isLetterOrDigit(c)) {
        return false;
      } else {
        if (Character.toLowerCase(c) - 'a' > 5) {
          return false;
        }
      }
    }
    if (colonCount > 7 || colonCount < 7) {
      return false;
    }
    int startIndex = 0, endIndex = 0;
    while (endIndex < ip.length()) {
      while (endIndex < ip.length() && ip.charAt(endIndex) != ':') {
        endIndex++;
      }
      if (endIndex - startIndex == 0 || endIndex - startIndex > 4) {
        return false;
      }
      endIndex++;
      startIndex = endIndex;
    }
    return Character.isLetterOrDigit(ip.charAt(ip.length() - 1));
  }
}
