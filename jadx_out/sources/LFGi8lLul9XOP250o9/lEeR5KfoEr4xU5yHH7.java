package LFGi8lLul9XOP250o9;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f913HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final float f914IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public float f915KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final int f916TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public float f917husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f918lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public float f919s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f920zZKhbgvUfsK4AEX3r0;

    public lEeR5KfoEr4xU5yHH7(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        this.f918lEeR5KfoEr4xU5yHH7 = i;
        this.f919s3fjYDxWOUexjjVgyA = ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(f, f2, f3);
        this.f913HJFh0TGMpafqLE9haL = i2;
        this.f917husNiw3snxdgZPAGJm = f4;
        this.f920zZKhbgvUfsK4AEX3r0 = i3;
        this.f915KYHag8HRDlnO3X9zmZ = f5;
        this.f916TCyPEKSzIyweCN5yp1 = i4;
        zZKhbgvUfsK4AEX3r0(f6, f2, f3, f5);
        this.f914IPyIQcaNa8aB7drBED = s3fjYDxWOUexjjVgyA(f5);
    }

    public static lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = i5;
                    int i7 = length2;
                    int i8 = i3;
                    int i9 = length;
                    lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = new lEeR5KfoEr4xU5yHH7(i, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (leer5kfoer4xu5yhh7 == null || leer5kfoer4xu5yhh72.f914IPyIQcaNa8aB7drBED < leer5kfoer4xu5yhh7.f914IPyIQcaNa8aB7drBED) {
                        if (leer5kfoer4xu5yhh72.f914IPyIQcaNa8aB7drBED == 0.0f) {
                            return leer5kfoer4xu5yhh72;
                        }
                        leer5kfoer4xu5yhh7 = leer5kfoer4xu5yhh72;
                    }
                    i++;
                    i5 = i6 + 1;
                    length2 = i7;
                    i3 = i8;
                    length = i9;
                }
                i3++;
            }
        }
        return leer5kfoer4xu5yhh7;
    }

    public final float KYHag8HRDlnO3X9zmZ() {
        return (this.f915KYHag8HRDlnO3X9zmZ * this.f916TCyPEKSzIyweCN5yp1) + (this.f917husNiw3snxdgZPAGJm * this.f920zZKhbgvUfsK4AEX3r0) + (this.f919s3fjYDxWOUexjjVgyA * this.f913HJFh0TGMpafqLE9haL);
    }

    public final boolean TCyPEKSzIyweCN5yp1() {
        int i = this.f916TCyPEKSzIyweCN5yp1;
        if (i <= 0 || this.f913HJFh0TGMpafqLE9haL <= 0 || this.f920zZKhbgvUfsK4AEX3r0 <= 0) {
            return i <= 0 || this.f913HJFh0TGMpafqLE9haL <= 0 || this.f915KYHag8HRDlnO3X9zmZ > this.f919s3fjYDxWOUexjjVgyA;
        }
        float f = this.f915KYHag8HRDlnO3X9zmZ;
        float f2 = this.f917husNiw3snxdgZPAGJm;
        return f > f2 && f2 > this.f919s3fjYDxWOUexjjVgyA;
    }

    public int husNiw3snxdgZPAGJm() {
        return this.f913HJFh0TGMpafqLE9haL + this.f920zZKhbgvUfsK4AEX3r0 + this.f916TCyPEKSzIyweCN5yp1;
    }

    public final float lEeR5KfoEr4xU5yHH7(float f, int i, float f2, int i2, int i3) {
        if (i <= 0) {
            f2 = 0.0f;
        }
        float f3 = i2 / 2.0f;
        return (f - ((i + f3) * f2)) / (i3 + f3);
    }

    public final float s3fjYDxWOUexjjVgyA(float f) {
        if (TCyPEKSzIyweCN5yp1()) {
            return Math.abs(f - this.f915KYHag8HRDlnO3X9zmZ) * this.f918lEeR5KfoEr4xU5yHH7;
        }
        return Float.MAX_VALUE;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f918lEeR5KfoEr4xU5yHH7 + ", smallCount=" + this.f913HJFh0TGMpafqLE9haL + ", smallSize=" + this.f919s3fjYDxWOUexjjVgyA + ", mediumCount=" + this.f920zZKhbgvUfsK4AEX3r0 + ", mediumSize=" + this.f917husNiw3snxdgZPAGJm + ", largeCount=" + this.f916TCyPEKSzIyweCN5yp1 + ", largeSize=" + this.f915KYHag8HRDlnO3X9zmZ + ", cost=" + this.f914IPyIQcaNa8aB7drBED + "]";
    }

    public final void zZKhbgvUfsK4AEX3r0(float f, float f2, float f3, float f4) {
        float f5;
        float fKYHag8HRDlnO3X9zmZ = f - KYHag8HRDlnO3X9zmZ();
        int i = this.f913HJFh0TGMpafqLE9haL;
        if (i > 0 && fKYHag8HRDlnO3X9zmZ > 0.0f) {
            float f6 = this.f919s3fjYDxWOUexjjVgyA;
            this.f919s3fjYDxWOUexjjVgyA = f6 + Math.min(fKYHag8HRDlnO3X9zmZ / i, f3 - f6);
        } else if (i > 0 && fKYHag8HRDlnO3X9zmZ < 0.0f) {
            float f7 = this.f919s3fjYDxWOUexjjVgyA;
            this.f919s3fjYDxWOUexjjVgyA = f7 + Math.max(fKYHag8HRDlnO3X9zmZ / i, f2 - f7);
        }
        int i2 = this.f913HJFh0TGMpafqLE9haL;
        float f8 = i2 > 0 ? this.f919s3fjYDxWOUexjjVgyA : 0.0f;
        this.f919s3fjYDxWOUexjjVgyA = f8;
        float fLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(f, i2, f8, this.f920zZKhbgvUfsK4AEX3r0, this.f916TCyPEKSzIyweCN5yp1);
        this.f915KYHag8HRDlnO3X9zmZ = fLEeR5KfoEr4xU5yHH7;
        float f9 = (this.f919s3fjYDxWOUexjjVgyA + fLEeR5KfoEr4xU5yHH7) / 2.0f;
        this.f917husNiw3snxdgZPAGJm = f9;
        int i3 = this.f920zZKhbgvUfsK4AEX3r0;
        if (i3 <= 0 || fLEeR5KfoEr4xU5yHH7 == f4) {
            return;
        }
        float f10 = (f4 - fLEeR5KfoEr4xU5yHH7) * this.f916TCyPEKSzIyweCN5yp1;
        float fMin = Math.min(Math.abs(f10), f9 * 0.1f * i3);
        if (f10 > 0.0f) {
            this.f917husNiw3snxdgZPAGJm -= fMin / this.f920zZKhbgvUfsK4AEX3r0;
            f5 = this.f915KYHag8HRDlnO3X9zmZ + (fMin / this.f916TCyPEKSzIyweCN5yp1);
        } else {
            this.f917husNiw3snxdgZPAGJm += fMin / this.f920zZKhbgvUfsK4AEX3r0;
            f5 = this.f915KYHag8HRDlnO3X9zmZ - (fMin / this.f916TCyPEKSzIyweCN5yp1);
        }
        this.f915KYHag8HRDlnO3X9zmZ = f5;
    }
}
