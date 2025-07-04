package fDXXEWvhMVO3O8mnuS;

/* loaded from: classes.dex */
public abstract class TCyPEKSzIyweCN5yp1 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final char[] f5882lEeR5KfoEr4xU5yHH7 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final char[] f5883s3fjYDxWOUexjjVgyA = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String lEeR5KfoEr4xU5yHH7(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0); i++) {
            char[] cArr = f5882lEeR5KfoEr4xU5yHH7;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
