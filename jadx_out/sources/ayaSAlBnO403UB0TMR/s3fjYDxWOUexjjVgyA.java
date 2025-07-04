package ayaSAlBnO403UB0TMR;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA implements HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f4601lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final float f4602s3fjYDxWOUexjjVgyA;

    public s3fjYDxWOUexjjVgyA(float f, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        while (hJFh0TGMpafqLE9haL instanceof s3fjYDxWOUexjjVgyA) {
            hJFh0TGMpafqLE9haL = ((s3fjYDxWOUexjjVgyA) hJFh0TGMpafqLE9haL).f4601lEeR5KfoEr4xU5yHH7;
            f += ((s3fjYDxWOUexjjVgyA) hJFh0TGMpafqLE9haL).f4602s3fjYDxWOUexjjVgyA;
        }
        this.f4601lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
        this.f4602s3fjYDxWOUexjjVgyA = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3fjYDxWOUexjjVgyA)) {
            return false;
        }
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) obj;
        return this.f4601lEeR5KfoEr4xU5yHH7.equals(s3fjydxwouexjjvgya.f4601lEeR5KfoEr4xU5yHH7) && this.f4602s3fjYDxWOUexjjVgyA == s3fjydxwouexjjvgya.f4602s3fjYDxWOUexjjVgyA;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4601lEeR5KfoEr4xU5yHH7, Float.valueOf(this.f4602s3fjYDxWOUexjjVgyA)});
    }

    @Override // ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL
    public float lEeR5KfoEr4xU5yHH7(RectF rectF) {
        return Math.max(0.0f, this.f4601lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(rectF) + this.f4602s3fjYDxWOUexjjVgyA);
    }
}
