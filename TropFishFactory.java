import java.util.Random;



public class TropFishFactory extends FishFactory {

	
	public Fish create(){ //each AngelFish has same movement type but different speeds
		Random rand = new Random();
		int randomNum1 = rand.nextInt((20 - 1) + 1) + 1; //random speed between 1 and 20
		int randomNum2 = rand.nextInt((10 - 1) + 1) + 1; //random speed between 1 and 20
		MovementStyle style = new UpDownMovement(randomNum1, randomNum2);
		return new TropFish(style);
	}

}