package PPkm9uUfOJHHYveeLT;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 implements View.OnTouchListener {

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public static final int f1282sTkWmhpZ5b1ArQIw4K = ViewConfiguration.getTapTimeout();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final View f1284HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f1285IPyIQcaNa8aB7drBED;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public boolean f1287OANkd3mP6AYvwbNLJM;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public boolean f1288T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f1289TCyPEKSzIyweCN5yp1;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public boolean f1291aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public boolean f1292e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public boolean f1293hoXrIDAFrSwfShk8da;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public Runnable f1298zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public boolean f1299zaq8hOURtfwbcX17cG;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final C0015lEeR5KfoEr4xU5yHH7 f1295lEeR5KfoEr4xU5yHH7 = new C0015lEeR5KfoEr4xU5yHH7();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Interpolator f1297s3fjYDxWOUexjjVgyA = new AccelerateInterpolator();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public float[] f1294husNiw3snxdgZPAGJm = {0.0f, 0.0f};

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public float[] f1286KYHag8HRDlnO3X9zmZ = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public float[] f1296pbVGzGjWvY2LDXC8vo = {0.0f, 0.0f};

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public float[] f1283Acstmh57AKoSEkEFNJ = {0.0f, 0.0f};

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public float[] f1290Z9WdNiOsPR0y54zHW4 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: PPkm9uUfOJHHYveeLT.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static class C0015lEeR5KfoEr4xU5yHH7 {

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public float f1300Acstmh57AKoSEkEFNJ;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public float f1301HJFh0TGMpafqLE9haL;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public int f1305Z9WdNiOsPR0y54zHW4;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f1307lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f1309s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public float f1310zZKhbgvUfsK4AEX3r0;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public long f1306husNiw3snxdgZPAGJm = Long.MIN_VALUE;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public long f1308pbVGzGjWvY2LDXC8vo = -1;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public long f1303KYHag8HRDlnO3X9zmZ = 0;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public int f1304TCyPEKSzIyweCN5yp1 = 0;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public int f1302IPyIQcaNa8aB7drBED = 0;

        public void Acstmh57AKoSEkEFNJ(int i) {
            this.f1309s3fjYDxWOUexjjVgyA = i;
        }

        public int HJFh0TGMpafqLE9haL() {
            return this.f1302IPyIQcaNa8aB7drBED;
        }

        public boolean IPyIQcaNa8aB7drBED() {
            return this.f1308pbVGzGjWvY2LDXC8vo > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1308pbVGzGjWvY2LDXC8vo + ((long) this.f1305Z9WdNiOsPR0y54zHW4);
        }

        public int KYHag8HRDlnO3X9zmZ() {
            float f = this.f1310zZKhbgvUfsK4AEX3r0;
            return (int) (f / Math.abs(f));
        }

        public void T9PhQIpGRhE4yZDm1C() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1306husNiw3snxdgZPAGJm = jCurrentAnimationTimeMillis;
            this.f1308pbVGzGjWvY2LDXC8vo = -1L;
            this.f1303KYHag8HRDlnO3X9zmZ = jCurrentAnimationTimeMillis;
            this.f1300Acstmh57AKoSEkEFNJ = 0.5f;
            this.f1304TCyPEKSzIyweCN5yp1 = 0;
            this.f1302IPyIQcaNa8aB7drBED = 0;
        }

        public final float TCyPEKSzIyweCN5yp1(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public void Z9WdNiOsPR0y54zHW4(int i) {
            this.f1307lEeR5KfoEr4xU5yHH7 = i;
        }

        public void e54J8UWNHWALQNixXM(float f, float f2) {
            this.f1301HJFh0TGMpafqLE9haL = f;
            this.f1310zZKhbgvUfsK4AEX3r0 = f2;
        }

        public final float husNiw3snxdgZPAGJm(long j) {
            if (j < this.f1306husNiw3snxdgZPAGJm) {
                return 0.0f;
            }
            long j2 = this.f1308pbVGzGjWvY2LDXC8vo;
            if (j2 < 0 || j < j2) {
                return lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm((j - r0) / this.f1307lEeR5KfoEr4xU5yHH7, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f1300Acstmh57AKoSEkEFNJ;
            return (1.0f - f) + (f * lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm((j - j2) / this.f1305Z9WdNiOsPR0y54zHW4, 0.0f, 1.0f));
        }

        public void lEeR5KfoEr4xU5yHH7() {
            if (this.f1303KYHag8HRDlnO3X9zmZ == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(husNiw3snxdgZPAGJm(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f1303KYHag8HRDlnO3X9zmZ;
            this.f1303KYHag8HRDlnO3X9zmZ = jCurrentAnimationTimeMillis;
            float f = j * fTCyPEKSzIyweCN5yp1;
            this.f1304TCyPEKSzIyweCN5yp1 = (int) (this.f1301HJFh0TGMpafqLE9haL * f);
            this.f1302IPyIQcaNa8aB7drBED = (int) (f * this.f1310zZKhbgvUfsK4AEX3r0);
        }

        public void pbVGzGjWvY2LDXC8vo() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1305Z9WdNiOsPR0y54zHW4 = lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ((int) (jCurrentAnimationTimeMillis - this.f1306husNiw3snxdgZPAGJm), 0, this.f1309s3fjYDxWOUexjjVgyA);
            this.f1300Acstmh57AKoSEkEFNJ = husNiw3snxdgZPAGJm(jCurrentAnimationTimeMillis);
            this.f1308pbVGzGjWvY2LDXC8vo = jCurrentAnimationTimeMillis;
        }

        public int s3fjYDxWOUexjjVgyA() {
            return this.f1304TCyPEKSzIyweCN5yp1;
        }

        public int zZKhbgvUfsK4AEX3r0() {
            float f = this.f1301HJFh0TGMpafqLE9haL;
            return (int) (f / Math.abs(f));
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // java.lang.Runnable
        public void run() {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = lEeR5KfoEr4xU5yHH7.this;
            if (leer5kfoer4xu5yhh7.f1291aPyGSIylzVNKPT1Bls) {
                if (leer5kfoer4xu5yhh7.f1288T9PhQIpGRhE4yZDm1C) {
                    leer5kfoer4xu5yhh7.f1288T9PhQIpGRhE4yZDm1C = false;
                    leer5kfoer4xu5yhh7.f1295lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C();
                }
                C0015lEeR5KfoEr4xU5yHH7 c0015lEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7.this.f1295lEeR5KfoEr4xU5yHH7;
                if (c0015lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED() || !lEeR5KfoEr4xU5yHH7.this.G7AC3DWIx9i9fdanjk()) {
                    lEeR5KfoEr4xU5yHH7.this.f1291aPyGSIylzVNKPT1Bls = false;
                    return;
                }
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = lEeR5KfoEr4xU5yHH7.this;
                if (leer5kfoer4xu5yhh72.f1293hoXrIDAFrSwfShk8da) {
                    leer5kfoer4xu5yhh72.f1293hoXrIDAFrSwfShk8da = false;
                    leer5kfoer4xu5yhh72.HJFh0TGMpafqLE9haL();
                }
                c0015lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
                lEeR5KfoEr4xU5yHH7.this.Acstmh57AKoSEkEFNJ(c0015lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(), c0015lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL());
                lLKzvdU99Iw80uVD5I.ZJNyOIPL0usMs2xSAn(lEeR5KfoEr4xU5yHH7.this.f1284HJFh0TGMpafqLE9haL, this);
            }
        }
    }

    public lEeR5KfoEr4xU5yHH7(View view) {
        this.f1284HJFh0TGMpafqLE9haL = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        aPyGSIylzVNKPT1Bls(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        OANkd3mP6AYvwbNLJM(f3, f3);
        e54J8UWNHWALQNixXM(1);
        hoXrIDAFrSwfShk8da(Float.MAX_VALUE, Float.MAX_VALUE);
        Y43RdunnpKgpbny0lE(0.2f, 0.2f);
        R9SAhYMerGybF9OAjL(1.0f, 1.0f);
        Z9WdNiOsPR0y54zHW4(f1282sTkWmhpZ5b1ArQIw4K);
        sTkWmhpZ5b1ArQIw4K(500);
        zaq8hOURtfwbcX17cG(500);
    }

    public static int KYHag8HRDlnO3X9zmZ(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public static float husNiw3snxdgZPAGJm(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public abstract void Acstmh57AKoSEkEFNJ(int i, int i2);

    public boolean G7AC3DWIx9i9fdanjk() {
        C0015lEeR5KfoEr4xU5yHH7 c0015lEeR5KfoEr4xU5yHH7 = this.f1295lEeR5KfoEr4xU5yHH7;
        int iKYHag8HRDlnO3X9zmZ = c0015lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ();
        int iZZKhbgvUfsK4AEX3r0 = c0015lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0();
        return (iKYHag8HRDlnO3X9zmZ != 0 && s3fjYDxWOUexjjVgyA(iKYHag8HRDlnO3X9zmZ)) || (iZZKhbgvUfsK4AEX3r0 != 0 && lEeR5KfoEr4xU5yHH7(iZZKhbgvUfsK4AEX3r0));
    }

    public void HJFh0TGMpafqLE9haL() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1284HJFh0TGMpafqLE9haL.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float IPyIQcaNa8aB7drBED(float f, float f2, float f3, float f4) {
        float interpolation;
        float fHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(f * f2, 0.0f, f3);
        float fTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(f2 - f4, fHusNiw3snxdgZPAGJm) - TCyPEKSzIyweCN5yp1(f4, fHusNiw3snxdgZPAGJm);
        if (fTCyPEKSzIyweCN5yp1 < 0.0f) {
            interpolation = -this.f1297s3fjYDxWOUexjjVgyA.getInterpolation(-fTCyPEKSzIyweCN5yp1);
        } else {
            if (fTCyPEKSzIyweCN5yp1 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1297s3fjYDxWOUexjjVgyA.getInterpolation(fTCyPEKSzIyweCN5yp1);
        }
        return husNiw3snxdgZPAGJm(interpolation, -1.0f, 1.0f);
    }

    public lEeR5KfoEr4xU5yHH7 OANkd3mP6AYvwbNLJM(float f, float f2) {
        float[] fArr = this.f1283Acstmh57AKoSEkEFNJ;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public lEeR5KfoEr4xU5yHH7 R9SAhYMerGybF9OAjL(float f, float f2) {
        float[] fArr = this.f1296pbVGzGjWvY2LDXC8vo;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public lEeR5KfoEr4xU5yHH7 T9PhQIpGRhE4yZDm1C(boolean z) {
        if (this.f1287OANkd3mP6AYvwbNLJM && !z) {
            pbVGzGjWvY2LDXC8vo();
        }
        this.f1287OANkd3mP6AYvwbNLJM = z;
        return this;
    }

    public final float TCyPEKSzIyweCN5yp1(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1289TCyPEKSzIyweCN5yp1;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f1291aPyGSIylzVNKPT1Bls && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public lEeR5KfoEr4xU5yHH7 Y43RdunnpKgpbny0lE(float f, float f2) {
        float[] fArr = this.f1294husNiw3snxdgZPAGJm;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public lEeR5KfoEr4xU5yHH7 Z9WdNiOsPR0y54zHW4(int i) {
        this.f1285IPyIQcaNa8aB7drBED = i;
        return this;
    }

    public lEeR5KfoEr4xU5yHH7 aPyGSIylzVNKPT1Bls(float f, float f2) {
        float[] fArr = this.f1290Z9WdNiOsPR0y54zHW4;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public lEeR5KfoEr4xU5yHH7 e54J8UWNHWALQNixXM(int i) {
        this.f1289TCyPEKSzIyweCN5yp1 = i;
        return this;
    }

    public lEeR5KfoEr4xU5yHH7 hoXrIDAFrSwfShk8da(float f, float f2) {
        float[] fArr = this.f1286KYHag8HRDlnO3X9zmZ;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public abstract boolean lEeR5KfoEr4xU5yHH7(int i);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1287OANkd3mP6AYvwbNLJM
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.pbVGzGjWvY2LDXC8vo()
            goto L58
        L1a:
            r5.f1293hoXrIDAFrSwfShk8da = r2
            r5.f1292e54J8UWNHWALQNixXM = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1284HJFh0TGMpafqLE9haL
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.zZKhbgvUfsK4AEX3r0(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1284HJFh0TGMpafqLE9haL
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.zZKhbgvUfsK4AEX3r0(r2, r7, r6, r3)
            PPkm9uUfOJHHYveeLT.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7 r7 = r5.f1295lEeR5KfoEr4xU5yHH7
            r7.e54J8UWNHWALQNixXM(r0, r6)
            boolean r6 = r5.f1291aPyGSIylzVNKPT1Bls
            if (r6 != 0) goto L58
            boolean r6 = r5.G7AC3DWIx9i9fdanjk()
            if (r6 == 0) goto L58
            r5.xHA29AmDt6y96AnB3t()
        L58:
            boolean r6 = r5.f1299zaq8hOURtfwbcX17cG
            if (r6 == 0) goto L61
            boolean r6 = r5.f1291aPyGSIylzVNKPT1Bls
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: PPkm9uUfOJHHYveeLT.lEeR5KfoEr4xU5yHH7.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void pbVGzGjWvY2LDXC8vo() {
        if (this.f1288T9PhQIpGRhE4yZDm1C) {
            this.f1291aPyGSIylzVNKPT1Bls = false;
        } else {
            this.f1295lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo();
        }
    }

    public abstract boolean s3fjYDxWOUexjjVgyA(int i);

    public lEeR5KfoEr4xU5yHH7 sTkWmhpZ5b1ArQIw4K(int i) {
        this.f1295lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(i);
        return this;
    }

    public final void xHA29AmDt6y96AnB3t() {
        int i;
        if (this.f1298zZKhbgvUfsK4AEX3r0 == null) {
            this.f1298zZKhbgvUfsK4AEX3r0 = new s3fjYDxWOUexjjVgyA();
        }
        this.f1291aPyGSIylzVNKPT1Bls = true;
        this.f1288T9PhQIpGRhE4yZDm1C = true;
        if (this.f1292e54J8UWNHWALQNixXM || (i = this.f1285IPyIQcaNa8aB7drBED) <= 0) {
            this.f1298zZKhbgvUfsK4AEX3r0.run();
        } else {
            lLKzvdU99Iw80uVD5I.Tu4WCh2gEwj8E4oHbP(this.f1284HJFh0TGMpafqLE9haL, this.f1298zZKhbgvUfsK4AEX3r0, i);
        }
        this.f1292e54J8UWNHWALQNixXM = true;
    }

    public final float zZKhbgvUfsK4AEX3r0(int i, float f, float f2, float f3) {
        float fIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(this.f1294husNiw3snxdgZPAGJm[i], f2, this.f1286KYHag8HRDlnO3X9zmZ[i], f);
        if (fIPyIQcaNa8aB7drBED == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1296pbVGzGjWvY2LDXC8vo[i];
        float f5 = this.f1283Acstmh57AKoSEkEFNJ[i];
        float f6 = this.f1290Z9WdNiOsPR0y54zHW4[i];
        float f7 = f4 * f3;
        return fIPyIQcaNa8aB7drBED > 0.0f ? husNiw3snxdgZPAGJm(fIPyIQcaNa8aB7drBED * f7, f5, f6) : -husNiw3snxdgZPAGJm((-fIPyIQcaNa8aB7drBED) * f7, f5, f6);
    }

    public lEeR5KfoEr4xU5yHH7 zaq8hOURtfwbcX17cG(int i) {
        this.f1295lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(i);
        return this;
    }
}
