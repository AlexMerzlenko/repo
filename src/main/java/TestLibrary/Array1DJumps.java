package TestLibrary;

/**
 * Created by Alex on 02/24/2018.
 */
public class Array1DJumps extends TestObjectEntry {
	
    public boolean canWin(int leap, int[] game, int position, boolean oneBackward, boolean oneForward, int prevPosition) {
        // Return true if you can win the game; otherwise, return false.

        if (game[position] == 0) {
        
            if (position + leap >= game.length)
                return true;

            if (leap > 1) {
                if (game[position + leap] == 0) {
                    if (canWin(leap, game, position + leap, false, false, position))
                        return true;
                }
            }
                
            if (!oneBackward) {
                if (game[position + 1] == 0) {
                    if (canWin(leap, game, position + 1, false, true, position))
                        return true;
                }
            }
                
            if (!oneForward && position > 0 && position - 1 > prevPosition) {
                if (game[position - 1] == 0) {
                    if (canWin(leap, game, position - 1, true, false, prevPosition))
                        return true;
                }
            }
        }
        return false;
    }
    
    /*
    public void RunTest() {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game, 0, false, false, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
    */
}
