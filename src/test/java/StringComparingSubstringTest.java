import KeepTesting.InvalidInputException;
import KeepTesting.StringComparingSubstrings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Alex on 02/11/2018.
 */
public class StringComparingSubstringTest {
	@Test
	public void evaluatesRunTest(){
		StringComparingSubstrings processor = new StringComparingSubstrings();
		
		try {
			processor.LoadSampleDataString("welcometojava\n3");
			processor.RunTest();
			assertEquals("ava\nwel", processor.ExposeResults());
		}
		catch(InvalidInputException ex){
			fail(String.format("Invalid input obtained : [%s]", processor.GetInputDataAsString()));
		}
	}
}
