import TestLibrary.StringAnagram;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Alex on 02/19/2018.
 */
public class StringAnagramTest {
	@Test
	public void evaluatesRunTest(){
		StringAnagram processor = new StringAnagram();
		
		try {
			processor.IsAnagram("anagram", "margana");
			processor.RunTest();
			assertEquals("fail", processor.ExposeResults());
		}
		catch(Exception ex){
			fail(String.format("Invalid input obtained : [%s]", processor.GetInputDataAsString()));
		}
	}
}
