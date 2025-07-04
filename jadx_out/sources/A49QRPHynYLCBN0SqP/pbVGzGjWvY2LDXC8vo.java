package A49QRPHynYLCBN0SqP;

/* loaded from: classes.dex */
public final class pbVGzGjWvY2LDXC8vo {

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final pbVGzGjWvY2LDXC8vo f22Z9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4(s3fjYDxWOUexjjVgyA.f33HJFh0TGMpafqLE9haL, (float) ((s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final float f23Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final float f24HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final float f25IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final float f26KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final float[] f27TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final float f28husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final float f29lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final float f30pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final float f31s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final float f32zZKhbgvUfsK4AEX3r0;

    public pbVGzGjWvY2LDXC8vo(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f26KYHag8HRDlnO3X9zmZ = f;
        this.f29lEeR5KfoEr4xU5yHH7 = f2;
        this.f31s3fjYDxWOUexjjVgyA = f3;
        this.f24HJFh0TGMpafqLE9haL = f4;
        this.f32zZKhbgvUfsK4AEX3r0 = f5;
        this.f28husNiw3snxdgZPAGJm = f6;
        this.f27TCyPEKSzIyweCN5yp1 = fArr;
        this.f25IPyIQcaNa8aB7drBED = f7;
        this.f30pbVGzGjWvY2LDXC8vo = f8;
        this.f23Acstmh57AKoSEkEFNJ = f9;
    }

    public static pbVGzGjWvY2LDXC8vo Z9WdNiOsPR0y54zHW4(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = s3fjYDxWOUexjjVgyA.f34lEeR5KfoEr4xU5yHH7;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = f5 + (fArr3[1] * f6);
        float f8 = fArr[2];
        float f9 = f7 + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f4) + (fArr4[1] * f6) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f4 * fArr5[0]) + (f6 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        float fZZKhbgvUfsK4AEX3r0 = ((double) f12) >= 0.9d ? s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(f * 5.0d)));
        float fIPyIQcaNa8aB7drBED = s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(f2) / fArr[1];
        double d2 = fIPyIQcaNa8aB7drBED;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * fCbrt) * f11) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        return new pbVGzGjWvY2LDXC8vo(fIPyIQcaNa8aB7drBED, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fZZKhbgvUfsK4AEX3r0, f12, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float Acstmh57AKoSEkEFNJ() {
        return this.f23Acstmh57AKoSEkEFNJ;
    }

    public float HJFh0TGMpafqLE9haL() {
        return this.f25IPyIQcaNa8aB7drBED;
    }

    public float IPyIQcaNa8aB7drBED() {
        return this.f24HJFh0TGMpafqLE9haL;
    }

    public float KYHag8HRDlnO3X9zmZ() {
        return this.f31s3fjYDxWOUexjjVgyA;
    }

    public float TCyPEKSzIyweCN5yp1() {
        return this.f28husNiw3snxdgZPAGJm;
    }

    public float husNiw3snxdgZPAGJm() {
        return this.f26KYHag8HRDlnO3X9zmZ;
    }

    public float lEeR5KfoEr4xU5yHH7() {
        return this.f29lEeR5KfoEr4xU5yHH7;
    }

    public float[] pbVGzGjWvY2LDXC8vo() {
        return this.f27TCyPEKSzIyweCN5yp1;
    }

    public float s3fjYDxWOUexjjVgyA() {
        return this.f32zZKhbgvUfsK4AEX3r0;
    }

    public float zZKhbgvUfsK4AEX3r0() {
        return this.f30pbVGzGjWvY2LDXC8vo;
    }
}
