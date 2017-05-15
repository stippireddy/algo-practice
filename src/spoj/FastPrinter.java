package spoj;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FastPrinter {

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
