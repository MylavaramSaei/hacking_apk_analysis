package h6NrAcYSuIyiU1qV6F;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class husNiw3snxdgZPAGJm {
    public static PorterDuffColorFilter HJFh0TGMpafqLE9haL(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static ColorStateList lEeR5KfoEr4xU5yHH7(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(drawable)) {
            return null;
        }
        return s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(drawable).getColorStateList();
    }

    public static void s3fjYDxWOUexjjVgyA(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }
}
