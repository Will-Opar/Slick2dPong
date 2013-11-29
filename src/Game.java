import org.newdawn.slick.*;
//import org.newdawn.slick.openal.Audio;
//import org.newdawn.slick.openal.AudioLoader;


public class Game  extends BasicGame {

	static SceneMan manager;
	//private Audio audio;
	
	public Game(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		manager.render(gc, g);
	}
	
	
	@Override
	public void update(GameContainer gc, int t) throws SlickException {
		// TODO Auto-generated method stub
		manager.update(gc, t);
	}
	
	@Override
	public void init(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		manager = new SceneMan(gc);
		manager.addScene(new TitleScene());
		//audio = AudioLoader.getAudio(title, null)
	}

	

	

}
