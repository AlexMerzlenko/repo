package KeepTesting;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Alex on 02/19/2018.
 */
public class StringAnagram extends TestObject {

	private Map<String, Integer> aString = new TreeMap<String, Integer>();
	private Map<String, Integer> bString = new TreeMap<String, Integer>();
	private String firstString;
	private String secondString;
	private boolean isAnagram;
	
	public void RunTest() {
		firstString = GetInputDataAsString().split("\n")[0];
		secondString = GetInputDataAsString().split("\n")[1];
		
		isAnagram = IsAnagram(firstString, secondString);
	}
	
	public boolean IsAnagram(String a, String b) {
        // Complete the function
        Map<String, Integer> aString = new TreeMap<String, Integer>();
        Map<String, Integer> bString = new TreeMap<String, Integer>();
        
        if (a.length() != b.length()) {
            return false;
        }
        else {
            for (int i = 0; i < a.length(); i++) {
                
                System.out.printf("%s - %s\n", a.substring(i, i + 1), b.substring(i, i + 1));
                
                aString.put( a.substring(i, i + 1).toLowerCase(), ( (aString.get(a.substring(i, i + 1).toLowerCase()) == null) ? (Integer) 1 : aString.get(a.substring(i, i + 1).toLowerCase()) + (Integer) 1 ) );
                bString.put( b.substring(i, i + 1).toLowerCase(), ( (bString.get(b.substring(i, i + 1).toLowerCase()) == null) ? (Integer) 1 : bString.get(b.substring(i, i + 1).toLowerCase()) + (Integer) 1 ) );
            }
        }
        
        if (aString.size() != bString.size()) {
        	return false;
		}
		else {
        	for (String keyChar : aString.keySet() ) {
        		if (aString.get(keyChar) != bString.get(keyChar))
        			return false;
			}
		}
		
        return true;
    }
    
	public Object ExposeResults() {
		String results = "";
//		results += minSubstring + "\n" + maxSubstring;
	
		return results;
	}
}
