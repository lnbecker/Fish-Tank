import javax.swing.ImageIcon;

public class Octopus extends Fish {
	private ImageIcon leftimage, rightimage;

	public Octopus(MovementStyle style) {
		leftimage  = new ImageIcon("./images/Loctopus.gif");
		rightimage = new ImageIcon("./images/Roctopus.gif");
		super.setMovement(style);
	}

	protected ImageIcon leftImage() {
		return leftimage;
	}

	protected ImageIcon rightImage() {
		return rightimage;
	}
}

