import java.io.*;
import java.util.ArrayList;

/**
 * Created by Alex on 03/04/2018.
 */
public abstract class ComparableTestWrapper implements IComparableTesting {
	
	ArrayList<String> inputStringSet;
	ArrayList<String> expectedResultSet;
	
	public void LoadTestInputFile (String inputFileName, String resultsFileName) throws FileNotFoundException{
		FileReader inputFileReader = new FileReader(inputFileName);
		FileReader resultsFileReader = new FileReader(resultsFileName);
		
		BufferedReader inputReader = new BufferedReader(inputFileReader);
		BufferedReader resultsReader = new BufferedReader(resultsFileReader);

		inputStringSet = new ArrayList<String>();
		expectedResultSet = new ArrayList<String>();

		try {
			String dataString = inputReader.readLine();
			
			int numberOfStrings = Integer.valueOf(dataString);
			
			for (int i = 0; i < numberOfStrings; i++) {
				inputStringSet.add(inputReader.readLine());
				if (inputStringSet.get(i) == null)
					break;
				
				expectedResultSet.add(resultsReader.readLine());
				if (expectedResultSet.get(i) == null)
					break;
			}
		}
		catch (FileNotFoundException ex){
			
		}
		catch (IOException ex) {

		}
	}
	
	public void evaluatesRunTest() {
		
	}
}
