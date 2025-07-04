package PPkm9uUfOJHHYveeLT;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void lEeR5KfoEr4xU5yHH7(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static float HJFh0TGMpafqLE9haL(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }

        public static EdgeEffect lEeR5KfoEr4xU5yHH7(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float s3fjYDxWOUexjjVgyA(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }
    }

    public static void HJFh0TGMpafqLE9haL(EdgeEffect edgeEffect, float f, float f2) {
        lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(edgeEffect, f, f2);
    }

    public static EdgeEffect lEeR5KfoEr4xU5yHH7(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(context, attributeSet) : new EdgeEffect(context);
    }

    public static float s3fjYDxWOUexjjVgyA(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(edgeEffect);
        }
        return 0.0f;
    }

    public static float zZKhbgvUfsK4AEX3r0(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(edgeEffect, f, f2);
        }
        HJFh0TGMpafqLE9haL(edgeEffect, f, f2);
        return f;
    }
}
