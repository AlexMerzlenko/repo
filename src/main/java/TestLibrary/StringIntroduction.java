package TestLibrary;

/**
 * Created by Alex on 02/06/2018.
 */
public class StringIntroduction extends TestObjectEntry {
	
	private int totalLength;
	private boolean firstGreater;
	private String capitalizedWordsCombined;
	
	public StringIntroduction(){}
	
	@Override
	public void RunTest() throws InvalidInputException {
		String[] words = GetInputDataAsString().split("\n");
		
		if (words.length != 2)
			throw new InvalidInputException();
		
		totalLength = words[0].length() + words[1].length();
		firstGreater = (words[0].compareTo(words[1]) > 0);
		
		capitalizedWordsCombined = "";
		for (int i = 0; i < words.length; i++){
			capitalizedWordsCombined += (capitalizedWordsCombined.length() > 0 ? " " : "") +
										words[i].substring(0, 1).toUpperCase() + words[i].substring(1, words[i].length());
		}
	}
	
	@Override
	public Object ExposeResults(){
		String results = "";
		results += String.valueOf(totalLength) + "\n" + (firstGreater ? "Yes" : "No") + "\n" + capitalizedWordsCombined;
		
		return results;
	}
}
