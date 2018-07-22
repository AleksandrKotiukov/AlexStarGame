package co.evecon.alexstargame.pools;

import com.badlogic.gdx.audio.Sound;

import co.evecon.alexstargame.base.SpritesPool;
import co.evecon.alexstargame.math.Rect;
import co.evecon.alexstargame.sprite.Enemy;
import co.evecon.alexstargame.sprite.MainShip;


public class EnemyPool extends SpritesPool<Enemy> {

    private BulletPool bulletPool;
    private ExplosionPool explosionPool;
    private Rect worldBounds;
    private MainShip mainShip;
    private Sound sound;

    public EnemyPool(BulletPool bulletPool, Rect worldBounds, ExplosionPool explosionPool, MainShip mainShip, Sound sound) {
        this.bulletPool = bulletPool;
        this.worldBounds = worldBounds;
        this.explosionPool = explosionPool;
        this.mainShip = mainShip;
        this.sound = sound;
    }

    @Override
    protected Enemy newObject() {
        return new Enemy(bulletPool, worldBounds, explosionPool, mainShip, sound);
    }
}
