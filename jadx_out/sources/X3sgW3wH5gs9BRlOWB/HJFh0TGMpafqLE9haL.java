package X3sgW3wH5gs9BRlOWB;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {
    public static long HJFh0TGMpafqLE9haL(long j) {
        long j2 = (j ^ (j >>> 33)) * 7109453100751455733L;
        return ((j2 ^ (j2 >>> 28)) * (-3808689974395783757L)) >>> 32;
    }

    public static long lEeR5KfoEr4xU5yHH7(long j) {
        short s = (short) (j & 65535);
        short s2 = (short) ((j >>> 16) & 65535);
        short sS3fjYDxWOUexjjVgyA = (short) (s3fjYDxWOUexjjVgyA((short) (s + s2), 9) + s);
        short s3 = (short) (s2 ^ s);
        return ((s3fjYDxWOUexjjVgyA(s3, 10) | (sS3fjYDxWOUexjjVgyA << 16)) << 16) | ((short) (((short) (s3fjYDxWOUexjjVgyA(s, 13) ^ s3)) ^ (s3 << 5)));
    }

    public static short s3fjYDxWOUexjjVgyA(short s, int i) {
        return (short) ((s >>> (32 - i)) | (s << i));
    }
}
