package co.evecon.alexstargame.base;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import co.evecon.alexstargame.base.ActionListener;
import co.evecon.alexstargame.base.Sprite;

public class ScaledTouchUpButton extends Sprite {

    private int pointer; //Finger number which is used
    private boolean pressed;
    private float pressScale;
    private ActionListener actionListener;

    public ScaledTouchUpButton(TextureRegion region, ActionListener actionListener, float pressScale) {
        super(region);
        this.pressScale = pressScale;
        this.actionListener = actionListener;
        this.pressed = false;
    }

    @Override
    public void touchDown(Vector2 touch, int pointer) {
       if (pressed || !isMe(touch)) {
           return;
       }
       this.pointer = pointer;
       this.scale = pressScale;
       this.pressed = true;
    }

    @Override
    public void touchUp(Vector2 touch, int pointer) {
        if (this.pointer != pointer || !pressed) {
            return;
        }
        if (isMe(touch)) {
            actionListener.actionPerformed(this);
            return;
        }
        this.pressed = false;
        this.scale = 1f;
    }
}
