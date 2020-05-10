package spoj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class INTEST {

  public static void main(String[] args) {
    FastScanner s = new FastScanner();
    int n = s.nextInt();
    int k = s.nextInt();
    int count = 0;
    while (n-- > 0) {
      if (s.nextInt() % k == 0) {
        count++;
      }
    }
    System.out.println(count);
  }

  public static class FastScanner {

    BufferedReader br;
    StringTokenizer st;

    public FastScanner(String s) {
      try {
        br = new BufferedReader(new FileReader(s));
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }

    public FastScanner() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
      if (st == null || !st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public void close() throws IOException {
      br.close();
    }
  }

}