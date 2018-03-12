package TestLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Alex on 02/05/2018.
 */
public abstract class TestObjectEntry implements ITestable {
	
	private byte[] inputData;
	
	public void LoadSampleDataString(String inputString){
		
		inputData = inputString.getBytes();
	}
	
	public void RunTest() throws InvalidInputException {}
	
	public Object ExposeResults() {
		return null;
	}
	
	public String GetInputDataAsString(){
		return new String(inputData);
	}
}
