import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="c:\\file.txt";
		String line= null;
		try {
			FileReader fileReader =new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine())!= null) {
				System.out.print(line);
			}
			bufferedReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Error file"+fileName+"was not found");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
