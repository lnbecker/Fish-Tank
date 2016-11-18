import javax.swing.ImageIcon;

public class YellowFish extends Fish {
	private ImageIcon leftimage, rightimage;

	public YellowFish(MovementStyle style) {
		leftimage  = new ImageIcon("./images/Lyellowfish.gif");
		rightimage = new ImageIcon("./images/Ryellowfish.gif");
		super.setMovement(style);
	}

	protected ImageIcon leftImage() {
		return leftimage;
	}

	protected ImageIcon rightImage() {
		return rightimage;
	}
}