package A49QRPHynYLCBN0SqP;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final float f13HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final float f14IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final float f15KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final float f16TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final float f17husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final float f18lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final float f19pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final float f20s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final float f21zZKhbgvUfsK4AEX3r0;

    public lEeR5KfoEr4xU5yHH7(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f18lEeR5KfoEr4xU5yHH7 = f;
        this.f20s3fjYDxWOUexjjVgyA = f2;
        this.f13HJFh0TGMpafqLE9haL = f3;
        this.f21zZKhbgvUfsK4AEX3r0 = f4;
        this.f17husNiw3snxdgZPAGJm = f5;
        this.f15KYHag8HRDlnO3X9zmZ = f6;
        this.f16TCyPEKSzIyweCN5yp1 = f7;
        this.f14IPyIQcaNa8aB7drBED = f8;
        this.f19pbVGzGjWvY2LDXC8vo = f9;
    }

    public static lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        zZKhbgvUfsK4AEX3r0(i, pbVGzGjWvY2LDXC8vo.f22Z9WdNiOsPR0y54zHW4, fArr, fArr2);
        return new lEeR5KfoEr4xU5yHH7(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static lEeR5KfoEr4xU5yHH7 KYHag8HRDlnO3X9zmZ(float f, float f2, float f3, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        float fS3fjYDxWOUexjjVgyA = (4.0f / pbvgzgjwvy2ldxc8vo.s3fjYDxWOUexjjVgyA()) * ((float) Math.sqrt(f / 100.0d)) * (pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7() + 4.0f) * pbvgzgjwvy2ldxc8vo.zZKhbgvUfsK4AEX3r0();
        float fZZKhbgvUfsK4AEX3r0 = f2 * pbvgzgjwvy2ldxc8vo.zZKhbgvUfsK4AEX3r0();
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(r4))) * pbvgzgjwvy2ldxc8vo.s3fjYDxWOUexjjVgyA()) / (pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((fZZKhbgvUfsK4AEX3r0 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new lEeR5KfoEr4xU5yHH7(f3, f2, f, fS3fjYDxWOUexjjVgyA, fZZKhbgvUfsK4AEX3r0, fSqrt, f4, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    public static int T9PhQIpGRhE4yZDm1C(float f, float f2, float f3) {
        return hoXrIDAFrSwfShk8da(f, f2, f3, pbVGzGjWvY2LDXC8vo.f22Z9WdNiOsPR0y54zHW4);
    }

    public static int hoXrIDAFrSwfShk8da(float f, float f2, float f3, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(fMin, f5, f3);
            if (!z) {
                if (leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    leer5kfoer4xu5yhh7 = leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA != null) {
                    return leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA.aPyGSIylzVNKPT1Bls(pbvgzgjwvy2ldxc8vo);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return leer5kfoer4xu5yhh7 == null ? s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(f3) : leer5kfoer4xu5yhh7.aPyGSIylzVNKPT1Bls(pbvgzgjwvy2ldxc8vo);
    }

    public static lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm(float f, float f2, float f3) {
        return KYHag8HRDlnO3X9zmZ(f, f2, f3, pbVGzGjWvY2LDXC8vo.f22Z9WdNiOsPR0y54zHW4);
    }

    public static lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iOANkd3mP6AYvwbNLJM = husNiw3snxdgZPAGJm(f8, f2, f).OANkd3mP6AYvwbNLJM();
            float fS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(iOANkd3mP6AYvwbNLJM);
            float fAbs = Math.abs(f3 - fS3fjYDxWOUexjjVgyA);
            if (fAbs < 0.2f) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(iOANkd3mP6AYvwbNLJM);
                float fLEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(), leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(), f));
                if (fLEeR5KfoEr4xU5yHH7 <= 1.0f) {
                    leer5kfoer4xu5yhh7 = leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL;
                    f5 = fAbs;
                    f7 = fLEeR5KfoEr4xU5yHH7;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            }
            if (fS3fjYDxWOUexjjVgyA < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return leer5kfoer4xu5yhh7;
    }

    public static void zZKhbgvUfsK4AEX3r0(int i, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, float[] fArr, float[] fArr2) {
        s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(i, fArr2);
        float[][] fArr3 = s3fjYDxWOUexjjVgyA.f34lEeR5KfoEr4xU5yHH7;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = f2 + (fArr4[1] * f3);
        float f5 = fArr2[2];
        float f6 = f4 + (fArr4[2] * f5);
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[0] * f) + (fArr5[1] * f3) + (fArr5[2] * f5);
        float[] fArr6 = fArr3[2];
        float f8 = (f * fArr6[0]) + (f3 * fArr6[1]) + (f5 * fArr6[2]);
        float f9 = pbvgzgjwvy2ldxc8vo.pbVGzGjWvY2LDXC8vo()[0] * f6;
        float f10 = pbvgzgjwvy2ldxc8vo.pbVGzGjWvY2LDXC8vo()[1] * f7;
        float f11 = pbvgzgjwvy2ldxc8vo.pbVGzGjWvY2LDXC8vo()[2] * f8;
        float fPow = (float) Math.pow((pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL() * Math.abs(f9)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL() * Math.abs(f10)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL() * Math.abs(f11)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) ((fSignum + fSignum2) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = (((fSignum * 20.0f) + f14) + (21.0f * fSignum3)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f16 * pbvgzgjwvy2ldxc8vo.KYHag8HRDlnO3X9zmZ()) / pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(), pbvgzgjwvy2ldxc8vo.s3fjYDxWOUexjjVgyA() * pbvgzgjwvy2ldxc8vo.Acstmh57AKoSEkEFNJ())) * 100.0f;
        float fS3fjYDxWOUexjjVgyA = (4.0f / pbvgzgjwvy2ldxc8vo.s3fjYDxWOUexjjVgyA()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7() + 4.0f) * pbvgzgjwvy2ldxc8vo.zZKhbgvUfsK4AEX3r0();
        float fSqrt = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, pbvgzgjwvy2ldxc8vo.husNiw3snxdgZPAGJm()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * pbvgzgjwvy2ldxc8vo.TCyPEKSzIyweCN5yp1()) * pbvgzgjwvy2ldxc8vo.IPyIQcaNa8aB7drBED()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float fZZKhbgvUfsK4AEX3r0 = pbvgzgjwvy2ldxc8vo.zZKhbgvUfsK4AEX3r0() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r7 * pbvgzgjwvy2ldxc8vo.s3fjYDxWOUexjjVgyA()) / (pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7() + 4.0f))) * 50.0f;
        float f18 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fZZKhbgvUfsK4AEX3r0) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fS3fjYDxWOUexjjVgyA;
            fArr[2] = fZZKhbgvUfsK4AEX3r0;
            fArr[3] = fSqrt2;
            fArr[4] = f18;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    public float Acstmh57AKoSEkEFNJ() {
        return this.f18lEeR5KfoEr4xU5yHH7;
    }

    public float IPyIQcaNa8aB7drBED() {
        return this.f19pbVGzGjWvY2LDXC8vo;
    }

    public int OANkd3mP6AYvwbNLJM() {
        return aPyGSIylzVNKPT1Bls(pbVGzGjWvY2LDXC8vo.f22Z9WdNiOsPR0y54zHW4);
    }

    public float TCyPEKSzIyweCN5yp1() {
        return this.f14IPyIQcaNa8aB7drBED;
    }

    public float Z9WdNiOsPR0y54zHW4() {
        return this.f13HJFh0TGMpafqLE9haL;
    }

    public int aPyGSIylzVNKPT1Bls(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        float fPow = (float) Math.pow(((((double) pbVGzGjWvY2LDXC8vo()) == 0.0d || ((double) Z9WdNiOsPR0y54zHW4()) == 0.0d) ? 0.0f : pbVGzGjWvY2LDXC8vo() / ((float) Math.sqrt(Z9WdNiOsPR0y54zHW4() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, pbvgzgjwvy2ldxc8vo.husNiw3snxdgZPAGJm()), 0.73d), 1.1111111111111112d);
        double dAcstmh57AKoSEkEFNJ = (Acstmh57AKoSEkEFNJ() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dAcstmh57AKoSEkEFNJ) + 3.8d)) * 0.25f;
        float fLEeR5KfoEr4xU5yHH7 = pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7() * ((float) Math.pow(Z9WdNiOsPR0y54zHW4() / 100.0d, (1.0d / pbvgzgjwvy2ldxc8vo.s3fjYDxWOUexjjVgyA()) / pbvgzgjwvy2ldxc8vo.Acstmh57AKoSEkEFNJ()));
        float fTCyPEKSzIyweCN5yp1 = fCos * 3846.1538f * pbvgzgjwvy2ldxc8vo.TCyPEKSzIyweCN5yp1() * pbvgzgjwvy2ldxc8vo.IPyIQcaNa8aB7drBED();
        float fKYHag8HRDlnO3X9zmZ = fLEeR5KfoEr4xU5yHH7 / pbvgzgjwvy2ldxc8vo.KYHag8HRDlnO3X9zmZ();
        float fSin = (float) Math.sin(dAcstmh57AKoSEkEFNJ);
        float fCos2 = (float) Math.cos(dAcstmh57AKoSEkEFNJ);
        float f = (((0.305f + fKYHag8HRDlnO3X9zmZ) * 23.0f) * fPow) / (((fTCyPEKSzIyweCN5yp1 * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f2 = fCos2 * f;
        float f3 = f * fSin;
        float f4 = fKYHag8HRDlnO3X9zmZ * 460.0f;
        float f5 = (((451.0f * f2) + f4) + (288.0f * f3)) / 1403.0f;
        float f6 = ((f4 - (891.0f * f2)) - (261.0f * f3)) / 1403.0f;
        float fSignum = Math.signum(f5) * (100.0f / pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f5) * 27.13d) / (400.0d - Math.abs(f5))), 2.380952380952381d));
        float fSignum2 = Math.signum(f6) * (100.0f / pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f4 - (f2 * 220.0f)) - (f3 * 6300.0f)) / 1403.0f) * (100.0f / pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f7 = fSignum / pbvgzgjwvy2ldxc8vo.pbVGzGjWvY2LDXC8vo()[0];
        float f8 = fSignum2 / pbvgzgjwvy2ldxc8vo.pbVGzGjWvY2LDXC8vo()[1];
        float f9 = fSignum3 / pbvgzgjwvy2ldxc8vo.pbVGzGjWvY2LDXC8vo()[2];
        float[][] fArr = s3fjYDxWOUexjjVgyA.f35s3fjYDxWOUexjjVgyA;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[0] * f7) + (fArr2[1] * f8) + (fArr2[2] * f9);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[0] * f7) + (fArr3[1] * f8) + (fArr3[2] * f9);
        float[] fArr4 = fArr[2];
        return VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(f10, f11, (f7 * fArr4[0]) + (f8 * fArr4[1]) + (f9 * fArr4[2]));
    }

    public float e54J8UWNHWALQNixXM() {
        return this.f16TCyPEKSzIyweCN5yp1;
    }

    public float lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        float fE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM() - leer5kfoer4xu5yhh7.e54J8UWNHWALQNixXM();
        float fTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1() - leer5kfoer4xu5yhh7.TCyPEKSzIyweCN5yp1();
        float fIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED() - leer5kfoer4xu5yhh7.IPyIQcaNa8aB7drBED();
        return (float) (Math.pow(Math.sqrt((fE54J8UWNHWALQNixXM * fE54J8UWNHWALQNixXM) + (fTCyPEKSzIyweCN5yp1 * fTCyPEKSzIyweCN5yp1) + (fIPyIQcaNa8aB7drBED * fIPyIQcaNa8aB7drBED)), 0.63d) * 1.41d);
    }

    public float pbVGzGjWvY2LDXC8vo() {
        return this.f20s3fjYDxWOUexjjVgyA;
    }
}
