import org.newdawn.slick.Graphics;


public class Ball {
	
	int x, y;
	int dX,dY;
	
	public static final int RAIDUS = 15;
	
	
	public Ball()
	{
		x = 525;
		y = 375;
		dX = 5;
		dY = 5;
		
	}
	
	public void render(Graphics g)
	{
		g.fillOval(x, y, RAIDUS*2, RAIDUS*2);
		
	}
	
	public void update(Player p1, Player p2)
	{
		x += dX;
		y += dY;
		
		if(y == 720 || y==0)
		{
			dY *= -1;
		}
		
		if(x >= 1050 || x <= 0 )
		{
			x = 525;
			y = 375;
			dX = 5;
			PlayerPc.move = true;
		}
		
		if(collision(p1) || collision(p2))
		{
			dX *= -1.2;
		}
		
	}
	
	private boolean collision(Player p)
	{
		int cX, cY;
		double cSq;
		cX = abs(x + RAIDUS - (p.x + Player.WIDTH/2));
	    cY = abs(y  + RAIDUS -( p.y + Player.HEIGHT/2));

	    if (cX > (Player.WIDTH/2 + RAIDUS)) { return false; }
	    if (cY > (Player.HEIGHT/2 + RAIDUS)) { return false; }

	    if (cX <= (Player.WIDTH/2)) { return true; } 
	    if (cY <= (Player.HEIGHT/2)) { return true; }

	    cSq = (cX - Player.WIDTH/2)^2 +
	                         (cY - Player.HEIGHT/2)^2;

	    return (cSq <= (RAIDUS^2));
	}

	private int abs(int i) {
		// TODO Auto-generated method stub
		if(i < 0)
		{
			i *= -1;
		}
		return i;
	}
	
	public boolean hit(Player p1, Player p2, boolean move)
	{
		if(collision(p1)){
			move = true;
		}
		
		if(collision(p2)){
			move = false;
		}
		
		return move;	
	
	}
}
