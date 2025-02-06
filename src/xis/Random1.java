package xis;

public class Random1 {
    public static int multiply(int start, int days) {
        while (days-- > 0) {
            start = (int) (start + (0.04 * start));
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(multiply(110, 40));
    }
}
