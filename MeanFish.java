import javax.swing.ImageIcon;

public class MeanFish extends Fish {
	private ImageIcon leftimage, rightimage;

	public MeanFish(MovementStyle style) {
		leftimage  = new ImageIcon("./images/Lmeaniefish.gif");
		rightimage = new ImageIcon("./images/Rmeaniefish.gif");
		super.setMovement(style);
	}

	protected ImageIcon leftImage() {
		return leftimage;
	}

	protected ImageIcon rightImage() {
		return rightimage;
	}
}
