package WaWv1mJ1ya3uoEaKqz;

import IPyIQcaNa8aB7drBED.PPkm9uUfOJHHYveeLT;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public abstract class Z9WdNiOsPR0y54zHW4 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final int[] f1985lEeR5KfoEr4xU5yHH7 = {tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7131KYHag8HRDlnO3X9zmZ};

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final int[] f1986s3fjYDxWOUexjjVgyA = {tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7137TCyPEKSzIyweCN5yp1};

    public static void HJFh0TGMpafqLE9haL(Context context) {
        husNiw3snxdgZPAGJm(context, f1986s3fjYDxWOUexjjVgyA, "Theme.MaterialComponents");
    }

    public static TypedArray IPyIQcaNa8aB7drBED(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        s3fjYDxWOUexjjVgyA(context, attributeSet, i, i2);
        zZKhbgvUfsK4AEX3r0(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static boolean KYHag8HRDlnO3X9zmZ(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i3, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean TCyPEKSzIyweCN5yp1(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static void husNiw3snxdgZPAGJm(Context context, int[] iArr, String str) {
        if (TCyPEKSzIyweCN5yp1(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static void lEeR5KfoEr4xU5yHH7(Context context) {
        husNiw3snxdgZPAGJm(context, f1985lEeR5KfoEr4xU5yHH7, "Theme.AppCompat");
    }

    public static PPkm9uUfOJHHYveeLT pbVGzGjWvY2LDXC8vo(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        s3fjYDxWOUexjjVgyA(context, attributeSet, i, i2);
        zZKhbgvUfsK4AEX3r0(context, attributeSet, iArr, i, i2, iArr2);
        return PPkm9uUfOJHHYveeLT.R9SAhYMerGybF9OAjL(context, attributeSet, iArr, i, i2);
    }

    public static void s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ.V0OhHaTxcW6AeoBVEw, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ.USKXmxYrTARsyOPVD4, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7136T9PhQIpGRhE4yZDm1C, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                HJFh0TGMpafqLE9haL(context);
            }
        }
        lEeR5KfoEr4xU5yHH7(context);
    }

    public static void zZKhbgvUfsK4AEX3r0(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean zKYHag8HRDlnO3X9zmZ;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ.V0OhHaTxcW6AeoBVEw, i, i2);
        if (!typedArrayObtainStyledAttributes.getBoolean(tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ.y1J6bSiUCQLJF0aRHp, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zKYHag8HRDlnO3X9zmZ = typedArrayObtainStyledAttributes.getResourceId(tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ.NbT0rvt8HokpJMIjIA, -1) != -1;
        } else {
            zKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(context, attributeSet, iArr, i, i2, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zKYHag8HRDlnO3X9zmZ) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }
}
