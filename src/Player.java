import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;


public abstract  class Player {
	
	public static final int HEIGHT = 100;
	public static final int WIDTH = 20; 
	
	protected int x, y;
	protected double speed;
	
	public abstract void render(Graphics g);
	
	public abstract void update(GameContainer gc);
	public abstract void update(Ball b, Player p);
	

}
