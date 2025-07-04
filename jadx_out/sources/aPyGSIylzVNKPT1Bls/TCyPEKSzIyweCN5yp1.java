package aPyGSIylzVNKPT1Bls;

/* loaded from: classes.dex */
public class TCyPEKSzIyweCN5yp1 implements KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object[] f2334lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2335s3fjYDxWOUexjjVgyA;

    public TCyPEKSzIyweCN5yp1(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2334lEeR5KfoEr4xU5yHH7 = new Object[i];
    }

    @Override // aPyGSIylzVNKPT1Bls.KYHag8HRDlnO3X9zmZ
    public void HJFh0TGMpafqLE9haL(Object[] objArr, int i) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f2335s3fjYDxWOUexjjVgyA;
            Object[] objArr2 = this.f2334lEeR5KfoEr4xU5yHH7;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f2335s3fjYDxWOUexjjVgyA = i3 + 1;
            }
        }
    }

    @Override // aPyGSIylzVNKPT1Bls.KYHag8HRDlnO3X9zmZ
    public boolean lEeR5KfoEr4xU5yHH7(Object obj) {
        int i = this.f2335s3fjYDxWOUexjjVgyA;
        Object[] objArr = this.f2334lEeR5KfoEr4xU5yHH7;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.f2335s3fjYDxWOUexjjVgyA = i + 1;
        return true;
    }

    @Override // aPyGSIylzVNKPT1Bls.KYHag8HRDlnO3X9zmZ
    public Object s3fjYDxWOUexjjVgyA() {
        int i = this.f2335s3fjYDxWOUexjjVgyA;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f2334lEeR5KfoEr4xU5yHH7;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f2335s3fjYDxWOUexjjVgyA = i - 1;
        return obj;
    }
}
