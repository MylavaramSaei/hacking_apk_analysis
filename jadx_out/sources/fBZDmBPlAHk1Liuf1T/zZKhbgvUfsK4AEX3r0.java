package fBZDmBPlAHk1Liuf1T;

import VItLRw50eXTZeEfGl0.IPyIQcaNa8aB7drBED;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public abstract class zZKhbgvUfsK4AEX3r0 {
    public static TimeInterpolator HJFh0TGMpafqLE9haL(String str) {
        if (!husNiw3snxdgZPAGJm(str, "cubic-bezier")) {
            if (husNiw3snxdgZPAGJm(str, "path")) {
                return GyWRxpdt1T8mEJXPoD.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(IPyIQcaNa8aB7drBED.zZKhbgvUfsK4AEX3r0(s3fjYDxWOUexjjVgyA(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = s3fjYDxWOUexjjVgyA(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return GyWRxpdt1T8mEJXPoD.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7(strArrSplit, 0), lEeR5KfoEr4xU5yHH7(strArrSplit, 1), lEeR5KfoEr4xU5yHH7(strArrSplit, 2), lEeR5KfoEr4xU5yHH7(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static int KYHag8HRDlnO3X9zmZ(Context context, int i, int i2) {
        return hgxXdWVkE1CPHCTwpz.s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(context, i, i2);
    }

    public static TimeInterpolator TCyPEKSzIyweCN5yp1(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return zZKhbgvUfsK4AEX3r0(strValueOf) ? HJFh0TGMpafqLE9haL(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    public static boolean husNiw3snxdgZPAGJm(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static float lEeR5KfoEr4xU5yHH7(String[] strArr, int i) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static String s3fjYDxWOUexjjVgyA(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static boolean zZKhbgvUfsK4AEX3r0(String str) {
        return husNiw3snxdgZPAGJm(str, "cubic-bezier") || husNiw3snxdgZPAGJm(str, "path");
    }
}
