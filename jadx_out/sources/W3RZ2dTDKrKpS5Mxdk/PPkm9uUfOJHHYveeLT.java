package W3RZ2dTDKrKpS5Mxdk;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public class PPkm9uUfOJHHYveeLT {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final float[] f1836lEeR5KfoEr4xU5yHH7 = new float[20];

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final long[] f1837s3fjYDxWOUexjjVgyA = new long[20];

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public float f1834HJFh0TGMpafqLE9haL = 0.0f;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f1838zZKhbgvUfsK4AEX3r0 = 0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f1835husNiw3snxdgZPAGJm = 0;

    public static float KYHag8HRDlnO3X9zmZ(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    public void HJFh0TGMpafqLE9haL(int i, float f) {
        float fAbs;
        float fHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm() * i;
        this.f1834HJFh0TGMpafqLE9haL = fHusNiw3snxdgZPAGJm;
        if (fHusNiw3snxdgZPAGJm < (-Math.abs(f))) {
            fAbs = -Math.abs(f);
        } else if (this.f1834HJFh0TGMpafqLE9haL <= Math.abs(f)) {
            return;
        } else {
            fAbs = Math.abs(f);
        }
        this.f1834HJFh0TGMpafqLE9haL = fAbs;
    }

    public final float husNiw3snxdgZPAGJm() {
        long[] jArr;
        long j;
        int i = this.f1838zZKhbgvUfsK4AEX3r0;
        if (i < 2) {
            return 0.0f;
        }
        int i2 = this.f1835husNiw3snxdgZPAGJm;
        int i3 = ((i2 + 20) - (i - 1)) % 20;
        long j2 = this.f1837s3fjYDxWOUexjjVgyA[i2];
        while (true) {
            jArr = this.f1837s3fjYDxWOUexjjVgyA;
            j = jArr[i3];
            if (j2 - j <= 100) {
                break;
            }
            this.f1838zZKhbgvUfsK4AEX3r0--;
            i3 = (i3 + 1) % 20;
        }
        int i4 = this.f1838zZKhbgvUfsK4AEX3r0;
        if (i4 < 2) {
            return 0.0f;
        }
        if (i4 == 2) {
            int i5 = (i3 + 1) % 20;
            if (j == jArr[i5]) {
                return 0.0f;
            }
            return this.f1836lEeR5KfoEr4xU5yHH7[i5] / (r2 - j);
        }
        float fAbs = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f1838zZKhbgvUfsK4AEX3r0 - 1; i7++) {
            int i8 = i7 + i3;
            long[] jArr2 = this.f1837s3fjYDxWOUexjjVgyA;
            long j3 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j3) {
                i6++;
                float fKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(fAbs);
                float f = this.f1836lEeR5KfoEr4xU5yHH7[i9] / (this.f1837s3fjYDxWOUexjjVgyA[i9] - j3);
                fAbs += (f - fKYHag8HRDlnO3X9zmZ) * Math.abs(f);
                if (i6 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return KYHag8HRDlnO3X9zmZ(fAbs);
    }

    public void lEeR5KfoEr4xU5yHH7(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f1838zZKhbgvUfsK4AEX3r0 != 0 && eventTime - this.f1837s3fjYDxWOUexjjVgyA[this.f1835husNiw3snxdgZPAGJm] > 40) {
            s3fjYDxWOUexjjVgyA();
        }
        int i = (this.f1835husNiw3snxdgZPAGJm + 1) % 20;
        this.f1835husNiw3snxdgZPAGJm = i;
        int i2 = this.f1838zZKhbgvUfsK4AEX3r0;
        if (i2 != 20) {
            this.f1838zZKhbgvUfsK4AEX3r0 = i2 + 1;
        }
        this.f1836lEeR5KfoEr4xU5yHH7[i] = motionEvent.getAxisValue(26);
        this.f1837s3fjYDxWOUexjjVgyA[this.f1835husNiw3snxdgZPAGJm] = eventTime;
    }

    public final void s3fjYDxWOUexjjVgyA() {
        this.f1838zZKhbgvUfsK4AEX3r0 = 0;
        this.f1834HJFh0TGMpafqLE9haL = 0.0f;
    }

    public float zZKhbgvUfsK4AEX3r0(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.f1834HJFh0TGMpafqLE9haL;
    }
}
