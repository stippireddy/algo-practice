package generalImplementations;

public class BitHacks {

  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    swap(a, b);
    System.out.println(a + " " + b);
  }

  public static void swap(int a, int b) {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
  }

  public boolean isPowerOfTwo(int n) {
    boolean result;
    result = (n & (n - 1)) == 0;
    //Note that 0 is incorrectly considered a power of 2 in the above line.
    //To remedy this, use:
    result = n == 0 ? false : (n & (n - 1)) == 0;
    return result;
  }

  /**
   * Returns the number of one-bits in the two's complement binary representation of the specified
   * value. This function is sometimes referred to as the population count.
   *
   * @param n the value whose bits are to be counted
   * @return the number of one-bits in the two's complement binary representation of the specified
   * value.
   */
  int findNumberOfSetBits(int n) {
    int count = 1;
    while (n > 0) {
      n &= n - 1;
      count++;
    }
    return count;
  }

  public int setBit(int n, int j) {
    return n | (1 << j);
  }

  public boolean isJthBitSet(int n, int j) {
    return (n & (1 << j)) > 0 ? true : false;
  }

  public int clearBit(int n, int j) {
    return n & ~(1 << j);
  }

  public int toggleBit(int n, int j) {
    return n ^ (1 << j);
  }

  public int lowBit(int n) {
    return n & (-n);
  }

  public int setAll(int n) {
    return (1 << n) - 1;
  }

  public int modulo(int n, int k) {
    return ((n) & (k - 1));
  } // returns n % k, where k is a power of 2

  public int nearestPowerOfTwo(int n) {
    return ((int) Math.pow(2.0, (int) ((Math.log(n) / Math.log(2.0)) + 0.5)));
  }

  public int turnOffLastBit(int n) {
    return ((n) & (n - 1));
  }

  public int turnOnLastZero(int n) {
    return ((n) | (n + 1));
  }

  public int turnOffLastConsecutiveBits(int n) {
    return ((n) & (n + 1));
  }

  public int turnOnLastConsecutiveZeroes(int n) {
    return ((n) | (n - 1));
  }
}
