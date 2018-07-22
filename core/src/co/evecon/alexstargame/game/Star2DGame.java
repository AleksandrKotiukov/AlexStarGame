package co.evecon.alexstargame.game;

import com.badlogic.gdx.Game;

import co.evecon.alexstargame.screen.MenuScreen;

/**
 * Main game class
 */

public class Star2DGame extends Game {
    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}
