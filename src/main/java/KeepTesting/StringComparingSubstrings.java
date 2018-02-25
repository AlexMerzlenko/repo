package KeepTesting;

/**
 * Created by Alex on 02/10/2018.
 */
public class StringComparingSubstrings extends TestObject {
	
	private String sourceString;
	private int substringLength;
	private String minSubstring;
	private String maxSubstring;
		
	public void RunTest() throws InvalidInputException {
		
		sourceString = GetInputDataAsString().split("\n")[0];
		substringLength = Integer.parseInt(GetInputDataAsString().split("\n")[1]);
		
		minSubstring = sourceString.substring(0, substringLength);
		maxSubstring = minSubstring;
		
		int position = 1;
		
		while (position <= sourceString.length() - substringLength) {
			if ( sourceString.substring(position, position + substringLength).compareTo(minSubstring) < 0 )
				minSubstring = sourceString.substring(position, position + substringLength);
			
			if ( sourceString.substring(position, position + substringLength).compareTo(maxSubstring) > 0 )
				maxSubstring = sourceString.substring(position, position + substringLength);
			
			position++;
		}
	}
	
	public Object ExposeResults(){
		String results = "";
		results += minSubstring + "\n" + maxSubstring;
	
		return results;
	}
}
