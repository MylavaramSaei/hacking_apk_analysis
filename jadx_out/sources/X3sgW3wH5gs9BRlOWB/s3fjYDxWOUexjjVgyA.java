package X3sgW3wH5gs9BRlOWB;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {
    public static long lEeR5KfoEr4xU5yHH7(int i, String[] strArr, long j) {
        return (strArr[i / 8191].charAt(i % 8191) << 32) ^ HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(j);
    }

    public static String s3fjYDxWOUexjjVgyA(long j, String[] strArr) {
        long jLEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(4294967295L & j));
        long j2 = (jLEeR5KfoEr4xU5yHH7 >>> 32) & 65535;
        long jLEeR5KfoEr4xU5yHH72 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(jLEeR5KfoEr4xU5yHH7);
        int i = (int) (((j >>> 32) ^ j2) ^ ((jLEeR5KfoEr4xU5yHH72 >>> 16) & (-65536)));
        long jLEeR5KfoEr4xU5yHH73 = lEeR5KfoEr4xU5yHH7(i, strArr, jLEeR5KfoEr4xU5yHH72);
        int i2 = (int) ((jLEeR5KfoEr4xU5yHH73 >>> 32) & 65535);
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jLEeR5KfoEr4xU5yHH73 = lEeR5KfoEr4xU5yHH7(i + i3 + 1, strArr, jLEeR5KfoEr4xU5yHH73);
            cArr[i3] = (char) ((jLEeR5KfoEr4xU5yHH73 >>> 32) & 65535);
        }
        return new String(cArr);
    }
}
