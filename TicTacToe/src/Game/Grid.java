package Game;

public class Grid {
	static String[][] slots = new String[3][3];
	public void createNew(){
		slots = new String[3][3];
	}
	static String[][] perfectGridX = {{"x","x","x"},
									 {"x","x","x"},
									 {"x","x","x"}};
	static String[][] perfectGridO = {{"o","o","o"},
		 							  {"o","o","o"},
		 							  {"o","o","o"}};
}
