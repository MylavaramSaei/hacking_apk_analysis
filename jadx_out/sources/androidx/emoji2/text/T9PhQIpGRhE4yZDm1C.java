package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class T9PhQIpGRhE4yZDm1C {

    public interface HJFh0TGMpafqLE9haL {
        int HJFh0TGMpafqLE9haL();

        long husNiw3snxdgZPAGJm();

        long lEeR5KfoEr4xU5yHH7();

        void s3fjYDxWOUexjjVgyA(int i);

        int zZKhbgvUfsK4AEX3r0();
    }

    public static class lEeR5KfoEr4xU5yHH7 implements HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final ByteBuffer f3343lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(ByteBuffer byteBuffer) {
            this.f3343lEeR5KfoEr4xU5yHH7 = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL
        public int HJFh0TGMpafqLE9haL() {
            return T9PhQIpGRhE4yZDm1C.zZKhbgvUfsK4AEX3r0(this.f3343lEeR5KfoEr4xU5yHH7.getShort());
        }

        @Override // androidx.emoji2.text.T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL
        public long husNiw3snxdgZPAGJm() {
            return this.f3343lEeR5KfoEr4xU5yHH7.position();
        }

        @Override // androidx.emoji2.text.T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL
        public long lEeR5KfoEr4xU5yHH7() {
            return T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL(this.f3343lEeR5KfoEr4xU5yHH7.getInt());
        }

        @Override // androidx.emoji2.text.T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL
        public void s3fjYDxWOUexjjVgyA(int i) {
            ByteBuffer byteBuffer = this.f3343lEeR5KfoEr4xU5yHH7;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.emoji2.text.T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL
        public int zZKhbgvUfsK4AEX3r0() {
            return this.f3343lEeR5KfoEr4xU5yHH7.getInt();
        }
    }

    public static class s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final long f3344lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final long f3345s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(long j, long j2) {
            this.f3344lEeR5KfoEr4xU5yHH7 = j;
            this.f3345s3fjYDxWOUexjjVgyA = j2;
        }

        public long lEeR5KfoEr4xU5yHH7() {
            return this.f3344lEeR5KfoEr4xU5yHH7;
        }
    }

    public static long HJFh0TGMpafqLE9haL(int i) {
        return i & 4294967295L;
    }

    public static s3fjYDxWOUexjjVgyA lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) throws IOException {
        long jLEeR5KfoEr4xU5yHH7;
        hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(4);
        int iHJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL();
        if (iHJFh0TGMpafqLE9haL > 100) {
            throw new IOException("Cannot read metadata.");
        }
        hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(6);
        int i = 0;
        while (true) {
            if (i >= iHJFh0TGMpafqLE9haL) {
                jLEeR5KfoEr4xU5yHH7 = -1;
                break;
            }
            int iZZKhbgvUfsK4AEX3r0 = hJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0();
            hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(4);
            jLEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
            hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(4);
            if (1835365473 == iZZKhbgvUfsK4AEX3r0) {
                break;
            }
            i++;
        }
        if (jLEeR5KfoEr4xU5yHH7 != -1) {
            hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA((int) (jLEeR5KfoEr4xU5yHH7 - hJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm()));
            hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(12);
            long jLEeR5KfoEr4xU5yHH72 = hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
            for (int i2 = 0; i2 < jLEeR5KfoEr4xU5yHH72; i2++) {
                int iZZKhbgvUfsK4AEX3r02 = hJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0();
                long jLEeR5KfoEr4xU5yHH73 = hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
                long jLEeR5KfoEr4xU5yHH74 = hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
                if (1164798569 == iZZKhbgvUfsK4AEX3r02 || 1701669481 == iZZKhbgvUfsK4AEX3r02) {
                    return new s3fjYDxWOUexjjVgyA(jLEeR5KfoEr4xU5yHH73 + jLEeR5KfoEr4xU5yHH7, jLEeR5KfoEr4xU5yHH74);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static ToH8yzk8U1nKT0PUfY.s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) lEeR5KfoEr4xU5yHH7(new lEeR5KfoEr4xU5yHH7(byteBufferDuplicate)).lEeR5KfoEr4xU5yHH7());
        return ToH8yzk8U1nKT0PUfY.s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(byteBufferDuplicate);
    }

    public static int zZKhbgvUfsK4AEX3r0(short s) {
        return s & 65535;
    }
}
