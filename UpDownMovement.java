import java.awt.Point;
import java.util.Random;

public class UpDownMovement implements MovementStyle {
	int xspeed;
	int yspeed;
	
	public UpDownMovement(int xspeed, int yspeed){
		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}
	
	public Point getcurrentpos(){
		Random rand = new Random();
		int randomNum1 = rand.nextInt((300 - 1) + 1) + 1; 
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
		int randomNum = rand.nextInt((100 - 10) + 1) + 10; 
		return randomNum; //will change direction 1% - 10% of the time
	}
	
	public int getyDirectionChangeFreq(){
		Random rand = new Random();
		int randomNum = rand.nextInt((120 - 10) + 1) + 10; 
		return randomNum; //will change direction 1% - 12% of the time
	}

}