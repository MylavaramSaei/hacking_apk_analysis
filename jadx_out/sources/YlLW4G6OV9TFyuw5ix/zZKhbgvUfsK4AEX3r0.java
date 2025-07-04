package YlLW4G6OV9TFyuw5ix;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class zZKhbgvUfsK4AEX3r0 implements Interpolator {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final float[] f2179lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final float f2180s3fjYDxWOUexjjVgyA;

    public zZKhbgvUfsK4AEX3r0(float[] fArr) {
        this.f2179lEeR5KfoEr4xU5yHH7 = fArr;
        this.f2180s3fjYDxWOUexjjVgyA = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2179lEeR5KfoEr4xU5yHH7;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f2180s3fjYDxWOUexjjVgyA;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.f2179lEeR5KfoEr4xU5yHH7;
        float f4 = fArr2[iMin];
        return f4 + (f3 * (fArr2[iMin + 1] - f4));
    }
}
