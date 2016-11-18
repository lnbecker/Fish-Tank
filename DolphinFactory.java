import java.util.Random;



public class DolphinFactory extends FishFactory {

	
	public Fish create(){ //each AngelFish has same movement type but different speeds
		Random rand = new Random();
		int randomNum1 = rand.nextInt((20 - 1) + 1) + 1; //random speed between 1 and 20
		MovementStyle style = new HorizontalMovement(randomNum1);
		return new Dolphin(style);
	}

}