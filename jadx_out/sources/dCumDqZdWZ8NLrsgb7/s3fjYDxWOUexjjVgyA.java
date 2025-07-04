package dCumDqZdWZ8NLrsgb7;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final boolean f5620lEeR5KfoEr4xU5yHH7 = true;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final int[] f5622s3fjYDxWOUexjjVgyA = {R.attr.state_pressed};

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final int[] f5613HJFh0TGMpafqLE9haL = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final int[] f5623zZKhbgvUfsK4AEX3r0 = {R.attr.state_focused};

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final int[] f5619husNiw3snxdgZPAGJm = {R.attr.state_hovered};

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final int[] f5615KYHag8HRDlnO3X9zmZ = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final int[] f5616TCyPEKSzIyweCN5yp1 = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static final int[] f5614IPyIQcaNa8aB7drBED = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static final int[] f5621pbVGzGjWvY2LDXC8vo = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static final int[] f5612Acstmh57AKoSEkEFNJ = {R.attr.state_selected};

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final int[] f5617Z9WdNiOsPR0y54zHW4 = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public static final String f5618e54J8UWNHWALQNixXM = s3fjYDxWOUexjjVgyA.class.getSimpleName();

    public static ColorStateList lEeR5KfoEr4xU5yHH7(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f5617Z9WdNiOsPR0y54zHW4, 0)) != 0) {
            Log.w(f5618e54J8UWNHWALQNixXM, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean s3fjYDxWOUexjjVgyA(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
