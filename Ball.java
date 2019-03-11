import javax.swing.JLabel;

public class Ball {

	protected int x;//x pos
	protected int y;//y pos
	protected int r;//radius
	protected int s;//size
	protected int vx;//change in x
	protected int vy;//change in y
	protected JLabel img;
	public Ball() {
		
	}
	
	public void move() {
		x += Math.sqrt(vx^2 + vy^2);
		
		
	}
	
	
	
	
	
	
}
