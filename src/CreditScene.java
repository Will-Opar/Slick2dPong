import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;


public class CreditScene extends Scene{

	public CreditScene() {
		prio = 3;
	}
	
	Image credit;
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

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		credit.draw(-100, 0);
		
	}

	@Override
	public void update(GameContainer gc, int t) {
		// TODO Auto-generated method stub
		Input input = gc.getInput();
		
		if(input.isKeyPressed(Input.KEY_ESCAPE)){
			Game.manager.removeSence( "credits" );
		}
		if(input.isKeyPressed(Input.KEY_C)){
			Game.manager.removeSence( "credits" );
			
		}
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		try {
			credit = new Image("res/credits.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String toString(){
		return "credits";
	}

}
