package TestLibrary;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Alex on 03/07/2018.
 */
public class StackTask extends TestObjectEntry {
	
	ArrayList<Character> stack = new ArrayList<Character>();
	Boolean isBalanced;
	
	@Override
	public void LoadSampleDataString(String inputString) {
		super.LoadSampleDataString(inputString);
	}
	
	@Override
	public void RunTest() throws InvalidInputException {
		int stackPointer = 0;
		isBalanced = true;
		
		for ( char c : GetInputDataAsString().toCharArray() ) {
			if (c == '(' || c == '{' || c == '[') {
				stack.add(stackPointer++, c);
			}
			else
			if ( stackPointer > 0 ) {
				if (c == ')' && stack.get(stackPointer - 1) == '('
					|| c == '}' && stack.get(stackPointer - 1) == '{'
					|| c == ']' && stack.get(stackPointer - 1) == '['
					) {
					stack.remove(--stackPointer);
				}
				else {
					isBalanced = false;
					break;
				}
			}
			else {
				isBalanced = false;
				break;
			}
		}
		
		if (stackPointer > 0)
			isBalanced = false;
	}
	
	@Override
	public Object ExposeResults() {
		return isBalanced;
	}
}
