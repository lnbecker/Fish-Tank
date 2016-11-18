

public abstract class FishFactory {
	
	
	public static FishFactory getFactory(String fishtype){
		if (fishtype.equals("Angel Fish"))
			return new AngelFishFactory();
		else if (fishtype.equals("Octopus"))
			return new OctopusFactory();
		else if (fishtype.equals("Mean Fish"))
			return new MeanFishFactory();
		else if (fishtype.equals("Pokey Fish"))
			return new PokeyFishFactory();
		else if(fishtype.equals("Shark"))
			return new SharkFactory();
		else if(fishtype.equals("Yellow Fish"))
			return new YellowFishFactory();
		else if(fishtype.equals("Dolphin"))
				return new DolphinFactory();
		else if(fishtype.equals("Tropical Fish"))
			return new TropFishFactory();
		else if(fishtype.equals("Pufferfish"))
			return new PufferfishFactory();
		else
			return null;
	}
	
	public abstract Fish create();
	
	
}