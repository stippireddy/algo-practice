package hackerrank.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class WeightedUniformString {

	public static HashSet<Integer> getSubstringWeightSet(String s) {
		HashSet<Integer> hs = new HashSet<>();
		int start = 0;
		int end = 1;
		char prevChar = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == prevChar) {
				end++;
			} else {
				System.out.println("Start : " + start + " ; End : " + end + " ; Character : " + s.charAt(start));
				calculateAndAddWeight(s, hs, start, end);
				start = end;
				prevChar = s.charAt(start);
				end++;
			}
		}
		calculateAndAddWeight(s, hs, start, end);
		return hs;
	}

	private static void calculateAndAddWeight(String s, HashSet<Integer> hs, int start, int end) {
		if ((end - start) > 1) {
			int count = end - start;
			for (int i = 1; i <= count; i++) {
				hs.add((s.charAt(start) - 'a' + 1) * i);
			}
		} else {
			hs.add(s.charAt(start) - 'a' + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		HashSet<Integer> hs = getSubstringWeightSet(input);
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			int i = Integer.parseInt(br.readLine());
			if (hs.contains(i)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}

/*
 * import java.io.OutputStream; import java.io.IOException; import
 * java.io.InputStream; import java.io.OutputStream; import java.io.PrintWriter;
 * import java.io.BufferedWriter; import java.util.InputMismatchException;
 * import java.io.IOException; import java.io.Writer; import
 * java.io.OutputStreamWriter; import java.io.InputStream;
 * 
 * /** Built using CHelper plug-in Actual solution is at the top
 *
 * @author Egor Kulikov (egor@egork.net)
 *
 * public class Solution { public static void main(String[] args) { InputStream
 * inputStream = System.in; OutputStream outputStream = System.out; InputReader
 * in = new InputReader(inputStream); OutputWriter out = new
 * OutputWriter(outputStream); WeightedUniformStrings solver = new
 * WeightedUniformStrings(); solver.solve(1, in, out); out.close(); }
 * 
 * static class WeightedUniformStrings { public void solve(int testNumber,
 * InputReader in, OutputWriter out) { String s = in.readString(); int[] max =
 * new int[27]; int start = 0; for (int i = 0; i < s.length(); i++) { if
 * (s.charAt(i) != s.charAt(start)) { max[s.charAt(start) - 'a' + 1] =
 * Math.max(max[s.charAt(start) - 'a' + 1], i - start); start = i; } }
 * max[s.charAt(start) - 'a' + 1] = Math.max(max[s.charAt(start) - 'a' + 1],
 * s.length() - start); int n = in.readInt(); int[] x = IOUtils.readIntArray(in,
 * n); for (int i : x) { boolean found = false; for (int j = 1; j <= 26; j++) {
 * if (i % j == 0 && i / j <= max[j]) { found = true; break; } }
 * out.printLine(found ? "Yes" : "No"); } }
 * 
 * }
 * 
 * static class InputReader { private InputStream stream; private byte[] buf =
 * new byte[1024]; private int curChar; private int numChars; private
 * InputReader.SpaceCharFilter filter;
 * 
 * public InputReader(InputStream stream) { this.stream = stream; }
 * 
 * public int read() { if (numChars == -1) { throw new InputMismatchException();
 * } if (curChar >= numChars) { curChar = 0; try { numChars = stream.read(buf);
 * } catch (IOException e) { throw new InputMismatchException(); } if (numChars
 * <= 0) { return -1; } } return buf[curChar++]; }
 * 
 * public int readInt() { int c = read(); while (isSpaceChar(c)) { c = read(); }
 * int sgn = 1; if (c == '-') { sgn = -1; c = read(); } int res = 0; do { if (c
 * < '0' || c > '9') { throw new InputMismatchException(); } res *= 10; res += c
 * - '0'; c = read(); } while (!isSpaceChar(c)); return res * sgn; }
 * 
 * public String readString() { int c = read(); while (isSpaceChar(c)) { c =
 * read(); } StringBuilder res = new StringBuilder(); do { if
 * (Character.isValidCodePoint(c)) { res.appendCodePoint(c); } c = read(); }
 * while (!isSpaceChar(c)); return res.toString(); }
 * 
 * public boolean isSpaceChar(int c) { if (filter != null) { return
 * filter.isSpaceChar(c); } return isWhitespace(c); }
 * 
 * public static boolean isWhitespace(int c) { return c == ' ' || c == '\n' || c
 * == '\r' || c == '\t' || c == -1; }
 * 
 * public interface SpaceCharFilter { public boolean isSpaceChar(int ch);
 * 
 * }
 * 
 * }
 * 
 * static class OutputWriter { private final PrintWriter writer;
 * 
 * public OutputWriter(OutputStream outputStream) { writer = new PrintWriter(new
 * BufferedWriter(new OutputStreamWriter(outputStream))); }
 * 
 * public OutputWriter(Writer writer) { this.writer = new PrintWriter(writer); }
 * 
 * public void print(Object... objects) { for (int i = 0; i < objects.length;
 * i++) { if (i != 0) { writer.print(' '); } writer.print(objects[i]); } }
 * 
 * public void printLine(Object... objects) { print(objects); writer.println();
 * }
 * 
 * public void close() { writer.close(); }
 * 
 * }
 * 
 * static class IOUtils { public static int[] readIntArray(InputReader in, int
 * size) { int[] array = new int[size]; for (int i = 0; i < size; i++) {
 * array[i] = in.readInt(); } return array; }
 * 
 * } }
 * 
 */
