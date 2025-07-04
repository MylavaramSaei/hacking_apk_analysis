package aPyGSIylzVNKPT1Bls;

import aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Acstmh57AKoSEkEFNJ implements s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 {

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public static float f2306hoXrIDAFrSwfShk8da = 0.001f;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f2311T9PhQIpGRhE4yZDm1C;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f2314e54J8UWNHWALQNixXM;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f2316lEeR5KfoEr4xU5yHH7 = -1;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2318s3fjYDxWOUexjjVgyA = 16;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f2308HJFh0TGMpafqLE9haL = 16;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int[] f2319zZKhbgvUfsK4AEX3r0 = new int[16];

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int[] f2315husNiw3snxdgZPAGJm = new int[16];

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int[] f2310KYHag8HRDlnO3X9zmZ = new int[16];

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public float[] f2312TCyPEKSzIyweCN5yp1 = new float[16];

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int[] f2309IPyIQcaNa8aB7drBED = new int[16];

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int[] f2317pbVGzGjWvY2LDXC8vo = new int[16];

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int f2307Acstmh57AKoSEkEFNJ = 0;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public int f2313Z9WdNiOsPR0y54zHW4 = -1;

    public Acstmh57AKoSEkEFNJ(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f2314e54J8UWNHWALQNixXM = s3fjydxwouexjjvgya;
        this.f2311T9PhQIpGRhE4yZDm1C = hJFh0TGMpafqLE9haL;
        clear();
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public void Acstmh57AKoSEkEFNJ() {
        int i = this.f2307Acstmh57AKoSEkEFNJ;
        int i2 = this.f2313Z9WdNiOsPR0y54zHW4;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2312TCyPEKSzIyweCN5yp1;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f2317pbVGzGjWvY2LDXC8vo[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public float HJFh0TGMpafqLE9haL(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        int iOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(pbvgzgjwvy2ldxc8vo);
        if (iOANkd3mP6AYvwbNLJM != -1) {
            return this.f2312TCyPEKSzIyweCN5yp1[iOANkd3mP6AYvwbNLJM];
        }
        return 0.0f;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public boolean IPyIQcaNa8aB7drBED(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        return OANkd3mP6AYvwbNLJM(pbvgzgjwvy2ldxc8vo) != -1;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public pbVGzGjWvY2LDXC8vo KYHag8HRDlnO3X9zmZ(int i) {
        int i2 = this.f2307Acstmh57AKoSEkEFNJ;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f2313Z9WdNiOsPR0y54zHW4;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f2311T9PhQIpGRhE4yZDm1C.f2323zZKhbgvUfsK4AEX3r0[this.f2310KYHag8HRDlnO3X9zmZ[i3]];
            }
            i3 = this.f2317pbVGzGjWvY2LDXC8vo[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    public int OANkd3mP6AYvwbNLJM(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        if (this.f2307Acstmh57AKoSEkEFNJ == 0) {
            return -1;
        }
        int i = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL;
        int i2 = this.f2319zZKhbgvUfsK4AEX3r0[i % this.f2308HJFh0TGMpafqLE9haL];
        if (i2 == -1) {
            return -1;
        }
        if (this.f2310KYHag8HRDlnO3X9zmZ[i2] == i) {
            return i2;
        }
        do {
            i2 = this.f2315husNiw3snxdgZPAGJm[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.f2310KYHag8HRDlnO3X9zmZ[i2] != i);
        if (i2 != -1 && this.f2310KYHag8HRDlnO3X9zmZ[i2] == i) {
            return i2;
        }
        return -1;
    }

    public final void T9PhQIpGRhE4yZDm1C(int i, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, float f) {
        this.f2310KYHag8HRDlnO3X9zmZ[i] = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL;
        this.f2312TCyPEKSzIyweCN5yp1[i] = f;
        this.f2309IPyIQcaNa8aB7drBED[i] = -1;
        this.f2317pbVGzGjWvY2LDXC8vo[i] = -1;
        pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(this.f2314e54J8UWNHWALQNixXM);
        pbvgzgjwvy2ldxc8vo.f2353T9PhQIpGRhE4yZDm1C++;
        this.f2307Acstmh57AKoSEkEFNJ++;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public void TCyPEKSzIyweCN5yp1(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, float f) {
        float f2 = f2306hoXrIDAFrSwfShk8da;
        if (f > (-f2) && f < f2) {
            s3fjYDxWOUexjjVgyA(pbvgzgjwvy2ldxc8vo, true);
            return;
        }
        if (this.f2307Acstmh57AKoSEkEFNJ == 0) {
            T9PhQIpGRhE4yZDm1C(0, pbvgzgjwvy2ldxc8vo, f);
            e54J8UWNHWALQNixXM(pbvgzgjwvy2ldxc8vo, 0);
            this.f2313Z9WdNiOsPR0y54zHW4 = 0;
            return;
        }
        int iOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(pbvgzgjwvy2ldxc8vo);
        if (iOANkd3mP6AYvwbNLJM != -1) {
            this.f2312TCyPEKSzIyweCN5yp1[iOANkd3mP6AYvwbNLJM] = f;
            return;
        }
        if (this.f2307Acstmh57AKoSEkEFNJ + 1 >= this.f2318s3fjYDxWOUexjjVgyA) {
            aPyGSIylzVNKPT1Bls();
        }
        int i = this.f2307Acstmh57AKoSEkEFNJ;
        int i2 = this.f2313Z9WdNiOsPR0y54zHW4;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f2310KYHag8HRDlnO3X9zmZ[i2];
            int i6 = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL;
            if (i5 == i6) {
                this.f2312TCyPEKSzIyweCN5yp1[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.f2317pbVGzGjWvY2LDXC8vo[i2];
            if (i2 == -1) {
                break;
            }
        }
        zaq8hOURtfwbcX17cG(i3, pbvgzgjwvy2ldxc8vo, f);
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public int Z9WdNiOsPR0y54zHW4() {
        return this.f2307Acstmh57AKoSEkEFNJ;
    }

    public final void aPyGSIylzVNKPT1Bls() {
        int i = this.f2318s3fjYDxWOUexjjVgyA * 2;
        this.f2310KYHag8HRDlnO3X9zmZ = Arrays.copyOf(this.f2310KYHag8HRDlnO3X9zmZ, i);
        this.f2312TCyPEKSzIyweCN5yp1 = Arrays.copyOf(this.f2312TCyPEKSzIyweCN5yp1, i);
        this.f2309IPyIQcaNa8aB7drBED = Arrays.copyOf(this.f2309IPyIQcaNa8aB7drBED, i);
        this.f2317pbVGzGjWvY2LDXC8vo = Arrays.copyOf(this.f2317pbVGzGjWvY2LDXC8vo, i);
        this.f2315husNiw3snxdgZPAGJm = Arrays.copyOf(this.f2315husNiw3snxdgZPAGJm, i);
        for (int i2 = this.f2318s3fjYDxWOUexjjVgyA; i2 < i; i2++) {
            this.f2310KYHag8HRDlnO3X9zmZ[i2] = -1;
            this.f2315husNiw3snxdgZPAGJm[i2] = -1;
        }
        this.f2318s3fjYDxWOUexjjVgyA = i;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public void clear() {
        int i = this.f2307Acstmh57AKoSEkEFNJ;
        for (int i2 = 0; i2 < i; i2++) {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(i2);
            if (pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ != null) {
                pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(this.f2314e54J8UWNHWALQNixXM);
            }
        }
        for (int i3 = 0; i3 < this.f2318s3fjYDxWOUexjjVgyA; i3++) {
            this.f2310KYHag8HRDlnO3X9zmZ[i3] = -1;
            this.f2315husNiw3snxdgZPAGJm[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f2308HJFh0TGMpafqLE9haL; i4++) {
            this.f2319zZKhbgvUfsK4AEX3r0[i4] = -1;
        }
        this.f2307Acstmh57AKoSEkEFNJ = 0;
        this.f2313Z9WdNiOsPR0y54zHW4 = -1;
    }

    public final void e54J8UWNHWALQNixXM(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, int i) {
        int[] iArr;
        int i2 = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL % this.f2308HJFh0TGMpafqLE9haL;
        int[] iArr2 = this.f2319zZKhbgvUfsK4AEX3r0;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f2315husNiw3snxdgZPAGJm;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.f2315husNiw3snxdgZPAGJm[i] = -1;
    }

    public final int hoXrIDAFrSwfShk8da() {
        for (int i = 0; i < this.f2318s3fjYDxWOUexjjVgyA; i++) {
            if (this.f2310KYHag8HRDlnO3X9zmZ[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public float husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, boolean z) {
        float fHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(s3fjydxwouexjjvgya.f2372lEeR5KfoEr4xU5yHH7);
        s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgya.f2372lEeR5KfoEr4xU5yHH7, z);
        Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = (Acstmh57AKoSEkEFNJ) s3fjydxwouexjjvgya.f2371husNiw3snxdgZPAGJm;
        int iZ9WdNiOsPR0y54zHW4 = acstmh57AKoSEkEFNJ.Z9WdNiOsPR0y54zHW4();
        int i = 0;
        int i2 = 0;
        while (i < iZ9WdNiOsPR0y54zHW4) {
            int i3 = acstmh57AKoSEkEFNJ.f2310KYHag8HRDlnO3X9zmZ[i2];
            if (i3 != -1) {
                zZKhbgvUfsK4AEX3r0(this.f2311T9PhQIpGRhE4yZDm1C.f2323zZKhbgvUfsK4AEX3r0[i3], acstmh57AKoSEkEFNJ.f2312TCyPEKSzIyweCN5yp1[i2] * fHJFh0TGMpafqLE9haL, z);
                i++;
            }
            i2++;
        }
        return fHJFh0TGMpafqLE9haL;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public float lEeR5KfoEr4xU5yHH7(int i) {
        int i2 = this.f2307Acstmh57AKoSEkEFNJ;
        int i3 = this.f2313Z9WdNiOsPR0y54zHW4;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f2312TCyPEKSzIyweCN5yp1[i3];
            }
            i3 = this.f2317pbVGzGjWvY2LDXC8vo[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public void pbVGzGjWvY2LDXC8vo(float f) {
        int i = this.f2307Acstmh57AKoSEkEFNJ;
        int i2 = this.f2313Z9WdNiOsPR0y54zHW4;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2312TCyPEKSzIyweCN5yp1;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f2317pbVGzGjWvY2LDXC8vo[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public float s3fjYDxWOUexjjVgyA(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, boolean z) {
        int iOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(pbvgzgjwvy2ldxc8vo);
        if (iOANkd3mP6AYvwbNLJM == -1) {
            return 0.0f;
        }
        sTkWmhpZ5b1ArQIw4K(pbvgzgjwvy2ldxc8vo);
        float f = this.f2312TCyPEKSzIyweCN5yp1[iOANkd3mP6AYvwbNLJM];
        if (this.f2313Z9WdNiOsPR0y54zHW4 == iOANkd3mP6AYvwbNLJM) {
            this.f2313Z9WdNiOsPR0y54zHW4 = this.f2317pbVGzGjWvY2LDXC8vo[iOANkd3mP6AYvwbNLJM];
        }
        this.f2310KYHag8HRDlnO3X9zmZ[iOANkd3mP6AYvwbNLJM] = -1;
        int[] iArr = this.f2309IPyIQcaNa8aB7drBED;
        int i = iArr[iOANkd3mP6AYvwbNLJM];
        if (i != -1) {
            int[] iArr2 = this.f2317pbVGzGjWvY2LDXC8vo;
            iArr2[i] = iArr2[iOANkd3mP6AYvwbNLJM];
        }
        int i2 = this.f2317pbVGzGjWvY2LDXC8vo[iOANkd3mP6AYvwbNLJM];
        if (i2 != -1) {
            iArr[i2] = iArr[iOANkd3mP6AYvwbNLJM];
        }
        this.f2307Acstmh57AKoSEkEFNJ--;
        pbvgzgjwvy2ldxc8vo.f2353T9PhQIpGRhE4yZDm1C--;
        if (z) {
            pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL(this.f2314e54J8UWNHWALQNixXM);
        }
        return f;
    }

    public final void sTkWmhpZ5b1ArQIw4K(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        int[] iArr;
        int i;
        int i2 = pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL;
        int i3 = i2 % this.f2308HJFh0TGMpafqLE9haL;
        int[] iArr2 = this.f2319zZKhbgvUfsK4AEX3r0;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f2310KYHag8HRDlnO3X9zmZ[i4] == i2) {
            int[] iArr3 = this.f2315husNiw3snxdgZPAGJm;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f2315husNiw3snxdgZPAGJm;
            i = iArr[i4];
            if (i == -1 || this.f2310KYHag8HRDlnO3X9zmZ[i] == i2) {
                break;
            } else {
                i4 = i;
            }
        }
        if (i == -1 || this.f2310KYHag8HRDlnO3X9zmZ[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i = this.f2307Acstmh57AKoSEkEFNJ;
        for (int i2 = 0; i2 < i; i2++) {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(i2);
            if (pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ != null) {
                String str2 = str + pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ + " = " + lEeR5KfoEr4xU5yHH7(i2) + " ";
                int iOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ);
                String str3 = str2 + "[p: ";
                if (this.f2309IPyIQcaNa8aB7drBED[iOANkd3mP6AYvwbNLJM] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f2311T9PhQIpGRhE4yZDm1C.f2323zZKhbgvUfsK4AEX3r0[this.f2310KYHag8HRDlnO3X9zmZ[this.f2309IPyIQcaNa8aB7drBED[iOANkd3mP6AYvwbNLJM]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f2317pbVGzGjWvY2LDXC8vo[iOANkd3mP6AYvwbNLJM] != -1 ? str4 + this.f2311T9PhQIpGRhE4yZDm1C.f2323zZKhbgvUfsK4AEX3r0[this.f2310KYHag8HRDlnO3X9zmZ[this.f2317pbVGzGjWvY2LDXC8vo[iOANkd3mP6AYvwbNLJM]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
    public void zZKhbgvUfsK4AEX3r0(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, float f, boolean z) {
        float f2 = f2306hoXrIDAFrSwfShk8da;
        if (f <= (-f2) || f >= f2) {
            int iOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(pbvgzgjwvy2ldxc8vo);
            if (iOANkd3mP6AYvwbNLJM == -1) {
                TCyPEKSzIyweCN5yp1(pbvgzgjwvy2ldxc8vo, f);
                return;
            }
            float[] fArr = this.f2312TCyPEKSzIyweCN5yp1;
            float f3 = fArr[iOANkd3mP6AYvwbNLJM] + f;
            fArr[iOANkd3mP6AYvwbNLJM] = f3;
            float f4 = f2306hoXrIDAFrSwfShk8da;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[iOANkd3mP6AYvwbNLJM] = 0.0f;
            s3fjYDxWOUexjjVgyA(pbvgzgjwvy2ldxc8vo, z);
        }
    }

    public final void zaq8hOURtfwbcX17cG(int i, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, float f) {
        int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da();
        T9PhQIpGRhE4yZDm1C(iHoXrIDAFrSwfShk8da, pbvgzgjwvy2ldxc8vo, f);
        if (i != -1) {
            this.f2309IPyIQcaNa8aB7drBED[iHoXrIDAFrSwfShk8da] = i;
            int[] iArr = this.f2317pbVGzGjWvY2LDXC8vo;
            iArr[iHoXrIDAFrSwfShk8da] = iArr[i];
            iArr[i] = iHoXrIDAFrSwfShk8da;
        } else {
            this.f2309IPyIQcaNa8aB7drBED[iHoXrIDAFrSwfShk8da] = -1;
            if (this.f2307Acstmh57AKoSEkEFNJ > 0) {
                this.f2317pbVGzGjWvY2LDXC8vo[iHoXrIDAFrSwfShk8da] = this.f2313Z9WdNiOsPR0y54zHW4;
                this.f2313Z9WdNiOsPR0y54zHW4 = iHoXrIDAFrSwfShk8da;
            } else {
                this.f2317pbVGzGjWvY2LDXC8vo[iHoXrIDAFrSwfShk8da] = -1;
            }
        }
        int i2 = this.f2317pbVGzGjWvY2LDXC8vo[iHoXrIDAFrSwfShk8da];
        if (i2 != -1) {
            this.f2309IPyIQcaNa8aB7drBED[i2] = iHoXrIDAFrSwfShk8da;
        }
        e54J8UWNHWALQNixXM(pbvgzgjwvy2ldxc8vo, iHoXrIDAFrSwfShk8da);
    }
}
