package WWC27LAMFqFFBzfbNw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static class C0024lEeR5KfoEr4xU5yHH7 {
        public static ColorFilter HJFh0TGMpafqLE9haL(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void IPyIQcaNa8aB7drBED(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void KYHag8HRDlnO3X9zmZ(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        public static void TCyPEKSzIyweCN5yp1(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        public static void husNiw3snxdgZPAGJm(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        public static void lEeR5KfoEr4xU5yHH7(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static void pbVGzGjWvY2LDXC8vo(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        public static boolean s3fjYDxWOUexjjVgyA(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static void zZKhbgvUfsK4AEX3r0(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static int lEeR5KfoEr4xU5yHH7(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public static boolean s3fjYDxWOUexjjVgyA(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    public static void Acstmh57AKoSEkEFNJ(Drawable drawable, PorterDuff.Mode mode) {
        C0024lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawable, mode);
    }

    public static boolean HJFh0TGMpafqLE9haL(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void IPyIQcaNa8aB7drBED(Drawable drawable, int i) {
        C0024lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(drawable, i);
    }

    public static void KYHag8HRDlnO3X9zmZ(Drawable drawable, int i, int i2, int i3, int i4) {
        C0024lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(drawable, i, i2, i3, i4);
    }

    public static boolean TCyPEKSzIyweCN5yp1(Drawable drawable, int i) {
        return s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(drawable, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable Z9WdNiOsPR0y54zHW4(Drawable drawable) {
        return drawable instanceof WWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA ? ((WWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA) drawable).lEeR5KfoEr4xU5yHH7() : drawable;
    }

    public static void husNiw3snxdgZPAGJm(Drawable drawable, float f, float f2) {
        C0024lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(drawable, f, f2);
    }

    public static void lEeR5KfoEr4xU5yHH7(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static void pbVGzGjWvY2LDXC8vo(Drawable drawable, ColorStateList colorStateList) {
        C0024lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(drawable, colorStateList);
    }

    public static int s3fjYDxWOUexjjVgyA(Drawable drawable) {
        return s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(drawable);
    }

    public static void zZKhbgvUfsK4AEX3r0(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static Drawable e54J8UWNHWALQNixXM(Drawable drawable) {
        return drawable;
    }
}
