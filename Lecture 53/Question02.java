package q11353;
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class FilesDemoSample {
	public static void main(String[] args) {
		Path currentWorkingDirPath = Paths.get("");
		System.out.println("currentWorkingDirPath.toAbsolutePath() : " + currentWorkingDirPath.toAbsolutePath());
		Path path = Paths.get("FilesDemoSample.txt");
		Path pathCopy = Paths.get("FilesDemoSampleCopy.txt");
		Path pathMoved = Paths.get("FilesDemoSampleMoved.txt");
		System.out.println("Files.exists(path) : " + Files.exists(path));
		System.out.println("Files.exists(pathCopy) : " + Files.exists(pathCopy));
		System.out.println("Files.exists(pathMoved) : " + Files.exists(pathMoved));
		String text = "Current time is : " + new Date();
		byte[] contentArr = text.getBytes();
		try {
			Files.write(path, contentArr, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			Files.copy(path, pathCopy, StandardCopyOption.REPLACE_EXISTING);
			Files.move(path, pathMoved, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("After writing, copying and moving");
		System.out.println("path.toAbsolutePath() : " + path.toAbsolutePath());
		System.out.println("Files.exists(path) : " + Files.exists(path));
		System.out.println("pathCopy.toAbsolutePath() : " + pathCopy.toAbsolutePath());
		System.out.println("Files.exists(pathCopy) : " + Files.exists(pathCopy));
		System.out.println("pathMoved.toAbsolutePath() : " + pathMoved.toAbsolutePath());
		System.out.println("Files.exists(pathMoved) : " + Files.exists(pathMoved));
	}
}
