import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;



public abstract class Scene implements Comparable<Scene> {
	
	public enum STATE {ON, PAUSE, END};
	public STATE state;
	public int prio;
	
	
	public abstract void render( Graphics g);
	public abstract void update(GameContainer gc, int t);
	public abstract void init();
	
	public  void setState(STATE s){
		state = s;
	}
	public  void setPrio(int i){
		prio = i;
	}
	
	public STATE getState(){
		return state;
	}
	
	
	public int getPrio(){
		return prio;
	}

}
