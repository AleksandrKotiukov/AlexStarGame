package co.evecon.alexstargame.math;


import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

import co.evecon.alexstargame.math.Rect;

/**
 * Utility for matrix working
 */
public class MatrixUtils {

    private MatrixUtils() {
    }

    /**
     * Calculating transformation matrix 4x4
     * @param mat final transformation matrix
     * @param src source rect
     * @param dst finak rect
     */
    public static void calcTransitionMatrix(Matrix4 mat, Rect src, Rect dst) {
        float scaleX = dst.getWidth() / src.getWidth();
        float scaleY = dst.getHeight() / src.getHeight();
        mat.idt().translate(dst.pos.x, dst.pos.y, 0f).scale(scaleX, scaleY, 1f).translate(-src.pos.x, -src.pos.y, 0f);
    }

    /**
     * Calculating transformation matrix 3x3
     * @param mat final transformation matrix
     * @param src source rect
     * @param dst finak rect
     */
    public static void calcTransitionMatrix(Matrix3 mat, Rect src, Rect dst) {
        float scaleX = dst.getWidth() / src.getWidth();
        float scaleY = dst.getHeight() / src.getHeight();
        mat.idt().translate(dst.pos.x, dst.pos.y).scale(scaleX, scaleY).translate(-src.pos.x, -src.pos.y);
    }
}
