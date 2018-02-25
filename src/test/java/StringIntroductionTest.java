import KeepTesting.InvalidInputException;
import KeepTesting.StringIntroduction;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Alex on 02/06/2018.
 */
public class StringIntroductionTest {
	@Test
	public void evaluatesRunTest(){
		StringIntroduction processor = new StringIntroduction();
		
		try {
			processor.LoadSampleDataString("hello\njava");
			processor.RunTest();
			assertEquals("9\nNo\nHello Java", processor.ExposeResults());
		}
		catch(InvalidInputException ex){
			fail(String.format("Invalid input obtained : [%s]", processor.GetInputDataAsString()));
		}
	}
}
