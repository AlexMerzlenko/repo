import java.io.FileNotFoundException;

/**
 * Created by Alex on 03/04/2018.
 */
public interface IComparableTesting {
	void LoadTestInputFile (String inputFileName, String resultsFileName) throws FileNotFoundException;
	void evaluatesRunTest();
}
