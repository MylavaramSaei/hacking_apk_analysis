package tXWeW0sqVddf7ZBflq;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class TCyPEKSzIyweCN5yp1 {
    public static int HJFh0TGMpafqLE9haL(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        if (i <= i3) {
            return i;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static Object IPyIQcaNa8aB7drBED(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int KYHag8HRDlnO3X9zmZ(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    public static Object TCyPEKSzIyweCN5yp1(Object obj) {
        obj.getClass();
        return obj;
    }

    public static int husNiw3snxdgZPAGJm(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static void lEeR5KfoEr4xU5yHH7(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void pbVGzGjWvY2LDXC8vo(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void s3fjYDxWOUexjjVgyA(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int zZKhbgvUfsK4AEX3r0(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }
}
