package hackerrank.strings;

import java.util.HashMap;
import java.util.Scanner;

public class DNAHealth {

  // TODO Check if the solution is complete
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] genes = new String[n];
    for (int genes_i = 0; genes_i < n; genes_i++) {
      genes[genes_i] = in.next();
    }
    int[] health = new int[n];
    for (int health_i = 0; health_i < n; health_i++) {
      health[health_i] = in.nextInt();
    }
    int s = in.nextInt();
    int maxHealth = Integer.MIN_VALUE;
    int minHealth = Integer.MAX_VALUE;
    for (int a0 = 0; a0 < s; a0++) {
      int first = in.nextInt();
      int last = in.nextInt();
      String d = in.next();
      // your code goes here
      int currentStringHealth = getHealth(genes, health, d, first, last);
      if (currentStringHealth > maxHealth) {
        maxHealth = currentStringHealth;
      }
      if (currentStringHealth < minHealth) {
        minHealth = currentStringHealth;
      }
    }
    System.out.println(minHealth + " " + maxHealth);
  }

  private static int getHealth(String[] genes, int[] health, String d, int first, int last) {
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = first; i <= last; i++) {
      if (map.containsKey(genes[i])) {
        map.put(genes[i], map.get(genes[i]) + health[i]);
      } else {
        map.put(genes[i], health[i]);
      }
    }
    int totalHealth = 0;
    for (int i = 0; i < d.length(); i++) {
      for (int j = i; j < d.length(); j++) {
        String substring = d.substring(i, j + 1);
        if (map.containsKey(substring)) {
          totalHealth = totalHealth + map.get(substring);
        }
      }
    }
    return totalHealth;
  }
}
