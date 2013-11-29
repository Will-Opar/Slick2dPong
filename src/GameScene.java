import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;


public class GameScene extends Scene{

	private Image background;
	private Player p1, p2;
	private Ball ball;
	int x, y;
	
	public GameScene(){
		prio = 2;
		state = STATE.ON;
	}
	
	public void render( Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(background, -30, 0, null);
		if(state == STATE.ON){
		setPrio(1);
		p1.render(g);
		p2.render(g);
		ball.render(g);
		}
		else if (state == STATE.PAUSE){
			
		}
		
		else if(state == STATE.END){
			
		}
	}
	
	public void update(GameContainer gc, int t) {
		// TODO Auto-generated method stub
		p1.update(gc);
		p2.update(ball, p1);
		ball.update(p1, p2);
		
		Input input = gc.getInput();
		
		if(input.isKeyPressed(Input.KEY_ESCAPE)){
			Game.manager.removeSence( "game" );
		}
		
		if(input.isKeyPressed(Input.KEY_P))
		{
			Game.manager.addScene( new CreditScene() );
			
		}
		
	}
	
	public void init() {
		// TODO Auto-generated method stub
		p1 = new Player1();
		p2 = new PlayerPc();
		ball = new Ball();
		try {
			background = new Image("res/Background.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	@Override
	public int compareTo(Scene s) {
		// TODO Auto-generated method stub
		if (getPrio() < s.getPrio())
            return -1;
        else if (getPrio() == s.getPrio())
            return 0;
        else
            return 1;
		
	}
	
	public String toString(){
		return "game";
	}
}
