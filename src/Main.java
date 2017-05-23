public class Main {

	public static void main(String[] args) throws InterruptedException {
		// Init map
		Map map = new Map(args); 
		// Init player 1 & 2
		Player player1 = new Player(1,6,(float) 8.5);
		Player player2 = new Player(2, 24,(float) 22.5);
		
		while (player1.alive || player2.alive){
			map.updateScreen(player1, player2);
			new movePlayer(player1, player2);
			Thread.sleep(20);
		}
	}

}
