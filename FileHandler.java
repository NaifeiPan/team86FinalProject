import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

	ArrayList<String> readFile(String filename) throws FileNotFoundException {
		File input = new File(filename);
		Scanner file = new Scanner(input);
		ArrayList<String> result = new ArrayList<String>();
		
		while(file.hasNext()) {
			String line = file.nextLine();
			result.add(line);
		}
		file.close();
		return result;
		
	}
	
}
