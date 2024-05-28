package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class LeetCode636 {

  public static void main(String[] args) {
    LeetCode636 l = new LeetCode636();
    String[] input = {"0:start:0", "0:start:1", "0:start:2", "0:end:3", "0:end:4", "0:end:5"};
    l.exclusiveTime(1,
        Arrays.asList("0:start:0", "0:start:1", "0:start:2", "0:end:3", "0:end:4", "0:end:5"));
  }

  public int[] exclusiveTime(int n, List<String> logs) {
    int[] result = new int[n];
    ArrayDeque<Log> stack = new ArrayDeque<>();
    for (String s : logs) {
      if (s.contains("start")) {
        String[] split = s.split(":start:");
        int id = Integer.parseInt(split[0]);
        int time = Integer.parseInt(split[1]);
        stack.push(new Log(id, time, 0));
      } else {
        String[] split = s.split(":end:");
        int id = Integer.parseInt(split[0]);
        int endTime = Integer.parseInt(split[1]);
        Log openLog = stack.pop();
        int duration = endTime - openLog.time + 1 + openLog.diff;
        result[id] += duration;
        if (!stack.isEmpty()) {
          stack.peek().diff = duration;
        }
      }
    }
    return result;
  }
}

class Log {

  int id;
  int time;
  int diff;

  public Log(int start, int time, int diff) {
    this.id = start;
    this.time = time;
    this.diff = diff;
  }

  @Override
  public String toString() {
    return "Log{" +
        "id=" + id +
        ", time=" + time +
        ", diff=" + diff +
        '}';
  }
}