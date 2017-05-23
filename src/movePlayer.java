import edu.princeton.cs.introcs.StdDraw;


public class movePlayer {
	
	
	public movePlayer(Map map, Player player1, Player player2) {
			if (StdDraw.isKeyPressed(37)){
				map.getColor(player1.getPosX(),player1.getPosY());
				if (checkCollision("l",player1.getPosX(),player1.getPosY())){
					System.out.println("passage à une autree case");
				} else {
					player1.setPosX((float) (player1.getPosX()-0.1));
				}
				
			} 
			if (StdDraw.isKeyPressed(38)){
				if (checkCollision("b",player1.getPosX(),player1.getPosY())){
					System.out.println("passage à une autree case");
					
				} else {
					player1.setPosY((float) (player1.getPosY()+0.1));
				}
			}
			if (StdDraw.isKeyPressed(39)){
				if (checkCollision("r",player1.getPosX(),player1.getPosY())){
					System.out.println("passage à une autree case");
					
				} else {
					player1.setPosX((float) (player1.getPosX()+0.1));
				}
			}
			if (StdDraw.isKeyPressed(40)){
				if (checkCollision("t",player1.getPosX(),player1.getPosY())){
					System.out.println("passage à une autree case");
					
				} else {
					player1.setPosY((float) (player1.getPosY()-0.1));
				}
			}
			if (StdDraw.isKeyPressed(81)){
				player2.setPosX((float) (player2.getPosX()-0.1));
			} 
			if (StdDraw.isKeyPressed(90)){
				player2.setPosY((float) (player2.getPosY()+0.1));
			}
			if (StdDraw.isKeyPressed(68)){
				player2.setPosX((float) (player2.getPosX()+0.1));
			}
			if (StdDraw.isKeyPressed(83)){
				player2.setPosY((float) (player2.getPosY()-0.1));
			}
			StdDraw.show();
	}
	
	public boolean checkCollision(String side, float px, float py) {
		if (side == "r"){
			
		} else {
			if (side == "l"){
				float newX = (float) (px-0.1);
				float cnt = (float) (Math.floor(px));
				if (newX < cnt){
					return true;
				}

			} else {
				if (side =="b"){
					float newY = (float) (py+0.75);
					if (newY > (Math.ceil(py))){
						return true;
					}
				} else {
					if (side =="t"){
						float newY = (float) (py-0.75);
						if (newY < (Math.ceil(py))){
							return true;
						}
					} else {
						if (side =="r"){
							float newX = (float) (px+0.1);
							float cnt = (float) (Math.floor(px));
							if (newX > cnt){
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
}