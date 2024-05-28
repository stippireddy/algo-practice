package leetcode;

public class Leetcode50 {
    public double myPowRecursive(double x, int n) {
        if (n == 0) {
            return 1;
        }
        boolean isNegativePower = false;
        long pow = n;
        if (pow < 0) {
            isNegativePower = true;
            pow = -pow;
        }
        double temp = myPow(x, (int) (pow / 2));
        double v = temp * temp;
        if (n % 2 == 1) {
            v = x * v;
        }
        return isNegativePower ? 1 / v : v;
    }

    public double myPow(double x, int n) {
        long pow = n;
        if (pow < 0) {
            pow = -pow;
            x = 1 / x;
        }
        double result = 1;
        while(pow > 0) {
            if((pow & 1) > 0) {
                result *= x;
            }
            x *= x;
            pow = pow >>> 1;
        }
        return result;
    }
}
