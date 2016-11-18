import javax.swing.ImageIcon;

public class Dolphin extends Fish {
	private ImageIcon leftimage, rightimage;

	public Dolphin(MovementStyle style) {
		leftimage  = new ImageIcon("./images/Ldolphin.gif");
		rightimage = new ImageIcon("./images/Rdolphin.gif");
		super.setMovement(style);
	}

	protected ImageIcon leftImage() {
		return leftimage;
	}

	protected ImageIcon rightImage() {
		return rightimage;
	}
}