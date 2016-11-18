import javax.swing.ImageIcon;

public class Shark extends Fish {
	private ImageIcon leftimage, rightimage;

	public Shark(MovementStyle style) {
		leftimage  = new ImageIcon("./images/Lshark.gif");
		rightimage = new ImageIcon("./images/Rshark.gif");
		super.setMovement(style);
	}

	protected ImageIcon leftImage() {
		return leftimage;
	}

	protected ImageIcon rightImage() {
		return rightimage;
	}
}