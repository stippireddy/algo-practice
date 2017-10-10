/**
 * Created by Sarveswara Tippireddy on Oct 09, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/parenthesis-checker/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/implement-stack-using-queue/
 */
package geeksForGeeks.practice.easy;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ParanthesisChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			if (checkParanthesis(sc.next())) {
				System.out.println("balanced");
			} else {
				System.out.println("not balanced");
			}
		}
		sc.close();
	}

	public static boolean checkParanthesis(String s) {
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		for (char c : s.toCharArray()) {
			switch (c) {
			case '}':
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
				break;
			case ')':
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
				break;
			case ']':
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
				break;
			default:
				stack.push(c);
				break;
			}
		}
		return stack.isEmpty() ? true : false;
	}
}
