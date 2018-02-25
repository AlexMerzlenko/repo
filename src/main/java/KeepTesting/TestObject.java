package KeepTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Alex on 02/05/2018.
 */
public abstract class TestObject implements ITestable {
	
	private byte[] inputData;
	
	public void LoadSampleDataString(String inputString){
		
		inputData = inputString.getBytes();
	}
	
	public void LoadSampleDataFile(String inputFileName) {
		
		FileInputStream inputStream;
		
		try {
			inputStream = new FileInputStream(inputFileName);
			
			inputStream.read(inputData);
			inputStream.close();
		}
		catch (FileNotFoundException ex){
			System.out.println("Unable to open file [" + inputFileName + "]");
		}
		catch(IOException ex){
			System.out.println("Unable to read file [" + inputFileName + "]");
		}
	}
	
	public void RunTest() throws InvalidInputException {}
	
	public Object ExposeResults() {
		return null;
	}
	
	public String GetInputDataAsString(){
		return new String(inputData);
	}
}
