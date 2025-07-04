package cr99CPXhoiknALiHbq;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import hgxXdWVkE1CPHCTwpz.s3fjYDxWOUexjjVgyA;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {
    public static int Acstmh57AKoSEkEFNJ(int i, int i2, float f) {
        return pbVGzGjWvY2LDXC8vo(i, VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int HJFh0TGMpafqLE9haL(Context context, int i, String str) {
        return e54J8UWNHWALQNixXM(context, s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(context, i, str));
    }

    public static boolean IPyIQcaNa8aB7drBED(int i) {
        return i != 0 && VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(i) > 0.5d;
    }

    public static Integer KYHag8HRDlnO3X9zmZ(Context context, int i) {
        TypedValue typedValueLEeR5KfoEr4xU5yHH7 = s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(context, i);
        if (typedValueLEeR5KfoEr4xU5yHH7 != null) {
            return Integer.valueOf(e54J8UWNHWALQNixXM(context, typedValueLEeR5KfoEr4xU5yHH7));
        }
        return null;
    }

    public static ColorStateList TCyPEKSzIyweCN5yp1(Context context, int i) {
        TypedValue typedValueLEeR5KfoEr4xU5yHH7 = s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(context, i);
        if (typedValueLEeR5KfoEr4xU5yHH7 == null) {
            return null;
        }
        int i2 = typedValueLEeR5KfoEr4xU5yHH7.resourceId;
        if (i2 != 0) {
            return LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(context, i2);
        }
        int i3 = typedValueLEeR5KfoEr4xU5yHH7.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    public static int Z9WdNiOsPR0y54zHW4(View view, int i, int i2, float f) {
        return Acstmh57AKoSEkEFNJ(zZKhbgvUfsK4AEX3r0(view, i), zZKhbgvUfsK4AEX3r0(view, i2), f);
    }

    public static int e54J8UWNHWALQNixXM(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, i) : typedValue.data;
    }

    public static int husNiw3snxdgZPAGJm(View view, int i, int i2) {
        return s3fjYDxWOUexjjVgyA(view.getContext(), i, i2);
    }

    public static int lEeR5KfoEr4xU5yHH7(int i, int i2) {
        return VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(i, (Color.alpha(i) * i2) / 255);
    }

    public static int pbVGzGjWvY2LDXC8vo(int i, int i2) {
        return VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(i2, i);
    }

    public static int s3fjYDxWOUexjjVgyA(Context context, int i, int i2) {
        Integer numKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(context, i);
        return numKYHag8HRDlnO3X9zmZ != null ? numKYHag8HRDlnO3X9zmZ.intValue() : i2;
    }

    public static int zZKhbgvUfsK4AEX3r0(View view, int i) {
        return e54J8UWNHWALQNixXM(view.getContext(), s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(view, i));
    }
}
