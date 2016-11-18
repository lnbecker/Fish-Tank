import javax.swing.ImageIcon;

public class TropFish extends Fish {
	private ImageIcon leftimage, rightimage;

	public TropFish(MovementStyle style) {
		leftimage  = new ImageIcon("./images/Ltropfish.gif");
		rightimage = new ImageIcon("./images/Rtropfish.gif");
		super.setMovement(style);
	}

	protected ImageIcon leftImage() {
		return leftimage;
	}

	protected ImageIcon rightImage() {
		return rightimage;
	}
}