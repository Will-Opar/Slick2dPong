import java.io.File;

import org.lwjgl.LWJGLUtil;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This  is used to find out which OS is being used
	    System.setProperty("org.lwjgl.librarypath", new File(new File(System.getProperty("user.dir"), "native"), LWJGLUtil.getPlatformName()).getAbsolutePath());
	   try{ 
	    AppGameContainer app = new  AppGameContainer(new Game("Game"));
	    app.setDisplayMode(1050, 750, false);
	    app.setTargetFrameRate(60);
	    app.setShowFPS(false);
	    app.start();
	}catch (SlickException e){
		e.printStackTrace();
	}

	}
}