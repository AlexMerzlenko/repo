import TestLibrary.Array1DJumps;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Alex on 02/24/2018.
 */
public class Array1DJumpsTest {
	@Test
	public void evaluateRunTest() {
		Array1DJumps processor = new Array1DJumps();
		
		try {
			processor.LoadSampleDataString("1\n" +
												   "9 4\n" +
												   "0 1 1 0 0 1 1 0 1");
			processor.RunTest();
			assertEquals("YES", processor.ExposeResults());
		}
		catch(Exception ex){
			fail(String.format("Invalid input obtained : [%s]", processor.GetInputDataAsString()));
		}
	}
}
