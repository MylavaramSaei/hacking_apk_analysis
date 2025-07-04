package aPyGSIylzVNKPT1Bls;

import aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class IPyIQcaNa8aB7drBED extends aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int f2324Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public pbVGzGjWvY2LDXC8vo[] f2325IPyIQcaNa8aB7drBED;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f2326TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public s3fjYDxWOUexjjVgyA f2327Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f2328e54J8UWNHWALQNixXM;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public pbVGzGjWvY2LDXC8vo[] f2329pbVGzGjWvY2LDXC8vo;

    public class lEeR5KfoEr4xU5yHH7 implements Comparator {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // java.util.Comparator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public int compare(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo2) {
            return pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL - pbvgzgjwvy2ldxc8vo2.f2350HJFh0TGMpafqLE9haL;
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Comparable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public pbVGzGjWvY2LDXC8vo f2332lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public IPyIQcaNa8aB7drBED f2333s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
            this.f2333s3fjYDxWOUexjjVgyA = iPyIQcaNa8aB7drBED;
        }

        public final boolean HJFh0TGMpafqLE9haL() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f2332lEeR5KfoEr4xU5yHH7.f2360pbVGzGjWvY2LDXC8vo[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f2332lEeR5KfoEr4xU5yHH7.f2350HJFh0TGMpafqLE9haL - ((pbVGzGjWvY2LDXC8vo) obj).f2350HJFh0TGMpafqLE9haL;
        }

        public void husNiw3snxdgZPAGJm() {
            Arrays.fill(this.f2332lEeR5KfoEr4xU5yHH7.f2360pbVGzGjWvY2LDXC8vo, 0.0f);
        }

        public boolean lEeR5KfoEr4xU5yHH7(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, float f) {
            boolean z = true;
            if (!this.f2332lEeR5KfoEr4xU5yHH7.f2359lEeR5KfoEr4xU5yHH7) {
                for (int i = 0; i < 9; i++) {
                    float f2 = pbvgzgjwvy2ldxc8vo.f2360pbVGzGjWvY2LDXC8vo[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f2332lEeR5KfoEr4xU5yHH7.f2360pbVGzGjWvY2LDXC8vo[i] = f3;
                    } else {
                        this.f2332lEeR5KfoEr4xU5yHH7.f2360pbVGzGjWvY2LDXC8vo[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f2332lEeR5KfoEr4xU5yHH7.f2360pbVGzGjWvY2LDXC8vo;
                float f4 = fArr[i2] + (pbvgzgjwvy2ldxc8vo.f2360pbVGzGjWvY2LDXC8vo[i2] * f);
                fArr[i2] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.f2332lEeR5KfoEr4xU5yHH7.f2360pbVGzGjWvY2LDXC8vo[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                IPyIQcaNa8aB7drBED.this.W3RZ2dTDKrKpS5Mxdk(this.f2332lEeR5KfoEr4xU5yHH7);
            }
            return false;
        }

        public void s3fjYDxWOUexjjVgyA(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
            this.f2332lEeR5KfoEr4xU5yHH7 = pbvgzgjwvy2ldxc8vo;
        }

        public String toString() {
            String str = "[ ";
            if (this.f2332lEeR5KfoEr4xU5yHH7 != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f2332lEeR5KfoEr4xU5yHH7.f2360pbVGzGjWvY2LDXC8vo[i] + " ";
                }
            }
            return str + "] " + this.f2332lEeR5KfoEr4xU5yHH7;
        }

        public final boolean zZKhbgvUfsK4AEX3r0(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = pbvgzgjwvy2ldxc8vo.f2360pbVGzGjWvY2LDXC8vo[i];
                float f2 = this.f2332lEeR5KfoEr4xU5yHH7.f2360pbVGzGjWvY2LDXC8vo[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }
    }

    public IPyIQcaNa8aB7drBED(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        super(hJFh0TGMpafqLE9haL);
        this.f2326TCyPEKSzIyweCN5yp1 = 128;
        this.f2325IPyIQcaNa8aB7drBED = new pbVGzGjWvY2LDXC8vo[128];
        this.f2329pbVGzGjWvY2LDXC8vo = new pbVGzGjWvY2LDXC8vo[128];
        this.f2324Acstmh57AKoSEkEFNJ = 0;
        this.f2327Z9WdNiOsPR0y54zHW4 = new s3fjYDxWOUexjjVgyA(this);
        this.f2328e54J8UWNHWALQNixXM = hJFh0TGMpafqLE9haL;
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA, aPyGSIylzVNKPT1Bls.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7
    public void HJFh0TGMpafqLE9haL(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        this.f2327Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA(pbvgzgjwvy2ldxc8vo);
        this.f2327Z9WdNiOsPR0y54zHW4.husNiw3snxdgZPAGJm();
        pbvgzgjwvy2ldxc8vo.f2360pbVGzGjWvY2LDXC8vo[pbvgzgjwvy2ldxc8vo.f2358husNiw3snxdgZPAGJm] = 1.0f;
        tXWeW0sqVddf7ZBflq(pbvgzgjwvy2ldxc8vo);
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
    public void OUd9THiLjZndMj0qdF(aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, boolean z) {
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = s3fjydxwouexjjvgya.f2372lEeR5KfoEr4xU5yHH7;
        if (pbvgzgjwvy2ldxc8vo == null) {
            return;
        }
        s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = s3fjydxwouexjjvgya.f2371husNiw3snxdgZPAGJm;
        int iZ9WdNiOsPR0y54zHW4 = leer5kfoer4xu5yhh7.Z9WdNiOsPR0y54zHW4();
        for (int i = 0; i < iZ9WdNiOsPR0y54zHW4; i++) {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ = leer5kfoer4xu5yhh7.KYHag8HRDlnO3X9zmZ(i);
            float fLEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(i);
            this.f2327Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA(pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ);
            if (this.f2327Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(pbvgzgjwvy2ldxc8vo, fLEeR5KfoEr4xU5yHH7)) {
                tXWeW0sqVddf7ZBflq(pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ);
            }
            this.f2373s3fjYDxWOUexjjVgyA += s3fjydxwouexjjvgya.f2373s3fjYDxWOUexjjVgyA * fLEeR5KfoEr4xU5yHH7;
        }
        W3RZ2dTDKrKpS5Mxdk(pbvgzgjwvy2ldxc8vo);
    }

    public final void W3RZ2dTDKrKpS5Mxdk(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        int i = 0;
        while (i < this.f2324Acstmh57AKoSEkEFNJ) {
            if (this.f2325IPyIQcaNa8aB7drBED[i] == pbvgzgjwvy2ldxc8vo) {
                while (true) {
                    int i2 = this.f2324Acstmh57AKoSEkEFNJ;
                    if (i >= i2 - 1) {
                        this.f2324Acstmh57AKoSEkEFNJ = i2 - 1;
                        pbvgzgjwvy2ldxc8vo.f2359lEeR5KfoEr4xU5yHH7 = false;
                        return;
                    } else {
                        pbVGzGjWvY2LDXC8vo[] pbvgzgjwvy2ldxc8voArr = this.f2325IPyIQcaNa8aB7drBED;
                        int i3 = i + 1;
                        pbvgzgjwvy2ldxc8voArr[i] = pbvgzgjwvy2ldxc8voArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA, aPyGSIylzVNKPT1Bls.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7
    public void clear() {
        this.f2324Acstmh57AKoSEkEFNJ = 0;
        this.f2373s3fjYDxWOUexjjVgyA = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA, aPyGSIylzVNKPT1Bls.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aPyGSIylzVNKPT1Bls.pbVGzGjWvY2LDXC8vo s3fjYDxWOUexjjVgyA(aPyGSIylzVNKPT1Bls.zZKhbgvUfsK4AEX3r0 r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f2324Acstmh57AKoSEkEFNJ
            if (r0 >= r2) goto L30
            aPyGSIylzVNKPT1Bls.pbVGzGjWvY2LDXC8vo[] r2 = r4.f2325IPyIQcaNa8aB7drBED
            r2 = r2[r0]
            int r3 = r2.f2350HJFh0TGMpafqLE9haL
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2d
        L12:
            aPyGSIylzVNKPT1Bls.IPyIQcaNa8aB7drBED$s3fjYDxWOUexjjVgyA r3 = r4.f2327Z9WdNiOsPR0y54zHW4
            r3.s3fjYDxWOUexjjVgyA(r2)
            aPyGSIylzVNKPT1Bls.IPyIQcaNa8aB7drBED$s3fjYDxWOUexjjVgyA r2 = r4.f2327Z9WdNiOsPR0y54zHW4
            if (r1 != r5) goto L22
            boolean r2 = r2.HJFh0TGMpafqLE9haL()
            if (r2 == 0) goto L2d
            goto L2c
        L22:
            aPyGSIylzVNKPT1Bls.pbVGzGjWvY2LDXC8vo[] r3 = r4.f2325IPyIQcaNa8aB7drBED
            r3 = r3[r1]
            boolean r2 = r2.zZKhbgvUfsK4AEX3r0(r3)
            if (r2 == 0) goto L2d
        L2c:
            r1 = r0
        L2d:
            int r0 = r0 + 1
            goto L3
        L30:
            if (r1 != r5) goto L34
            r5 = 0
            return r5
        L34:
            aPyGSIylzVNKPT1Bls.pbVGzGjWvY2LDXC8vo[] r5 = r4.f2325IPyIQcaNa8aB7drBED
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: aPyGSIylzVNKPT1Bls.IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA(aPyGSIylzVNKPT1Bls.zZKhbgvUfsK4AEX3r0, boolean[]):aPyGSIylzVNKPT1Bls.pbVGzGjWvY2LDXC8vo");
    }

    public final void tXWeW0sqVddf7ZBflq(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        int i;
        int i2 = this.f2324Acstmh57AKoSEkEFNJ + 1;
        pbVGzGjWvY2LDXC8vo[] pbvgzgjwvy2ldxc8voArr = this.f2325IPyIQcaNa8aB7drBED;
        if (i2 > pbvgzgjwvy2ldxc8voArr.length) {
            pbVGzGjWvY2LDXC8vo[] pbvgzgjwvy2ldxc8voArr2 = (pbVGzGjWvY2LDXC8vo[]) Arrays.copyOf(pbvgzgjwvy2ldxc8voArr, pbvgzgjwvy2ldxc8voArr.length * 2);
            this.f2325IPyIQcaNa8aB7drBED = pbvgzgjwvy2ldxc8voArr2;
            this.f2329pbVGzGjWvY2LDXC8vo = (pbVGzGjWvY2LDXC8vo[]) Arrays.copyOf(pbvgzgjwvy2ldxc8voArr2, pbvgzgjwvy2ldxc8voArr2.length * 2);
        }
        pbVGzGjWvY2LDXC8vo[] pbvgzgjwvy2ldxc8voArr3 = this.f2325IPyIQcaNa8aB7drBED;
        int i3 = this.f2324Acstmh57AKoSEkEFNJ;
        pbvgzgjwvy2ldxc8voArr3[i3] = pbvgzgjwvy2ldxc8vo;
        int i4 = i3 + 1;
        this.f2324Acstmh57AKoSEkEFNJ = i4;
        if (i4 > 1 && pbvgzgjwvy2ldxc8voArr3[i3].f2350HJFh0TGMpafqLE9haL > pbvgzgjwvy2ldxc8vo.f2350HJFh0TGMpafqLE9haL) {
            int i5 = 0;
            while (true) {
                i = this.f2324Acstmh57AKoSEkEFNJ;
                if (i5 >= i) {
                    break;
                }
                this.f2329pbVGzGjWvY2LDXC8vo[i5] = this.f2325IPyIQcaNa8aB7drBED[i5];
                i5++;
            }
            Arrays.sort(this.f2329pbVGzGjWvY2LDXC8vo, 0, i, new lEeR5KfoEr4xU5yHH7());
            for (int i6 = 0; i6 < this.f2324Acstmh57AKoSEkEFNJ; i6++) {
                this.f2325IPyIQcaNa8aB7drBED[i6] = this.f2329pbVGzGjWvY2LDXC8vo[i6];
            }
        }
        pbvgzgjwvy2ldxc8vo.f2359lEeR5KfoEr4xU5yHH7 = true;
        pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(this);
    }

    @Override // aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
    public String toString() {
        String str = " goal -> (" + this.f2373s3fjYDxWOUexjjVgyA + ") : ";
        for (int i = 0; i < this.f2324Acstmh57AKoSEkEFNJ; i++) {
            this.f2327Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA(this.f2325IPyIQcaNa8aB7drBED[i]);
            str = str + this.f2327Z9WdNiOsPR0y54zHW4 + " ";
        }
        return str;
    }
}
