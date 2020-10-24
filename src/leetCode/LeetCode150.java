package leetCode;

import java.util.ArrayDeque;

/**
 * @author Sarveswara Tippireddy
 * <p>This class contains two methods that give the solution to the LeetCode #150. The solutions
 * do not attempt to cover all the corner cases such as division by zero, integer overflow/underflow
 * etc as it is assumed that the LeetCode OJ explicitly states to assume that the given inputs are
 * valid.
 */
public class LeetCode150 {

  /**
   * @return int which is the evaluated value of the expression formed by the input tokens.
   * <p>This method uses an array to simulate a stack. In doing so it has reduced the accepted
   * time of the solution on LeetCode OJ by more than 50%.
   */
  public int evalRPN(String[] tokens) {
    int[] stack = new int[tokens.length];
    int index = 0;
    for (String token : tokens) {
      switch (token) {
        case "+":
          stack[index - 2] = stack[index - 2] + stack[index - 1];
          index--;
          break;
        case "-":
          stack[index - 2] = stack[index - 2] - stack[index - 1];
          index--;
          break;
        case "*":
          stack[index - 2] = stack[index - 2] * stack[index - 1];
          index--;
          break;
        case "/":
          stack[index - 2] = stack[index - 2] / stack[index - 1];
          index--;
          break;
        default:
          stack[index++] = Integer.parseInt(token);
          break;
      }
    }
    return stack[0];
  }

  /**
   * @return int which is the evaluated value of the expression formed by the input tokens.
   * <p>A typical solution that pushes all the operands on to the stack and pops them to
   * evaluate when an operator is encountered. The result is then pushed on the stack. The final
   * residual element on the stack is the required solution.
   */
  public int evalRPNUsingStack(String[] tokens) {
    ArrayDeque<String> stack = new ArrayDeque<>();
    for (String token : tokens) {
      switch (token) {
        case "+":
          if (stack.size() < 2) {
            throw new UnsupportedOperationException();
          }
          int op2 = Integer.parseInt(stack.pop());
          int op1 = Integer.parseInt(stack.pop());
          stack.push(String.valueOf(op1 + op2));
          break;
        case "-":
          if (stack.size() < 2) {
            throw new UnsupportedOperationException();
          }
          op2 = Integer.parseInt(stack.pop());
          op1 = Integer.parseInt(stack.pop());
          stack.push(String.valueOf(op1 - op2));
          break;
        case "*":
          if (stack.size() < 2) {
            throw new UnsupportedOperationException();
          }
          op2 = Integer.parseInt(stack.pop());
          op1 = Integer.parseInt(stack.pop());
          stack.push(String.valueOf(op1 * op2));
          break;
        case "/":
          if (stack.size() < 2) {
            throw new UnsupportedOperationException();
          }
          op2 = Integer.parseInt(stack.pop());
          op1 = Integer.parseInt(stack.pop());
          stack.push(String.valueOf(op1 / op2));
          break;
        default:
          stack.push(token);
          break;
      }
    }
    return Integer.parseInt(stack.pop());
  }
}
