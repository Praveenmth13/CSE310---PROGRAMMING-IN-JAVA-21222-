package q11354;
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class ByteStreamsDemo {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("This text was written at 1 time\n");
		for (int i = 2; i <= 10; i++) {
			sb.append("This text was written at " + i + " times\n");
		}
		InputStream bais = new ByteArrayInputStream(sb.toString().getBytes());
		OutputStream fos = null;
		String outputFileName = "ByteStreamsDemo.txt";
		try {
			fos = new FileOutputStream(outputFileName);
			byte[] byteArr = new byte[512];
			int bytesRead = 0;
			while ((bytesRead = bais.read(byteArr)) != -1) {
				fos.write(byteArr, 0, bytesRead);
			}
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
		Path outputFilePath = Paths.get(outputFileName);
		byte[] contentArr = Files.readAllBytes(outputFilePath);
		System.out.println(new String(contentArr));
	}
}
