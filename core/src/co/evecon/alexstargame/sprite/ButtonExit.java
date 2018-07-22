package co.evecon.alexstargame.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;


import co.evecon.alexstargame.base.ActionListener;
import co.evecon.alexstargame.base.ScaledTouchUpButton;
import co.evecon.alexstargame.math.Rect;

public class ButtonExit extends ScaledTouchUpButton {

    public ButtonExit(TextureAtlas atlas, ActionListener actionListener, float pressScale) {
        super(atlas.findRegion("btExit"), actionListener, pressScale);
    }

    @Override
    public void resize(Rect worldBounds) {
        setBottom(worldBounds.getBottom());
        setRight(worldBounds.getRight());
    }
}
