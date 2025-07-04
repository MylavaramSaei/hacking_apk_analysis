package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public class aPyGSIylzVNKPT1Bls {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f4286lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public lEeR5KfoEr4xU5yHH7 f4287s3fjYDxWOUexjjVgyA = new lEeR5KfoEr4xU5yHH7();

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f4288HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f4289husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4290lEeR5KfoEr4xU5yHH7 = 0;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4291s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f4292zZKhbgvUfsK4AEX3r0;

        public int HJFh0TGMpafqLE9haL(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public void husNiw3snxdgZPAGJm(int i, int i2, int i3, int i4) {
            this.f4291s3fjYDxWOUexjjVgyA = i;
            this.f4288HJFh0TGMpafqLE9haL = i2;
            this.f4292zZKhbgvUfsK4AEX3r0 = i3;
            this.f4289husNiw3snxdgZPAGJm = i4;
        }

        public void lEeR5KfoEr4xU5yHH7(int i) {
            this.f4290lEeR5KfoEr4xU5yHH7 = i | this.f4290lEeR5KfoEr4xU5yHH7;
        }

        public boolean s3fjYDxWOUexjjVgyA() {
            int i = this.f4290lEeR5KfoEr4xU5yHH7;
            if ((i & 7) != 0 && (i & HJFh0TGMpafqLE9haL(this.f4292zZKhbgvUfsK4AEX3r0, this.f4291s3fjYDxWOUexjjVgyA)) == 0) {
                return false;
            }
            int i2 = this.f4290lEeR5KfoEr4xU5yHH7;
            if ((i2 & 112) != 0 && (i2 & (HJFh0TGMpafqLE9haL(this.f4292zZKhbgvUfsK4AEX3r0, this.f4288HJFh0TGMpafqLE9haL) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4290lEeR5KfoEr4xU5yHH7;
            if ((i3 & 1792) != 0 && (i3 & (HJFh0TGMpafqLE9haL(this.f4289husNiw3snxdgZPAGJm, this.f4291s3fjYDxWOUexjjVgyA) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4290lEeR5KfoEr4xU5yHH7;
            return (i4 & 28672) == 0 || (i4 & (HJFh0TGMpafqLE9haL(this.f4289husNiw3snxdgZPAGJm, this.f4288HJFh0TGMpafqLE9haL) << 12)) != 0;
        }

        public void zZKhbgvUfsK4AEX3r0() {
            this.f4290lEeR5KfoEr4xU5yHH7 = 0;
        }
    }

    public interface s3fjYDxWOUexjjVgyA {
        int HJFh0TGMpafqLE9haL();

        int husNiw3snxdgZPAGJm(View view);

        View lEeR5KfoEr4xU5yHH7(int i);

        int s3fjYDxWOUexjjVgyA();

        int zZKhbgvUfsK4AEX3r0(View view);
    }

    public aPyGSIylzVNKPT1Bls(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f4286lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya;
    }

    public View lEeR5KfoEr4xU5yHH7(int i, int i2, int i3, int i4) {
        int iHJFh0TGMpafqLE9haL = this.f4286lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL();
        int iS3fjYDxWOUexjjVgyA = this.f4286lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewLEeR5KfoEr4xU5yHH7 = this.f4286lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(i);
            this.f4287s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(iHJFh0TGMpafqLE9haL, iS3fjYDxWOUexjjVgyA, this.f4286lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(viewLEeR5KfoEr4xU5yHH7), this.f4286lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(viewLEeR5KfoEr4xU5yHH7));
            if (i3 != 0) {
                this.f4287s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0();
                this.f4287s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(i3);
                if (this.f4287s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA()) {
                    return viewLEeR5KfoEr4xU5yHH7;
                }
            }
            if (i4 != 0) {
                this.f4287s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0();
                this.f4287s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(i4);
                if (this.f4287s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA()) {
                    view = viewLEeR5KfoEr4xU5yHH7;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean s3fjYDxWOUexjjVgyA(View view, int i) {
        this.f4287s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(this.f4286lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(), this.f4286lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(), this.f4286lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(view), this.f4286lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(view));
        if (i == 0) {
            return false;
        }
        this.f4287s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0();
        this.f4287s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(i);
        return this.f4287s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
    }
}
