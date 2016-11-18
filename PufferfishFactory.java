import java.util.Random;



public class PufferfishFactory extends FishFactory {

	
	public Fish create(){ //each AngelFish has same movement type but different speeds
		Random rand = new Random();
		int randomNum1 = rand.nextInt((6 - 1) + 1) + 1; //random speed between 1 and 6
		MovementStyle style = new VerticalMovement(randomNum1);
		return new Pufferfish(style);
	}

}