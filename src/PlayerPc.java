
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;





public class PlayerPc  extends Player{

	public static boolean move = true;





public PlayerPc()
{
	x = 1020;
	y = 0;
	speed = 7;
}

public void render(Graphics g)
{
	g.fillRect(x, y, WIDTH, HEIGHT);
}

public void update(Ball b, Player p)
{
	
	move = b.hit(p, this, move);
	
	if(y + HEIGHT/2 > b.y + Ball.RAIDUS && move){
		y -= speed;
	}
	
	else if(y + HEIGHT/2 < b.y + Ball.RAIDUS &&  move){
		y += speed;
	}
}

@Override
public void update(GameContainer gc) {
	// TODO Auto-generated method stub
	
}




}
