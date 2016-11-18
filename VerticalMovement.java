import java.awt.Point;
import java.util.Random;

public class VerticalMovement implements MovementStyle {
	int yspeed;
	
	public VerticalMovement(int yspeed){
		this.yspeed = yspeed;
	}
	
	public Point getcurrentpos(){
		Random rand = new Random();
		int randomNum1 = rand.nextInt((300 - 1) + 1) + 1; 
		int randomNum2 = rand.nextInt((300 - 1) + 1) + 1; 
		return new Point(randomNum1, randomNum2);
	}
	//int randomNum = rand.nextInt((max - min) + 1) + min;
	public int getxspeed(){
		return 0; //doesn't move horizontally
	}
	
	public int getyspeed(){
		return yspeed; //doesn't move vertically
	}
	
	public int getyDirectionChangeFreq(){
		Random rand = new Random();
		int randomNum = rand.nextInt((50 - 1) + 1) + 1; //random speed between 1 and 100
		return randomNum; //will change direction .01 - 5% of the time
	}
	
	public int getxDirectionChangeFreq(){
		return 0; //will not change x direction because it does not move horizontally
	}

}