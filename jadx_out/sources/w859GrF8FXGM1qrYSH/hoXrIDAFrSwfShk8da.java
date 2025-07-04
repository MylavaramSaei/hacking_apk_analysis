package w859GrF8FXGM1qrYSH;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes.dex */
public class hoXrIDAFrSwfShk8da {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final byte f7228lEeR5KfoEr4xU5yHH7 = Byte.parseByte("01110000", 2);

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final byte f7229s3fjYDxWOUexjjVgyA = Byte.parseByte("00001111", 2);

    public static byte[] HJFh0TGMpafqLE9haL(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    public static String s3fjYDxWOUexjjVgyA(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    public String lEeR5KfoEr4xU5yHH7() {
        byte[] bArrHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(UUID.randomUUID(), new byte[17]);
        byte b = bArrHJFh0TGMpafqLE9haL[0];
        bArrHJFh0TGMpafqLE9haL[16] = b;
        bArrHJFh0TGMpafqLE9haL[0] = (byte) ((b & f7229s3fjYDxWOUexjjVgyA) | f7228lEeR5KfoEr4xU5yHH7);
        return s3fjYDxWOUexjjVgyA(bArrHJFh0TGMpafqLE9haL);
    }
}
