



public class SharkFactory extends FishFactory {

	
	public Fish create(){ //each AngelFish has same movement type but different speeds
		MovementStyle style = new NoMovement();
		return new Shark(style);
	}

}