package GyWRxpdt1T8mEJXPoD;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: GyWRxpdt1T8mEJXPoD.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static class C0007lEeR5KfoEr4xU5yHH7 {
        public static Interpolator HJFh0TGMpafqLE9haL(Path path) {
            return new PathInterpolator(path);
        }

        public static Interpolator lEeR5KfoEr4xU5yHH7(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        public static Interpolator s3fjYDxWOUexjjVgyA(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }
    }

    public static Interpolator lEeR5KfoEr4xU5yHH7(float f, float f2, float f3, float f4) {
        return C0007lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(f, f2, f3, f4);
    }

    public static Interpolator s3fjYDxWOUexjjVgyA(Path path) {
        return C0007lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(path);
    }
}
