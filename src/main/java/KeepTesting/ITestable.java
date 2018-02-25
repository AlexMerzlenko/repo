package KeepTesting;

/**
 * Created by Alex on 02/05/2018.
 */
public interface ITestable {
	void LoadSampleDataString(String inputString);
	void LoadSampleDataFile(String inputFileName);
	void RunTest() throws InvalidInputException;
	Object ExposeResults();
	String GetInputDataAsString();
}
