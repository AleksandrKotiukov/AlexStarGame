package co.evecon.alexstargame.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import co.evecon.alexstargame.base.ActionListener;
import co.evecon.alexstargame.base.ScaledTouchUpButton;
import co.evecon.alexstargame.math.Rect;

public class ButtonPlay extends ScaledTouchUpButton {

    public ButtonPlay(TextureAtlas atlas, ActionListener actionListener, float pressScale) {
        super(atlas.findRegion("btPlay"), actionListener, pressScale);
    }

    @Override
    public void resize(Rect worldBounds) {
        setBottom(worldBounds.getBottom());
        setLeft(worldBounds.getLeft());
    }
}
