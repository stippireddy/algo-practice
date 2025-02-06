package random;

import java.util.Arrays;
import java.util.List;

public class Amazon2 {
    public static long getMinimumOperations(List<Integer> cart) {
        int operations = 0;
        int runningSum = 0;
        for(int i = cart.size() - 1; i >= 0; i--) {
            int num = cart.get(i);
            int modifiedNum = num + runningSum;
            operations += Math.abs(modifiedNum);
            runningSum += (-modifiedNum);
        }
        return operations;
    }

    public static void main(String[] args) {
        System.out.println(getMinimumOperations(Arrays.asList(3,2,0,0,-1,-2)));
    }
}
