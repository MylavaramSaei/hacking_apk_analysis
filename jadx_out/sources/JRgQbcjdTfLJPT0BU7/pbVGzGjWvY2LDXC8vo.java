package JRgQbcjdTfLJPT0BU7;

/* loaded from: classes.dex */
public class pbVGzGjWvY2LDXC8vo implements hUNDUI3oB5uci3ylnY.IPyIQcaNa8aB7drBED {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public hUNDUI3oB5uci3ylnY.zZKhbgvUfsK4AEX3r0 f752HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f753lEeR5KfoEr4xU5yHH7 = false;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f754s3fjYDxWOUexjjVgyA = false;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final KYHag8HRDlnO3X9zmZ f755zZKhbgvUfsK4AEX3r0;

    public pbVGzGjWvY2LDXC8vo(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        this.f755zZKhbgvUfsK4AEX3r0 = kYHag8HRDlnO3X9zmZ;
    }

    public final void HJFh0TGMpafqLE9haL() {
        if (this.f753lEeR5KfoEr4xU5yHH7) {
            throw new hUNDUI3oB5uci3ylnY.HJFh0TGMpafqLE9haL("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f753lEeR5KfoEr4xU5yHH7 = true;
    }

    @Override // hUNDUI3oB5uci3ylnY.IPyIQcaNa8aB7drBED
    public hUNDUI3oB5uci3ylnY.IPyIQcaNa8aB7drBED lEeR5KfoEr4xU5yHH7(String str) {
        HJFh0TGMpafqLE9haL();
        this.f755zZKhbgvUfsK4AEX3r0.e54J8UWNHWALQNixXM(this.f752HJFh0TGMpafqLE9haL, str, this.f754s3fjYDxWOUexjjVgyA);
        return this;
    }

    @Override // hUNDUI3oB5uci3ylnY.IPyIQcaNa8aB7drBED
    public hUNDUI3oB5uci3ylnY.IPyIQcaNa8aB7drBED s3fjYDxWOUexjjVgyA(boolean z) {
        HJFh0TGMpafqLE9haL();
        this.f755zZKhbgvUfsK4AEX3r0.pbVGzGjWvY2LDXC8vo(this.f752HJFh0TGMpafqLE9haL, z, this.f754s3fjYDxWOUexjjVgyA);
        return this;
    }

    public void zZKhbgvUfsK4AEX3r0(hUNDUI3oB5uci3ylnY.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, boolean z) {
        this.f753lEeR5KfoEr4xU5yHH7 = false;
        this.f752HJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r0;
        this.f754s3fjYDxWOUexjjVgyA = z;
    }
}
