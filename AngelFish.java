import javax.swing.ImageIcon;

public class AngelFish extends Fish {
	private ImageIcon leftimage, rightimage;

	public AngelFish(MovementStyle style) {
		leftimage  = new ImageIcon("./images/Langelfish.gif");
		rightimage = new ImageIcon("./images/Rangelfish.gif");
		super.setMovement(style);
	}
	

	protected ImageIcon leftImage() {
		return leftimage;
	}

	protected ImageIcon rightImage() {
		return rightimage;
	}
}
