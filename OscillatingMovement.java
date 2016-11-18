import java.awt.Point;
import java.util.Random;

public class OscillatingMovement implements MovementStyle {
	int xspeed;
	int yspeed;
	
	public OscillatingMovement(int xspeed, int yspeed){
		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}
	
	public Point getcurrentpos(){
		Random rand = new Random();
		int randomNum1 = rand.nextInt((250 - 1) + 1) + 1; 
		int randomNum2 = rand.nextInt((250 - 1) + 1) + 1; 
		return new Point(randomNum1, randomNum2);
	}
	//int randomNum = rand.nextInt((max - min) + 1) + min;
	public int getxspeed(){
		return xspeed;
	}
	
	public int getyspeed(){
		return yspeed;
	}
	
	public int getxDirectionChangeFreq(){
		Random rand = new Random();
		int randomNum = rand.nextInt((900 - 750) + 1) + 750; 
		return randomNum; //will change direction 75% - 90% of the time
	}
	
	public int getyDirectionChangeFreq(){
		Random rand = new Random();
		int randomNum = rand.nextInt((900 - 750) + 1) + 750;
		return randomNum; //will change direction 75% - 90% of the time
	}

}