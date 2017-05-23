import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class Player {
	public boolean alive = false;
	public String  name;
    private int	score;
    public  int life_cnt;
    private int bombs_cnt;
    private int bombs_onFloor;
    private float speed;
    private int bombs_fire;
    public float px,py;

	public Player(int cnt, float x, float y) {
    	System.out.println("Inserting player n°"+cnt+" !"); 
        this.name="P1";
        this.life_cnt=3;
    	this.alive=true;
        this.bombs_fire=1;
        this.score=0;
        this.bombs_cnt=1;
        this.bombs_onFloor=0;
        this.speed=1;
        this.px = x;
        this.py = y;
        if (cnt == 1){
            StdDraw.setPenColor(Color.RED);        	
        } else {
            StdDraw.setPenColor(Color.BLUE);
        }
        StdDraw.filledCircle(this.px, this.py, 0.35);
    }
	
	public void setName(String name) {
        // TODO implement here
    	this.name=name;
    }

    public String getName() {
        // TODO implement here
    	return this.name;
    }
    
	public void setLife_cnt(int i) {
        // TODO implement here
    	this.life_cnt=i;
    }

    public int getLife_cnt() {
        // TODO implement here
    	return this.life_cnt;
    }
    
    public void setAlive() {
        // TODO implement here
    	if (this.alive){
    		this.alive= false;
    	} else {
    		this.alive= true;
    	}
    }

    public boolean getAlive() {
        // TODO implement here
    	return this.alive;
    }
    
	public void setBombs_fire(int i) {
        // TODO implement here
    	this.bombs_fire=i;
    }

    public int getBombs_fire() {
        // TODO implement here
    	return this.bombs_fire;
    }
    
    public  int getScore() {
    	return this.score;
    }
    
    public void setScore(int i) {
    	this.score=i;
    }
    
    public  int getBombs_cnt() {
    	return this.bombs_cnt;
    }
    
    public void setBombs_cnt(int i) {
    	this.bombs_cnt = i;
    }
    
    public void setBombs_onFloor(int i) {
    	this.bombs_onFloor =  i;
    }
    
    public int getBombs_onFloor (){
    	return this.bombs_onFloor;
    }
    
    public void setSpeed (float i){
    	this.speed=i;
    }
    
    public float getSpeed(){
    	return this.speed;
    }
    
    public void setPosX (float x){
    	this.px=x;
    }
    
    public void setPosY (float x){
    	this.py=x;
    }
    
    public float getPosX(){
    	return this.px;
    }
    
    public float getPosY(){
    	return this.py;
    }
 
}
