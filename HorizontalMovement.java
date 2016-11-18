import java.awt.Point;
import java.util.Random;

public class HorizontalMovement implements MovementStyle {
	int xspeed;
	
	public HorizontalMovement(int xspeed){
		this.xspeed = xspeed;
	}
	
	public Point getcurrentpos(){
		Random rand = new Random();
		int randomNum1 = rand.nextInt((300 - 1) + 1) + 1; 
		int randomNum2 = rand.nextInt((300 - 1) + 1) + 1; 
		return new Point(randomNum1, randomNum2);
	}
	//int randomNum = rand.nextInt((max - min) + 1) + min;
	public int getxspeed(){
		return xspeed;
	}
	
	public int getyspeed(){
		return 0; //doesn't move vertically
	}
	
	public int getxDirectionChangeFreq(){
		Random rand = new Random();
		int randomNum = rand.nextInt((100 - 1) + 1) + 1; //random speed between 1 and 100
		return randomNum; //will change direction .01 - 10% of the time
	}
	
	public int getyDirectionChangeFreq(){
		return 0; //will not change y direction because it does not move vertically
	}

}