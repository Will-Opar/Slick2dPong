import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;


public class TitleScene extends Scene{

	Image title, pointer, start;
	int point;
	
	public TitleScene(){
		setPrio(1);
		point = 450;
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

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
	title.draw(-100,-50);
	pointer.draw(350, point);
	g.drawString("Start Game", 425, 475);
	g.drawString("Credits", 425, 525);
	}

	@Override
	public void update(GameContainer gc, int t) {
		// TODO Auto-generated method stub
		Input input = gc.getInput();
		
		if(input.isKeyPressed(Input.KEY_DOWN)){
			point = 500;
		}
		
		if(input.isKeyPressed(Input.KEY_UP)){
			point = 450;
		}
		
		if(input.isKeyPressed(Input.KEY_ENTER)){
			if(point == 450){
				Game.manager.addScene( new GameScene() );
			}
			
			if(point == 500){
				Game.manager.addScene( new CreditScene() );
			}
		}
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		try {
			title = new Image("res/TitleScreen.png");
			pointer = new Image("res/Pointer.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String toString(){
		return "title";
	}
}
