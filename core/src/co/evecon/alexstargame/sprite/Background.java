package co.evecon.alexstargame.sprite;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import co.evecon.alexstargame.base.Sprite;
import co.evecon.alexstargame.math.Rect;


public class Background extends Sprite {

    public Background(TextureRegion region) {
        super(region);
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(worldBounds.getHeight());
        pos.set(worldBounds.pos);
    }
}
