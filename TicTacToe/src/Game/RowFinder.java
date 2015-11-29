package Game;

public class RowFinder {
	private static boolean findBlanks(Grid b, int row){
		for(int i = 0; i < 3; i++){
			if(b.slots[row][i].equals(" ")){
				return true;
			}
		}
		return false;
	}
	
	public boolean searchForThreeHorizontal(Grid b){
		for(int i = 0; i < 3; i++){
			for(String[] x: b.slots){
				if(x == b.perfectGridO[i] || x == b.perfectGridX[i]){
					return true;
				}
			}			
		}
		
		return false;
	}
	/*x, o, x     	x x x		0,0 -> 0,2
	 *x, o, o		x o o 		2,2 -> 2,1
	 *x, x, o		o o x		0,1 -> 1,2
	 */
	public static String[][] turnClockWise(String[][] b){
		String[][] turnedArray = new String[3][3];
		for(int i = 0; i < 3; i++){
			for(int a = 0; a < 3; a++){
				turnedArray[a][i] = b[i][a];
			}
		}
		return turnedArray;
	}
	
	public boolean searchForThreeVertical(Grid b){
		String[][] temp = turnClockWise(b.slots);
		for(int i = 0; i < 3; i++){
			for(String[] x: b.slots){
				if(x == b.perfectGridO[i] || x == b.perfectGridX[i]){
					return true;
				}
			}			
		}
		return false;
	}
	
	public boolean searchForThreeDiagnal(Grid b){
		if(b.slots[0][0] == b.slots[1][1] && b.slots[1][1] == b.slots[2][2]){
			return true;
		}
		if(b.slots[0][2] == b.slots[1][1] && b.slots[1][1] == b.slots[2][0]){
			return true;
		}
		return false;
	}
}
