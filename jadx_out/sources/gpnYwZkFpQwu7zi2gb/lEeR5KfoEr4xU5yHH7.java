package gpnYwZkFpQwu7zi2gb;

import KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final int[] f5968lEeR5KfoEr4xU5yHH7 = {R.attr.theme, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7155tXWeW0sqVddf7ZBflq};

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final int[] f5969s3fjYDxWOUexjjVgyA = {tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7154sTkWmhpZ5b1ArQIw4K};

    public static Context HJFh0TGMpafqLE9haL(Context context, AttributeSet attributeSet, int i, int i2) {
        int iS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(context, attributeSet, i, i2);
        boolean z = (context instanceof s3fjYDxWOUexjjVgyA) && ((s3fjYDxWOUexjjVgyA) context).s3fjYDxWOUexjjVgyA() == iS3fjYDxWOUexjjVgyA;
        if (iS3fjYDxWOUexjjVgyA == 0 || z) {
            return context;
        }
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA(context, iS3fjYDxWOUexjjVgyA);
        int iLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(context, attributeSet);
        if (iLEeR5KfoEr4xU5yHH7 != 0) {
            s3fjydxwouexjjvgya.getTheme().applyStyle(iLEeR5KfoEr4xU5yHH7, true);
        }
        return s3fjydxwouexjjvgya;
    }

    public static int lEeR5KfoEr4xU5yHH7(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5968lEeR5KfoEr4xU5yHH7);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5969s3fjYDxWOUexjjVgyA, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
