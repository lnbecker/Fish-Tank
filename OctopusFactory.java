import java.util.Random;

public class OctopusFactory extends FishFactory{
	
	
	public Fish create(){ //each octopus has same movementType but different speed
		Random rand = new Random();
		int randomNum = rand.nextInt((15 - 1) + 1) + 1; //random speed between 1 and 15
		MovementStyle style = new HorizontalMovement(randomNum);
		return new Octopus(style);
	}

}