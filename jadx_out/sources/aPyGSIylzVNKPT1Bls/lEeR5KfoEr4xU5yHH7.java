package aPyGSIylzVNKPT1Bls;

import aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA;
import java.util.Arrays;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 implements s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 {

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public static float f2336e54J8UWNHWALQNixXM = 0.001f;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f2338HJFh0TGMpafqLE9haL;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f2346s3fjYDxWOUexjjVgyA;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f2344lEeR5KfoEr4xU5yHH7 = 0;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f2347zZKhbgvUfsK4AEX3r0 = 8;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public pbVGzGjWvY2LDXC8vo f2343husNiw3snxdgZPAGJm = null;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int[] f2340KYHag8HRDlnO3X9zmZ = new int[8];

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int[] f2341TCyPEKSzIyweCN5yp1 = new int[8];

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public float[] f2339IPyIQcaNa8aB7drBED = new float[8];

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int f2345pbVGzGjWvY2LDXC8vo = -1;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int f2337Acstmh57AKoSEkEFNJ = -1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public boolean f2342Z9WdNiOsPR0y54zHW4 = false;

    public lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f2346s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya;
        this.f2338HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public void Acstmh57AKoSEkEFNJ() {
        int i = this.f2345pbVGzGjWvY2LDXC8vo;
        for (int i2 = 0; i != -1 && i2 < this.f2344lEeR5KfoEr4xU5yHH7; i2++) {
            float[] fArr = this.f2339IPyIQcaNa8aB7drBED;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f2341TCyPEKSzIyweCN5yp1[i];
        }
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public final float HJFh0TGMpafqLE9haL(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        int i = this.f2345pbVGzGjWvY2LDXC8vo;
        for (int i2 = 0; i != -1 && i2 < this.f2344lEeR5KfoEr4xU5yHH7; i2++) {
            if (this.f2340KYHag8HRDlnO3X9zmZ[i] == pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL) {
                return this.f2339IPyIQcaNa8aB7drBED[i];
            }
            i = this.f2341TCyPEKSzIyweCN5yp1[i];
        }
        return 0.0f;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public boolean IPyIQcaNa8aB7drBED(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        int i = this.f2345pbVGzGjWvY2LDXC8vo;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f2344lEeR5KfoEr4xU5yHH7; i2++) {
            if (this.f2340KYHag8HRDlnO3X9zmZ[i] == pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL) {
                return true;
            }
            i = this.f2341TCyPEKSzIyweCN5yp1[i];
        }
        return false;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public pbVGzGjWvY2LDXC8vo KYHag8HRDlnO3X9zmZ(int i) {
        int i2 = this.f2345pbVGzGjWvY2LDXC8vo;
        for (int i3 = 0; i2 != -1 && i3 < this.f2344lEeR5KfoEr4xU5yHH7; i3++) {
            if (i3 == i) {
                return this.f2338HJFh0TGMpafqLE9haL.f2323zZKhbgvUfsK4AEX3r0[this.f2340KYHag8HRDlnO3X9zmZ[i2]];
            }
            i2 = this.f2341TCyPEKSzIyweCN5yp1[i2];
        }
        return null;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public final void TCyPEKSzIyweCN5yp1(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, float f) {
        if (f == 0.0f) {
            s3fjYDxWOUexjjVgyA(pbvgzgjwvy2ldxc8vo, true);
            return;
        }
        int i = this.f2345pbVGzGjWvY2LDXC8vo;
        if (i == -1) {
            this.f2345pbVGzGjWvY2LDXC8vo = 0;
            this.f2339IPyIQcaNa8aB7drBED[0] = f;
            this.f2340KYHag8HRDlnO3X9zmZ[0] = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL;
            this.f2341TCyPEKSzIyweCN5yp1[0] = -1;
            pbvgzgjwvy2ldxc8vo.f2353T9PhQIpGRhE4yZDm1C++;
            pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(this.f2346s3fjYDxWOUexjjVgyA);
            this.f2344lEeR5KfoEr4xU5yHH7++;
            if (this.f2342Z9WdNiOsPR0y54zHW4) {
                return;
            }
            int i2 = this.f2337Acstmh57AKoSEkEFNJ + 1;
            this.f2337Acstmh57AKoSEkEFNJ = i2;
            int[] iArr = this.f2340KYHag8HRDlnO3X9zmZ;
            if (i2 >= iArr.length) {
                this.f2342Z9WdNiOsPR0y54zHW4 = true;
                this.f2337Acstmh57AKoSEkEFNJ = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f2344lEeR5KfoEr4xU5yHH7; i4++) {
            int i5 = this.f2340KYHag8HRDlnO3X9zmZ[i];
            int i6 = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL;
            if (i5 == i6) {
                this.f2339IPyIQcaNa8aB7drBED[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f2341TCyPEKSzIyweCN5yp1[i];
        }
        int length = this.f2337Acstmh57AKoSEkEFNJ;
        int i7 = length + 1;
        if (this.f2342Z9WdNiOsPR0y54zHW4) {
            int[] iArr2 = this.f2340KYHag8HRDlnO3X9zmZ;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f2340KYHag8HRDlnO3X9zmZ;
        if (length >= iArr3.length && this.f2344lEeR5KfoEr4xU5yHH7 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f2340KYHag8HRDlnO3X9zmZ;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f2340KYHag8HRDlnO3X9zmZ;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f2347zZKhbgvUfsK4AEX3r0 * 2;
            this.f2347zZKhbgvUfsK4AEX3r0 = i9;
            this.f2342Z9WdNiOsPR0y54zHW4 = false;
            this.f2337Acstmh57AKoSEkEFNJ = length - 1;
            this.f2339IPyIQcaNa8aB7drBED = Arrays.copyOf(this.f2339IPyIQcaNa8aB7drBED, i9);
            this.f2340KYHag8HRDlnO3X9zmZ = Arrays.copyOf(this.f2340KYHag8HRDlnO3X9zmZ, this.f2347zZKhbgvUfsK4AEX3r0);
            this.f2341TCyPEKSzIyweCN5yp1 = Arrays.copyOf(this.f2341TCyPEKSzIyweCN5yp1, this.f2347zZKhbgvUfsK4AEX3r0);
        }
        this.f2340KYHag8HRDlnO3X9zmZ[length] = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL;
        this.f2339IPyIQcaNa8aB7drBED[length] = f;
        int[] iArr6 = this.f2341TCyPEKSzIyweCN5yp1;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.f2345pbVGzGjWvY2LDXC8vo;
            this.f2345pbVGzGjWvY2LDXC8vo = length;
        }
        pbvgzgjwvy2ldxc8vo.f2353T9PhQIpGRhE4yZDm1C++;
        pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(this.f2346s3fjYDxWOUexjjVgyA);
        int i10 = this.f2344lEeR5KfoEr4xU5yHH7 + 1;
        this.f2344lEeR5KfoEr4xU5yHH7 = i10;
        if (!this.f2342Z9WdNiOsPR0y54zHW4) {
            this.f2337Acstmh57AKoSEkEFNJ++;
        }
        int[] iArr7 = this.f2340KYHag8HRDlnO3X9zmZ;
        if (i10 >= iArr7.length) {
            this.f2342Z9WdNiOsPR0y54zHW4 = true;
        }
        if (this.f2337Acstmh57AKoSEkEFNJ >= iArr7.length) {
            this.f2342Z9WdNiOsPR0y54zHW4 = true;
            this.f2337Acstmh57AKoSEkEFNJ = iArr7.length - 1;
        }
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public int Z9WdNiOsPR0y54zHW4() {
        return this.f2344lEeR5KfoEr4xU5yHH7;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public final void clear() {
        int i = this.f2345pbVGzGjWvY2LDXC8vo;
        for (int i2 = 0; i != -1 && i2 < this.f2344lEeR5KfoEr4xU5yHH7; i2++) {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = this.f2338HJFh0TGMpafqLE9haL.f2323zZKhbgvUfsK4AEX3r0[this.f2340KYHag8HRDlnO3X9zmZ[i]];
            if (pbvgzgjwvy2ldxc8vo != null) {
                pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL(this.f2346s3fjYDxWOUexjjVgyA);
            }
            i = this.f2341TCyPEKSzIyweCN5yp1[i];
        }
        this.f2345pbVGzGjWvY2LDXC8vo = -1;
        this.f2337Acstmh57AKoSEkEFNJ = -1;
        this.f2342Z9WdNiOsPR0y54zHW4 = false;
        this.f2344lEeR5KfoEr4xU5yHH7 = 0;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public float husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, boolean z) {
        float fHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(s3fjydxwouexjjvgya.f2372lEeR5KfoEr4xU5yHH7);
        s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgya.f2372lEeR5KfoEr4xU5yHH7, z);
        s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = s3fjydxwouexjjvgya.f2371husNiw3snxdgZPAGJm;
        int iZ9WdNiOsPR0y54zHW4 = leer5kfoer4xu5yhh7.Z9WdNiOsPR0y54zHW4();
        for (int i = 0; i < iZ9WdNiOsPR0y54zHW4; i++) {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ = leer5kfoer4xu5yhh7.KYHag8HRDlnO3X9zmZ(i);
            zZKhbgvUfsK4AEX3r0(pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ, leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL(pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ) * fHJFh0TGMpafqLE9haL, z);
        }
        return fHJFh0TGMpafqLE9haL;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public float lEeR5KfoEr4xU5yHH7(int i) {
        int i2 = this.f2345pbVGzGjWvY2LDXC8vo;
        for (int i3 = 0; i2 != -1 && i3 < this.f2344lEeR5KfoEr4xU5yHH7; i3++) {
            if (i3 == i) {
                return this.f2339IPyIQcaNa8aB7drBED[i2];
            }
            i2 = this.f2341TCyPEKSzIyweCN5yp1[i2];
        }
        return 0.0f;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public void pbVGzGjWvY2LDXC8vo(float f) {
        int i = this.f2345pbVGzGjWvY2LDXC8vo;
        for (int i2 = 0; i != -1 && i2 < this.f2344lEeR5KfoEr4xU5yHH7; i2++) {
            float[] fArr = this.f2339IPyIQcaNa8aB7drBED;
            fArr[i] = fArr[i] / f;
            i = this.f2341TCyPEKSzIyweCN5yp1[i];
        }
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public final float s3fjYDxWOUexjjVgyA(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, boolean z) {
        if (this.f2343husNiw3snxdgZPAGJm == pbvgzgjwvy2ldxc8vo) {
            this.f2343husNiw3snxdgZPAGJm = null;
        }
        int i = this.f2345pbVGzGjWvY2LDXC8vo;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2344lEeR5KfoEr4xU5yHH7) {
            if (this.f2340KYHag8HRDlnO3X9zmZ[i] == pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL) {
                if (i == this.f2345pbVGzGjWvY2LDXC8vo) {
                    this.f2345pbVGzGjWvY2LDXC8vo = this.f2341TCyPEKSzIyweCN5yp1[i];
                } else {
                    int[] iArr = this.f2341TCyPEKSzIyweCN5yp1;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL(this.f2346s3fjYDxWOUexjjVgyA);
                }
                pbvgzgjwvy2ldxc8vo.f2353T9PhQIpGRhE4yZDm1C--;
                this.f2344lEeR5KfoEr4xU5yHH7--;
                this.f2340KYHag8HRDlnO3X9zmZ[i] = -1;
                if (this.f2342Z9WdNiOsPR0y54zHW4) {
                    this.f2337Acstmh57AKoSEkEFNJ = i;
                }
                return this.f2339IPyIQcaNa8aB7drBED[i];
            }
            i2++;
            i3 = i;
            i = this.f2341TCyPEKSzIyweCN5yp1[i];
        }
        return 0.0f;
    }

    public String toString() {
        int i = this.f2345pbVGzGjWvY2LDXC8vo;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f2344lEeR5KfoEr4xU5yHH7; i2++) {
            str = ((str + " -> ") + this.f2339IPyIQcaNa8aB7drBED[i] + " : ") + this.f2338HJFh0TGMpafqLE9haL.f2323zZKhbgvUfsK4AEX3r0[this.f2340KYHag8HRDlnO3X9zmZ[i]];
            i = this.f2341TCyPEKSzIyweCN5yp1[i];
        }
        return str;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public void zZKhbgvUfsK4AEX3r0(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, float f, boolean z) {
        float f2 = f2336e54J8UWNHWALQNixXM;
        if (f <= (-f2) || f >= f2) {
            int i = this.f2345pbVGzGjWvY2LDXC8vo;
            if (i == -1) {
                this.f2345pbVGzGjWvY2LDXC8vo = 0;
                this.f2339IPyIQcaNa8aB7drBED[0] = f;
                this.f2340KYHag8HRDlnO3X9zmZ[0] = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL;
                this.f2341TCyPEKSzIyweCN5yp1[0] = -1;
                pbvgzgjwvy2ldxc8vo.f2353T9PhQIpGRhE4yZDm1C++;
                pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(this.f2346s3fjYDxWOUexjjVgyA);
                this.f2344lEeR5KfoEr4xU5yHH7++;
                if (this.f2342Z9WdNiOsPR0y54zHW4) {
                    return;
                }
                int i2 = this.f2337Acstmh57AKoSEkEFNJ + 1;
                this.f2337Acstmh57AKoSEkEFNJ = i2;
                int[] iArr = this.f2340KYHag8HRDlnO3X9zmZ;
                if (i2 >= iArr.length) {
                    this.f2342Z9WdNiOsPR0y54zHW4 = true;
                    this.f2337Acstmh57AKoSEkEFNJ = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f2344lEeR5KfoEr4xU5yHH7; i4++) {
                int i5 = this.f2340KYHag8HRDlnO3X9zmZ[i];
                int i6 = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL;
                if (i5 == i6) {
                    float[] fArr = this.f2339IPyIQcaNa8aB7drBED;
                    float f3 = fArr[i] + f;
                    float f4 = f2336e54J8UWNHWALQNixXM;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f2345pbVGzGjWvY2LDXC8vo) {
                            this.f2345pbVGzGjWvY2LDXC8vo = this.f2341TCyPEKSzIyweCN5yp1[i];
                        } else {
                            int[] iArr2 = this.f2341TCyPEKSzIyweCN5yp1;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL(this.f2346s3fjYDxWOUexjjVgyA);
                        }
                        if (this.f2342Z9WdNiOsPR0y54zHW4) {
                            this.f2337Acstmh57AKoSEkEFNJ = i;
                        }
                        pbvgzgjwvy2ldxc8vo.f2353T9PhQIpGRhE4yZDm1C--;
                        this.f2344lEeR5KfoEr4xU5yHH7--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f2341TCyPEKSzIyweCN5yp1[i];
            }
            int length = this.f2337Acstmh57AKoSEkEFNJ;
            int i7 = length + 1;
            if (this.f2342Z9WdNiOsPR0y54zHW4) {
                int[] iArr3 = this.f2340KYHag8HRDlnO3X9zmZ;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f2340KYHag8HRDlnO3X9zmZ;
            if (length >= iArr4.length && this.f2344lEeR5KfoEr4xU5yHH7 < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f2340KYHag8HRDlnO3X9zmZ;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f2340KYHag8HRDlnO3X9zmZ;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f2347zZKhbgvUfsK4AEX3r0 * 2;
                this.f2347zZKhbgvUfsK4AEX3r0 = i9;
                this.f2342Z9WdNiOsPR0y54zHW4 = false;
                this.f2337Acstmh57AKoSEkEFNJ = length - 1;
                this.f2339IPyIQcaNa8aB7drBED = Arrays.copyOf(this.f2339IPyIQcaNa8aB7drBED, i9);
                this.f2340KYHag8HRDlnO3X9zmZ = Arrays.copyOf(this.f2340KYHag8HRDlnO3X9zmZ, this.f2347zZKhbgvUfsK4AEX3r0);
                this.f2341TCyPEKSzIyweCN5yp1 = Arrays.copyOf(this.f2341TCyPEKSzIyweCN5yp1, this.f2347zZKhbgvUfsK4AEX3r0);
            }
            this.f2340KYHag8HRDlnO3X9zmZ[length] = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL;
            this.f2339IPyIQcaNa8aB7drBED[length] = f;
            int[] iArr7 = this.f2341TCyPEKSzIyweCN5yp1;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.f2345pbVGzGjWvY2LDXC8vo;
                this.f2345pbVGzGjWvY2LDXC8vo = length;
            }
            pbvgzgjwvy2ldxc8vo.f2353T9PhQIpGRhE4yZDm1C++;
            pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(this.f2346s3fjYDxWOUexjjVgyA);
            this.f2344lEeR5KfoEr4xU5yHH7++;
            if (!this.f2342Z9WdNiOsPR0y54zHW4) {
                this.f2337Acstmh57AKoSEkEFNJ++;
            }
            int i10 = this.f2337Acstmh57AKoSEkEFNJ;
            int[] iArr8 = this.f2340KYHag8HRDlnO3X9zmZ;
            if (i10 >= iArr8.length) {
                this.f2342Z9WdNiOsPR0y54zHW4 = true;
                this.f2337Acstmh57AKoSEkEFNJ = iArr8.length - 1;
            }
        }
    }
}
