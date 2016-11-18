import javax.swing.ImageIcon;

public class PokeyFish extends Fish {
	private ImageIcon leftimage, rightimage;

	public PokeyFish(MovementStyle style) {
		leftimage  = new ImageIcon("./images/Lpokeyfish.gif");
		rightimage = new ImageIcon("./images/Rpokeyfish.gif");
		super.setMovement(style);
	}

	protected ImageIcon leftImage() {
		return leftimage;
	}

	protected ImageIcon rightImage() {
		return rightimage;
	}
}