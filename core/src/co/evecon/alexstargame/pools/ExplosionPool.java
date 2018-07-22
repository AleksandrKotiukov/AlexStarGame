package co.evecon.alexstargame.pools;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import co.evecon.alexstargame.base.SpritesPool;
import co.evecon.alexstargame.sprite.Explosion;


public class ExplosionPool extends SpritesPool<Explosion> {

    private Sound sound;
    private TextureRegion textureRegion;

    public ExplosionPool(TextureAtlas atlas, Sound sound) {
        this.textureRegion = atlas.findRegion("explosion");
        this.sound = sound;
    }

    @Override
    protected Explosion newObject() {
        return new Explosion(textureRegion, 9, 9, 74, sound);
    }
}
