import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
	public static void main(String[] args) {
		try {
			/**
			 * filewriter object is created to write the streams of data into
			 * the text ile
			 */
			FileWriter fw = new FileWriter("C:\\Users\\bharathi\\Desktop\\Hello\\new.txt");
			// BufferedWriter bf=new BufferedWriter(fw);
			fw.write("My first statement");
			fw.close();
		} catch (IOException ie) {
			System.out.println("cannot write in the file");
		}
	}

}
