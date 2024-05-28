package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

interface HtmlParser {

  List<String> getUrls(String url);
}

public class LeetCode1236 {

  public List<String> crawl(String startUrl, HtmlParser htmlParser) {
    List<String> result = new ArrayList<>();
    if (startUrl == null) {
      return result;
    }
    Set<String> visited = new HashSet<>();
    dfs(startUrl, htmlParser, result, visited);
    return result;
  }

  private void dfs(String startUrl, HtmlParser htmlParser, List<String> result,
      Set<String> visited) {
    String domain = startUrl.replaceFirst("http://", "").split("/")[0];

  }
}