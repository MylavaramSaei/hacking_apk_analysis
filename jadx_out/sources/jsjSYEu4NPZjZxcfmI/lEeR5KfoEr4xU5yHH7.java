package jsjSYEu4NPZjZxcfmI;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final TimeInterpolator f6197lEeR5KfoEr4xU5yHH7 = new LinearInterpolator();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final TimeInterpolator f6198s3fjYDxWOUexjjVgyA = new YlLW4G6OV9TFyuw5ix.s3fjYDxWOUexjjVgyA();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final TimeInterpolator f6195HJFh0TGMpafqLE9haL = new YlLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final TimeInterpolator f6199zZKhbgvUfsK4AEX3r0 = new YlLW4G6OV9TFyuw5ix.HJFh0TGMpafqLE9haL();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final TimeInterpolator f6196husNiw3snxdgZPAGJm = new DecelerateInterpolator();

    public static int HJFh0TGMpafqLE9haL(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }

    public static float lEeR5KfoEr4xU5yHH7(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static float s3fjYDxWOUexjjVgyA(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : lEeR5KfoEr4xU5yHH7(f, f2, (f5 - f3) / (f4 - f3));
    }
}
