import java.io.File;
import java.io.IOException;

public class ThrowsForFileHandling {

	public void fileOperation() throws IOException {

		File file = new File("C://Users//poonam//test.txt");
		file.createNewFile();

	}

	public static void main(String[] args) {
		ThrowsForFileHandling obj = new ThrowsForFileHandling();

		try {
			obj.fileOperation();
		} catch (IOException ie) {
			System.out.println("Handing Exception " + ie);
		}

	}

}
