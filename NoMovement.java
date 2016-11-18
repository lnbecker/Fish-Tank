import java.awt.Point;
import java.util.Random;

public class NoMovement implements MovementStyle {

	
	
	public Point getcurrentpos(){
		Random rand = new Random();
		int randomNum1 = rand.nextInt((250 - 1) + 1) + 1; 
		int randomNum2 = rand.nextInt((250 - 1) + 1) + 1; 
		return new Point(randomNum1, randomNum2);
	}
	//int randomNum = rand.nextInt((max - min) + 1) + min;
	public int getxspeed(){
		return 0;
	}
	
	public int getyspeed(){
		return 0;
	}
	
	public int getxDirectionChangeFreq(){
		return 1;
	}
	
	public int getyDirectionChangeFreq(){
		return 0;
	}

}