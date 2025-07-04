package W3RZ2dTDKrKpS5Mxdk;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class aPyGSIylzVNKPT1Bls {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final int[] f1846Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f1847HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f1848IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public float f1849KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f1850TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public VelocityTracker f1851husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f1852lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int f1853pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final OANkd3mP6AYvwbNLJM f1854s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f1855zZKhbgvUfsK4AEX3r0;

    public interface lEeR5KfoEr4xU5yHH7 {
        float lEeR5KfoEr4xU5yHH7(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    public interface s3fjYDxWOUexjjVgyA {
        void lEeR5KfoEr4xU5yHH7(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public aPyGSIylzVNKPT1Bls(Context context, OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        this(context, oANkd3mP6AYvwbNLJM, new s3fjYDxWOUexjjVgyA() { // from class: W3RZ2dTDKrKpS5Mxdk.T9PhQIpGRhE4yZDm1C
            @Override // W3RZ2dTDKrKpS5Mxdk.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public final void lEeR5KfoEr4xU5yHH7(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL(context2, iArr, motionEvent, i);
            }
        }, new lEeR5KfoEr4xU5yHH7() { // from class: W3RZ2dTDKrKpS5Mxdk.hoXrIDAFrSwfShk8da
            @Override // W3RZ2dTDKrKpS5Mxdk.aPyGSIylzVNKPT1Bls.lEeR5KfoEr4xU5yHH7
            public final float lEeR5KfoEr4xU5yHH7(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return aPyGSIylzVNKPT1Bls.KYHag8HRDlnO3X9zmZ(velocityTracker, motionEvent, i);
            }
        });
    }

    public static void HJFh0TGMpafqLE9haL(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = zcy2NNbtVXgoGQbfuq.pbVGzGjWvY2LDXC8vo(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = zcy2NNbtVXgoGQbfuq.IPyIQcaNa8aB7drBED(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    public static float KYHag8HRDlnO3X9zmZ(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        KqgKJKIWne3kz1AdHk.lEeR5KfoEr4xU5yHH7(velocityTracker, motionEvent);
        KqgKJKIWne3kz1AdHk.s3fjYDxWOUexjjVgyA(velocityTracker, 1000);
        return KqgKJKIWne3kz1AdHk.zZKhbgvUfsK4AEX3r0(velocityTracker, i);
    }

    public void TCyPEKSzIyweCN5yp1(MotionEvent motionEvent, int i) {
        boolean zZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(motionEvent, i);
        if (this.f1846Acstmh57AKoSEkEFNJ[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f1851husNiw3snxdgZPAGJm;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1851husNiw3snxdgZPAGJm = null;
                return;
            }
            return;
        }
        float fHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(motionEvent, i) * this.f1854s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
        float fSignum = Math.signum(fHusNiw3snxdgZPAGJm);
        if (zZZKhbgvUfsK4AEX3r0 || (fSignum != Math.signum(this.f1849KYHag8HRDlnO3X9zmZ) && fSignum != 0.0f)) {
            this.f1854s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL();
        }
        float fAbs = Math.abs(fHusNiw3snxdgZPAGJm);
        int[] iArr = this.f1846Acstmh57AKoSEkEFNJ;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fHusNiw3snxdgZPAGJm, iArr[1]));
        this.f1849KYHag8HRDlnO3X9zmZ = this.f1854s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(fMax) ? fMax : 0.0f;
    }

    public final float husNiw3snxdgZPAGJm(MotionEvent motionEvent, int i) {
        if (this.f1851husNiw3snxdgZPAGJm == null) {
            this.f1851husNiw3snxdgZPAGJm = VelocityTracker.obtain();
        }
        return this.f1855zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f1851husNiw3snxdgZPAGJm, motionEvent, i);
    }

    public final boolean zZKhbgvUfsK4AEX3r0(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f1848IPyIQcaNa8aB7drBED == source && this.f1853pbVGzGjWvY2LDXC8vo == deviceId && this.f1850TCyPEKSzIyweCN5yp1 == i) {
            return false;
        }
        this.f1847HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f1852lEeR5KfoEr4xU5yHH7, this.f1846Acstmh57AKoSEkEFNJ, motionEvent, i);
        this.f1848IPyIQcaNa8aB7drBED = source;
        this.f1853pbVGzGjWvY2LDXC8vo = deviceId;
        this.f1850TCyPEKSzIyweCN5yp1 = i;
        return true;
    }

    public aPyGSIylzVNKPT1Bls(Context context, OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f1850TCyPEKSzIyweCN5yp1 = -1;
        this.f1848IPyIQcaNa8aB7drBED = -1;
        this.f1853pbVGzGjWvY2LDXC8vo = -1;
        this.f1846Acstmh57AKoSEkEFNJ = new int[]{Integer.MAX_VALUE, 0};
        this.f1852lEeR5KfoEr4xU5yHH7 = context;
        this.f1854s3fjYDxWOUexjjVgyA = oANkd3mP6AYvwbNLJM;
        this.f1847HJFh0TGMpafqLE9haL = s3fjydxwouexjjvgya;
        this.f1855zZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh7;
    }
}
