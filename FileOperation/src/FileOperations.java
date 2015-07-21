import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {

		try {
			File test = new File("C:\\Test\\test.txt");
			test.createNewFile();

			System.out.println("Get absolute path " + test.getAbsolutePath());
			System.out.println("Get Canonical path " + test.getCanonicalPath());
			if (test.canWrite()) {
				System.out.println("I can write in the file");
			}

			FileWriter fw = new FileWriter(test.getAbsolutePath());

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("I am writing my first file");
			bw.close();

			FileReader fr = new FileReader(test);
			BufferedReader br = new BufferedReader(fr);

			System.out.println("Reading lines from file " + br.readLine());

			br.close();

			if (test.exists()) {
				System.out.println("This file exists");
			}
			if (test.isDirectory()) {
				System.out.println("This file is a directory");
			}
		} catch (SecurityException | IOException e) {
			e.printStackTrace();

		}
	}

}
