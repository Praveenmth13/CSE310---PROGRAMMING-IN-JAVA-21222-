package q11355;
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class ReaderWriterDemo {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("This text was written at 1 time\n");
		for (int i = 2; i <= 10; i++) {
			sb.append("This text was written at " + i + " times\n");
		}
		Reader reader = new StringReader(sb.toString());
		String outputFileName = "CharStreamsDemo.txt";
		try (FileWriter fw = new FileWriter(outputFileName)) {
			char[] charsArr = new char[512];
			int charsRead = 0;
			while ((charsRead = reader.read(charsArr)) != -1) {
				fw.write(charsArr, 0, charsRead);
			}
		}
		Path outputFilePath = Paths.get(outputFileName);
		byte[] contentArr = Files.readAllBytes(outputFilePath);
		System.out.println(new String(contentArr));
	}
}
