package hackerEarth.graphs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MonkLearningGraph {

  public static void main(String args[]) throws Exception {
    FastScanner fs = new FastScanner();
    FastPrinter fp = new FastPrinter();
    int N = fs.nextInt();
    int M = fs.nextInt();
    int k = fs.nextInt();
    GraphNode[] graph = new GraphNode[N + 1];
    for (int i = 1; i < graph.length; i++) {
      graph[i] = new GraphNode(i, fs.nextInt());
    }

    for (int i = 0; i < M; i++) {
      int m = fs.nextInt();
      int n = fs.nextInt();
      graph[m].getAdjacencyList().add(graph[n]);
      graph[n].getAdjacencyList().add(graph[m]);
    }
    for (int i = 1; i < graph.length; i++) {
      ArrayList<GraphNode> adjacencyList = graph[i].getAdjacencyList();
      Collections.sort(adjacencyList);
      if (adjacencyList.size() >= k) {
        fp.printLine("" + adjacencyList.get(k - 1).identifier);
      } else {
        fp.printLine("" + -1);
      }
    }
    fs.close();
    fp.close();
  }

  static class GraphNode implements Comparable<GraphNode> {

    int identifier;
    int weight;
    ArrayList<GraphNode> adjacencyList;

    public GraphNode(int identifier, int weight) {
      this.identifier = identifier;
      this.weight = weight;
      this.adjacencyList = new ArrayList<>();
    }

    public int getWeight() {
      return weight;
    }

    public void setWeight(int weight) {
      this.weight = weight;
    }

    public ArrayList<GraphNode> getAdjacencyList() {
      return adjacencyList;
    }

    public void setAdjacencyList(ArrayList<GraphNode> adjacencyList) {
      this.adjacencyList = adjacencyList;
    }

    @Override
    public int compareTo(GraphNode g2) {
      if ((g2.getWeight() - this.getWeight()) == 0) {
        return g2.identifier - this.identifier;
      }
      return g2.getWeight() - this.getWeight();
    }

  }
}

class FastScanner {

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

class FastPrinter {

  private final BufferedWriter bw;

  public FastPrinter() {
    bw = new BufferedWriter(new OutputStreamWriter(System.out));
  }

  public void print(String str) throws IOException {
    bw.append(str);
  }

  public void printLine(String str) throws IOException {
    print(str);
    bw.append("\n");
  }

  public void close() throws IOException {
    bw.close();
  }
}