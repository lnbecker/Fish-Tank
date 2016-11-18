import java.awt.Point;


public interface MovementStyle {
	public Point getcurrentpos();
	public int getxspeed();
	public int getyspeed();
	public int getxDirectionChangeFreq();
	public int getyDirectionChangeFreq();
}
