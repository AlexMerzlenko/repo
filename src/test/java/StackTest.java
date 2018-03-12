import TestLibrary.StackTask;
import TestLibrary.StringAnagram;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Alex on 03/07/2018.
 */
public class StackTest extends ComparableTestWrapper {
	@Test
	public void evaluateRunTest() {
		try {
			LoadTestInputFile("E:\\Projects\\Java\\hackerrank\\src\\main\\resources\\StackInput.dat",
							"E:\\Projects\\Java\\hackerrank\\src\\main\\resources\\StackResults.dat");
			
			StackTask processor = new StackTask();
			
			for (int i = 0; i < inputStringSet.size(); i++ ) {
				try {
					processor.LoadSampleDataString(inputStringSet.get(i));
					processor.RunTest();
					assertEquals(expectedResultSet.get(i), processor.ExposeResults().toString());
				} catch (Exception ex) {
					fail(String.format("Invalid input obtained : [ %s ]", processor.GetInputDataAsString()));
				}
			}
		}
		catch (Exception ex) {
			System.out.printf(ex.getMessage());
		}
	}
}
