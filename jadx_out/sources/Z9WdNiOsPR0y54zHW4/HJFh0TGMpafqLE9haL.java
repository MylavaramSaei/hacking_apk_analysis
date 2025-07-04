package Z9WdNiOsPR0y54zHW4;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final int[] f2246lEeR5KfoEr4xU5yHH7 = new int[0];

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final long[] f2247s3fjYDxWOUexjjVgyA = new long[0];

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Object[] f2245HJFh0TGMpafqLE9haL = new Object[0];

    public static boolean HJFh0TGMpafqLE9haL(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int KYHag8HRDlnO3X9zmZ(int i) {
        return zZKhbgvUfsK4AEX3r0(i * 8) / 8;
    }

    public static int husNiw3snxdgZPAGJm(int i) {
        return zZKhbgvUfsK4AEX3r0(i * 4) / 4;
    }

    public static int lEeR5KfoEr4xU5yHH7(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static int s3fjYDxWOUexjjVgyA(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static int zZKhbgvUfsK4AEX3r0(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }
}
