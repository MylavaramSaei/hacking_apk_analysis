package IPyIQcaNa8aB7drBED;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class GyWRxpdt1T8mEJXPoD {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final ThreadLocal f496lEeR5KfoEr4xU5yHH7 = new ThreadLocal();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final int[] f498s3fjYDxWOUexjjVgyA = {-16842910};

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final int[] f491HJFh0TGMpafqLE9haL = {R.attr.state_focused};

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final int[] f499zZKhbgvUfsK4AEX3r0 = {R.attr.state_activated};

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final int[] f495husNiw3snxdgZPAGJm = {R.attr.state_pressed};

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final int[] f493KYHag8HRDlnO3X9zmZ = {R.attr.state_checked};

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final int[] f494TCyPEKSzIyweCN5yp1 = {R.attr.state_selected};

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static final int[] f492IPyIQcaNa8aB7drBED = {-16842919, -16842908};

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static final int[] f497pbVGzGjWvY2LDXC8vo = new int[0];

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static final int[] f490Acstmh57AKoSEkEFNJ = new int[1];

    public static int HJFh0TGMpafqLE9haL(Context context, int i) {
        int[] iArr = f490Acstmh57AKoSEkEFNJ;
        iArr[0] = i;
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTY43RdunnpKgpbny0lE = PPkm9uUfOJHHYveeLT.Y43RdunnpKgpbny0lE(context, null, iArr);
        try {
            return pPkm9uUfOJHHYveeLTY43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(0, 0);
        } finally {
            pPkm9uUfOJHHYveeLTY43RdunnpKgpbny0lE.xHA29AmDt6y96AnB3t();
        }
    }

    public static TypedValue KYHag8HRDlnO3X9zmZ() {
        ThreadLocal threadLocal = f496lEeR5KfoEr4xU5yHH7;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList husNiw3snxdgZPAGJm(Context context, int i) {
        int[] iArr = f490Acstmh57AKoSEkEFNJ;
        iArr[0] = i;
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTY43RdunnpKgpbny0lE = PPkm9uUfOJHHYveeLT.Y43RdunnpKgpbny0lE(context, null, iArr);
        try {
            return pPkm9uUfOJHHYveeLTY43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL(0);
        } finally {
            pPkm9uUfOJHHYveeLTY43RdunnpKgpbny0lE.xHA29AmDt6y96AnB3t();
        }
    }

    public static void lEeR5KfoEr4xU5yHH7(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6381eWK41qw3g36LVd4UnS);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6382evSiTWao80SbJUZk9E)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int s3fjYDxWOUexjjVgyA(Context context, int i) {
        ColorStateList colorStateListHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(context, i);
        if (colorStateListHusNiw3snxdgZPAGJm != null && colorStateListHusNiw3snxdgZPAGJm.isStateful()) {
            return colorStateListHusNiw3snxdgZPAGJm.getColorForState(f498s3fjYDxWOUexjjVgyA, colorStateListHusNiw3snxdgZPAGJm.getDefaultColor());
        }
        TypedValue typedValueKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueKYHag8HRDlnO3X9zmZ, true);
        return zZKhbgvUfsK4AEX3r0(context, i, typedValueKYHag8HRDlnO3X9zmZ.getFloat());
    }

    public static int zZKhbgvUfsK4AEX3r0(Context context, int i, float f) {
        return VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(HJFh0TGMpafqLE9haL(context, i), Math.round(Color.alpha(r0) * f));
    }
}
