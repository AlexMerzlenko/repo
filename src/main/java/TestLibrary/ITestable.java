package TestLibrary;

/**
 * Created by Alex on 02/05/2018.
 */
public interface ITestable {
	void LoadSampleDataString(String inputString);
	void RunTest() throws InvalidInputException;
	Object ExposeResults();
	String GetInputDataAsString();
}
