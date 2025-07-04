package IPyIQcaNa8aB7drBED;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class VItLRw50eXTZeEfGl0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final int[] f594lEeR5KfoEr4xU5yHH7 = {R.attr.state_checked};

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final int[] f595s3fjYDxWOUexjjVgyA = new int[0];

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Rect f593HJFh0TGMpafqLE9haL = new Rect();

    public static void HJFh0TGMpafqLE9haL(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f594lEeR5KfoEr4xU5yHH7);
        } else {
            drawable.setState(f595s3fjYDxWOUexjjVgyA);
        }
        drawable.setState(state);
    }

    public static boolean lEeR5KfoEr4xU5yHH7(Drawable drawable) {
        return true;
    }

    public static void s3fjYDxWOUexjjVgyA(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        HJFh0TGMpafqLE9haL(drawable);
    }

    public static PorterDuff.Mode zZKhbgvUfsK4AEX3r0(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
