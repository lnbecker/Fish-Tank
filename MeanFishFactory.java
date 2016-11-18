import java.util.Random;

public class MeanFishFactory extends FishFactory{
	
	public Fish create(){ //each MeanFish has same movement type but different speeds
		Random rand = new Random();
		int randomNum1 = rand.nextInt((50 - 1) + 1) + 1; //random speed between 1 and 50
		int randomNum2 = rand.nextInt((50 - 1) + 1) + 1; //random speed between 1 and 50
		MovementStyle style = new OscillatingMovement(randomNum1, randomNum2);
		return new MeanFish(style);
	}

}