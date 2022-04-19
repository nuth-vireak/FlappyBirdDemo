package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle(FlappyDemo.TITLE);
		config.setWindowSizeLimits(FlappyDemo.WIDTH, FlappyDemo.HEIGHT, 9999, 9999);
		new Lwjgl3Application(new FlappyDemo(), config);
	}
}
