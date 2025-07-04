package Tu4WCh2gEwj8E4oHbP;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public abstract class THTDvPxsHqMeGb512f {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Property f1690HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final PPkm9uUfOJHHYveeLT f1691lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final Property f1692s3fjYDxWOUexjjVgyA;

    public static class lEeR5KfoEr4xU5yHH7 extends Property {
        public lEeR5KfoEr4xU5yHH7(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL(view));
        }

        @Override // android.util.Property
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            THTDvPxsHqMeGb512f.TCyPEKSzIyweCN5yp1(view, f.floatValue());
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends Property {
        public s3fjYDxWOUexjjVgyA(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.zaq8hOURtfwbcX17cG(view);
        }

        @Override // android.util.Property
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.fLSSbwbzFBVpwBH5FM(view, rect);
        }
    }

    static {
        f1691lEeR5KfoEr4xU5yHH7 = Build.VERSION.SDK_INT >= 29 ? new KqgKJKIWne3kz1AdHk() : new e2F9F6h8YJxTHwLCa0();
        f1692s3fjYDxWOUexjjVgyA = new lEeR5KfoEr4xU5yHH7(Float.class, "translationAlpha");
        f1690HJFh0TGMpafqLE9haL = new s3fjYDxWOUexjjVgyA(Rect.class, "clipBounds");
    }

    public static void Acstmh57AKoSEkEFNJ(View view, Matrix matrix) {
        f1691lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(view, matrix);
    }

    public static float HJFh0TGMpafqLE9haL(View view) {
        return f1691lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(view);
    }

    public static void IPyIQcaNa8aB7drBED(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f1691lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(view, i);
    }

    public static void KYHag8HRDlnO3X9zmZ(View view, int i, int i2, int i3, int i4) {
        f1691lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(view, i, i2, i3, i4);
    }

    public static void TCyPEKSzIyweCN5yp1(View view, float f) {
        f1691lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(view, f);
    }

    public static void husNiw3snxdgZPAGJm(View view) {
        f1691lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(view);
    }

    public static void lEeR5KfoEr4xU5yHH7(View view) {
        f1691lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(view);
    }

    public static void pbVGzGjWvY2LDXC8vo(View view, Matrix matrix) {
        f1691lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view, matrix);
    }

    public static WWC27LAMFqFFBzfbNw s3fjYDxWOUexjjVgyA(View view) {
        return new VItLRw50eXTZeEfGl0(view);
    }

    public static ToH8yzk8U1nKT0PUfY zZKhbgvUfsK4AEX3r0(View view) {
        return new lLKzvdU99Iw80uVD5I(view);
    }
}
