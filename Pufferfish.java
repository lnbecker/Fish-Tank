import javax.swing.ImageIcon;

public class Pufferfish extends Fish {
	private ImageIcon leftimage, rightimage;

	public Pufferfish(MovementStyle style) {
		leftimage  = new ImageIcon("./images/Lpufferfish.gif");
		rightimage = new ImageIcon("./images/Rpufferfish.gif");
		super.setMovement(style);
	}

	protected ImageIcon leftImage() {
		return leftimage;
	}

	protected ImageIcon rightImage() {
		return rightimage;
	}
}