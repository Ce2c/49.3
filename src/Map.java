import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class Map {

	public final static int X_MAX = 21;
	public final static int Y_MAX = 17;
	public final static int WIDTH = 50;
	
	public final static String [] mapCode = 
		{"WWWWWWWWWWWWWWWWWWWWW",
		 "WCCCFFFFFFFFFFFFFFFFW",
		 "WCWCWFWFWFWFWFWFWFWFW",
		 "WCCFFFFFFFFFFFFFFFFFW",
		 "WFWFWFWFWFWFWFWFWFWFW",
		 "WFFFFFFFFFFFFFFFFFFFW",
		 "WFWFWFWFWFWFWFWFWFWFW",
		 "WFFFFFFFFFFFFFFFFFFFW",
		 "WFWFWFWFWFWFWFWFWFWFW",
		 "WFFFFFFFFFFFFFFFFFFFW",
		 "WFWFWFWFWFWFWFWFWFWFW",
		 "WFFFFFFFFFFFFFFFFFFFW",
		 "WFWFWFWFWFWFWFWFWFWFW",
		 "WFFFFFFFFFFFFFFFFFCCW",
		 "WFWFWFWFWFWFWFWFWCWCW",
		 "WFFFFFFFFFFFFFFFFCCCW",
		 "WWWWWWWWWWWWWWWWWWWWW"};

	//W = Wall ; F = Full ; C = Clean ; P = Player1 ; J = Player2
	
	
	public static String getElementArray(String [] arrayOfStrings, int index) {
	    return arrayOfStrings[index];
	}
	
	public Map (String [] args){
		StdDraw.setCanvasSize(X_MAX*WIDTH, Y_MAX*WIDTH);
		StdDraw.setXscale(0, X_MAX*1.5);
		StdDraw.setYscale(0, Y_MAX*1.5);
		StdDraw.enableDoubleBuffering();
		StdDraw.clear(StdDraw.BLACK);

		for(int i = 0; i < 17; i++) {
			for(int j = 0; j < 21; j++) {
				String text = getElementArray(mapCode,i);
				char a_char = text.charAt(j);
				if (a_char == 'W'){
					StdDraw.setPenColor(Color.GRAY);
					StdDraw.filledSquare(5+j, 7.5+i, 0.5);
				} else if (a_char == 'F'){
					StdDraw.setPenColor(Color.ORANGE);
					StdDraw.filledSquare(5+j, 7.5+i, 0.5);
				} else if (a_char == 'C'){
					StdDraw.setPenColor(Color.GREEN);
					StdDraw.filledSquare(5+j, 7.5+i, 0.5);
				}  else	if (a_char == 'P'){	
				}  else	if (a_char == 'J'){
					StdDraw.setPenColor(Color.BLUE);
					System.out.println((float)  (5+j));
				} else {
					StdDraw.setPenColor(Color.BLACK);
				}

			}

		}
		StdDraw.show();
		//movePlayer test = new movePlayer(player1,player2);
	}
	
	public void getColor(Player player1, Player player2){
	
	}
	
	public void updateScreen(Player player1, Player player2){
		for(int i = 0; i < 17; i++) {
			for(int j = 0; j < 21; j++) {
				String text = getElementArray(mapCode,i);
				char a_char = text.charAt(j);
				if (a_char == 'W'){
					StdDraw.setPenColor(Color.GRAY);
					StdDraw.filledSquare(5+j, 7.5+i, 0.5);
				} else if (a_char == 'F'){
					StdDraw.setPenColor(Color.ORANGE);
					StdDraw.filledSquare(5+j, 7.5+i, 0.5);
				} else if (a_char == 'C'){
					StdDraw.setPenColor(Color.GREEN);
					StdDraw.filledSquare(5+j, 7.5+i, 0.5);
				}  else	if (a_char == 'P'){	
				}  else	if (a_char == 'J'){
					StdDraw.setPenColor(Color.BLUE);
					System.out.println((float)  (5+j));
				} else {
					StdDraw.setPenColor(Color.BLACK);
				}

			}

		}
		StdDraw.setPenColor(Color.RED);  
		StdDraw.filledCircle(player1.getPosX(), player1.getPosY(), 0.35);
		StdDraw.setPenColor(Color.BLUE);  
		StdDraw.filledCircle(player2.getPosX(), player2.getPosY(), 0.35);
	}
}
