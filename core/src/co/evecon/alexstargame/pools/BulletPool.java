package co.evecon.alexstargame.pools;

import co.evecon.alexstargame.sprite.Bullet;

public class BulletPool extends co.evecon.alexstargame.base.SpritesPool<Bullet> {
    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
