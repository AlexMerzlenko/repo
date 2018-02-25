package KeepTesting;

/**
 * Created by Alex on 02/24/2018.
 */
public class Array1DJumps extends TestObject {
	
	public boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int currentPosition = 0;
        boolean reverse = false;
        
        while (currentPosition < game.length) {
            if (canJump(currentPosition, leap, leap, game, false)) {
                currentPosition += leap;
                reverse = false;
            }
            else
            if (!reverse && canJump(currentPosition, 1, leap, game, false)) {
                currentPosition++;
            }
            else {
                if ( (currentPosition - 1) >= 0 && game[currentPosition - 1] == 0) {
                    currentPosition--;
                    reverse = true;
                }
                else break;
            }
            System.out.printf("%d->", currentPosition);
        }
        
        return (currentPosition >= game.length);
    }
    
    
    public boolean canJump(int whereAmI, int attemptedLeap, int leap, int[] game, boolean lookAheadJump){
        if (whereAmI + attemptedLeap >= game.length)
            return true;    // can win
        
        if (game[whereAmI + attemptedLeap] == 0)
            if (!lookAheadJump )
                return	whereAmI == 0 ||
						canJump(whereAmI + attemptedLeap, leap, leap, game, true) ||
                        canJump(whereAmI + attemptedLeap, 1, leap, game, true);
//						canJump(whereAmI + attemptedLeap, -1, leap, game, true);
            else
                return true;
        
        return false;
    }
    
    public void RunTest() {
        String[] input = GetInputDataAsString().split("\n");
        
        int position = 0;
        int q = Integer.parseInt(input[position++]);
        while (q-- > 0) {
        	String[] gameDefinition= input[position++].split(" ");
            int n = Integer.parseInt(gameDefinition[0]);
            int leap = Integer.parseInt(gameDefinition[1]);
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = Integer.parseInt(input[position].split(" ")[i]);
            }
            position++;

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
    }
}
