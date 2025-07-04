package ayaSAlBnO403UB0TMR;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pbVGzGjWvY2LDXC8vo implements HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final float f4600lEeR5KfoEr4xU5yHH7;

    public pbVGzGjWvY2LDXC8vo(float f) {
        this.f4600lEeR5KfoEr4xU5yHH7 = f;
    }

    public static float s3fjYDxWOUexjjVgyA(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbVGzGjWvY2LDXC8vo) && this.f4600lEeR5KfoEr4xU5yHH7 == ((pbVGzGjWvY2LDXC8vo) obj).f4600lEeR5KfoEr4xU5yHH7;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4600lEeR5KfoEr4xU5yHH7)});
    }

    @Override // ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL
    public float lEeR5KfoEr4xU5yHH7(RectF rectF) {
        return this.f4600lEeR5KfoEr4xU5yHH7 * s3fjYDxWOUexjjVgyA(rectF);
    }
}
