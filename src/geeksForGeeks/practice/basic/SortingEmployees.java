/**
 * Created by Sarveswara Tippireddy on Jul 20, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/sorting-employees/0
 */
package geeksForGeeks.practice.basic;

import java.util.Arrays;
import java.util.Scanner;

public class SortingEmployees {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      Employee[] input = new Employee[k];
      for (int i = 0; i < k; i++) {
        input[i] = new Employee(sc.next(), sc.nextInt());
      }
      Arrays.sort(input);
      StringBuffer sb = new StringBuffer();
      for (Employee employee : input) {
        sb.append(employee.name).append(" ").append(employee.salary).append(" ");
      }
      System.out.println(sb.substring(0, sb.length() - 1));
    }
    sc.close();
  }

  static class Employee implements Comparable<Employee> {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
      this.salary = salary;
      this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
      if (this.salary == o.salary) {
        return this.name.compareTo(o.name);
      } else {
        return salary - o.salary;
      }
    }
  }
}
