import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;


public class Player1 extends Player {
		
	
	
	
	
	public Player1()
	{
		x = 30;
		y = 0;
		speed = 7;
	}
	
	public void render(Graphics g)
	{
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
	
	public void update(GameContainer gc)
	{
		Input input = gc.getInput();
		
		if(input.isKeyDown(Input.KEY_DOWN) && y <= 650)
		{
			y += speed;
		}
		
		if(input.isKeyDown(Input.KEY_UP) && y >= 0)
		{
			
				y -= speed;
		}
	}

	

	@Override
	public void update(Ball b, Player p) {
		// TODO Auto-generated method stub
		
	}
}
