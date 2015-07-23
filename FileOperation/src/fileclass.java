import java.io.File;
import java.io.IOException;

public class fileclass {
	public static void main(String[] args) {

		try {
			/**
			 * A new folder named "Hello" is created in the given path
			 */
			File folder = new File("C:\\Users\\bharathi\\Desktop\\Hello");
			folder.mkdir();

			if (folder.exists()) {
				System.out.println(folder.getName() + " named file  exist");
			}

			if (folder.isDirectory()) {
				System.out.println(folder.getName() + " is a folder");
			}
			System.out.println("Absolute folder path is  " + folder.getAbsolutePath());
			System.out.println("Canonical folder path is  " + folder.getCanonicalPath());

			File f = new File("C:\\Users\\bharathi\\Desktop\\Hello\\new.txt");
			f.createNewFile();
			System.out.println("Absolute file path is  " + f.getAbsolutePath());
			System.out.println("Canonical file path is  " + f.getCanonicalPath());

		} catch (IOException e) {
			System.out.println("File cannot be created");
		} catch (SecurityException e) {
			System.out.println("Folder cannot be created");
		}

	}
}
