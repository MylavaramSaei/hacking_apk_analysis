package ToH8yzk8U1nKT0PUfY;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f1629HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f1630husNiw3snxdgZPAGJm = zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f1631lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public ByteBuffer f1632s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f1633zZKhbgvUfsK4AEX3r0;

    public void HJFh0TGMpafqLE9haL(int i, ByteBuffer byteBuffer) {
        short s;
        this.f1632s3fjYDxWOUexjjVgyA = byteBuffer;
        if (byteBuffer != null) {
            this.f1631lEeR5KfoEr4xU5yHH7 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f1629HJFh0TGMpafqLE9haL = i2;
            s = this.f1632s3fjYDxWOUexjjVgyA.getShort(i2);
        } else {
            s = 0;
            this.f1631lEeR5KfoEr4xU5yHH7 = 0;
            this.f1629HJFh0TGMpafqLE9haL = 0;
        }
        this.f1633zZKhbgvUfsK4AEX3r0 = s;
    }

    public int husNiw3snxdgZPAGJm(int i) {
        int i2 = i + this.f1631lEeR5KfoEr4xU5yHH7;
        return this.f1632s3fjYDxWOUexjjVgyA.getInt(i2 + this.f1632s3fjYDxWOUexjjVgyA.getInt(i2));
    }

    public int lEeR5KfoEr4xU5yHH7(int i) {
        return i + this.f1632s3fjYDxWOUexjjVgyA.getInt(i);
    }

    public int s3fjYDxWOUexjjVgyA(int i) {
        if (i < this.f1633zZKhbgvUfsK4AEX3r0) {
            return this.f1632s3fjYDxWOUexjjVgyA.getShort(this.f1629HJFh0TGMpafqLE9haL + i);
        }
        return 0;
    }

    public int zZKhbgvUfsK4AEX3r0(int i) {
        int i2 = i + this.f1631lEeR5KfoEr4xU5yHH7;
        return i2 + this.f1632s3fjYDxWOUexjjVgyA.getInt(i2) + 4;
    }
}
