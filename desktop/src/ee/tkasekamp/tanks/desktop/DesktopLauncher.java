package ee.tkasekamp.tanks.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ee.tkasekamp.tanks.TanksGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "TanksALot";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new TanksGame(), config);
	}
}
