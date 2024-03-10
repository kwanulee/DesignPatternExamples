package decorator.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;

		try {
			InputStream in = 
				new LowerCaseInputStream(
					new BufferedInputStream(
                            Files.newInputStream(Paths.get("files/test.txt"))));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
