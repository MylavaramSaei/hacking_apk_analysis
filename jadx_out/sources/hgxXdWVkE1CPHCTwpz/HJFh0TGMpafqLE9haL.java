package hgxXdWVkE1CPHCTwpz;

import IPyIQcaNa8aB7drBED.PPkm9uUfOJHHYveeLT;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {
    public static Drawable HJFh0TGMpafqLE9haL(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableS3fjYDxWOUexjjVgyA;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableS3fjYDxWOUexjjVgyA = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableS3fjYDxWOUexjjVgyA;
    }

    public static boolean KYHag8HRDlnO3X9zmZ(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean TCyPEKSzIyweCN5yp1(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static zZKhbgvUfsK4AEX3r0 husNiw3snxdgZPAGJm(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new zZKhbgvUfsK4AEX3r0(context, resourceId);
    }

    public static ColorStateList lEeR5KfoEr4xU5yHH7(Context context, PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLT, int i) {
        int iT9PhQIpGRhE4yZDm1C;
        ColorStateList colorStateListLEeR5KfoEr4xU5yHH7;
        return (!pPkm9uUfOJHHYveeLT.zaq8hOURtfwbcX17cG(i) || (iT9PhQIpGRhE4yZDm1C = pPkm9uUfOJHHYveeLT.T9PhQIpGRhE4yZDm1C(i, 0)) == 0 || (colorStateListLEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(context, iT9PhQIpGRhE4yZDm1C)) == null) ? pPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL(i) : colorStateListLEeR5KfoEr4xU5yHH7;
    }

    public static ColorStateList s3fjYDxWOUexjjVgyA(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListLEeR5KfoEr4xU5yHH7;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListLEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListLEeR5KfoEr4xU5yHH7;
    }

    public static int zZKhbgvUfsK4AEX3r0(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }
}
