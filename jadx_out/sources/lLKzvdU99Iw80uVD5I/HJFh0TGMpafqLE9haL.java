package lLKzvdU99Iw80uVD5I;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public static final Interpolator f6501A49QRPHynYLCBN0SqP = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int[] f6502Acstmh57AKoSEkEFNJ;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public boolean f6503G7AC3DWIx9i9fdanjk;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int[] f6505IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public float[] f6506KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public final int f6508OANkd3mP6AYvwbNLJM;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public View f6509R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public float f6510T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public float[] f6511TCyPEKSzIyweCN5yp1;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public final AbstractC0099HJFh0TGMpafqLE9haL f6512Y43RdunnpKgpbny0lE;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public int f6513Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public int f6514aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public VelocityTracker f6515e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public float f6516hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public float[] f6517husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f6518lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int[] f6519pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f6520s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public OverScroller f6521sTkWmhpZ5b1ArQIw4K;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public final ViewGroup f6522xHA29AmDt6y96AnB3t;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public float[] f6523zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public int f6524zaq8hOURtfwbcX17cG;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f6504HJFh0TGMpafqLE9haL = -1;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public final Runnable f6507LIMtzhnLwQyigzK0KO = new s3fjYDxWOUexjjVgyA();

    public class lEeR5KfoEr4xU5yHH7 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HJFh0TGMpafqLE9haL.this.XzJ1BS7H9Ilbkv4eVM(0);
        }
    }

    public HJFh0TGMpafqLE9haL(Context context, ViewGroup viewGroup, AbstractC0099HJFh0TGMpafqLE9haL abstractC0099HJFh0TGMpafqLE9haL) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0099HJFh0TGMpafqLE9haL == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f6522xHA29AmDt6y96AnB3t = viewGroup;
        this.f6512Y43RdunnpKgpbny0lE = abstractC0099HJFh0TGMpafqLE9haL;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f6508OANkd3mP6AYvwbNLJM = i;
        this.f6514aPyGSIylzVNKPT1Bls = i;
        this.f6520s3fjYDxWOUexjjVgyA = viewConfiguration.getScaledTouchSlop();
        this.f6510T9PhQIpGRhE4yZDm1C = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6516hoXrIDAFrSwfShk8da = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6521sTkWmhpZ5b1ArQIw4K = new OverScroller(context, f6501A49QRPHynYLCBN0SqP);
    }

    public static HJFh0TGMpafqLE9haL T9PhQIpGRhE4yZDm1C(ViewGroup viewGroup, AbstractC0099HJFh0TGMpafqLE9haL abstractC0099HJFh0TGMpafqLE9haL) {
        return new HJFh0TGMpafqLE9haL(viewGroup.getContext(), viewGroup, abstractC0099HJFh0TGMpafqLE9haL);
    }

    public static HJFh0TGMpafqLE9haL e54J8UWNHWALQNixXM(ViewGroup viewGroup, float f, AbstractC0099HJFh0TGMpafqLE9haL abstractC0099HJFh0TGMpafqLE9haL) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLT9PhQIpGRhE4yZDm1C = T9PhQIpGRhE4yZDm1C(viewGroup, abstractC0099HJFh0TGMpafqLE9haL);
        hJFh0TGMpafqLE9haLT9PhQIpGRhE4yZDm1C.f6520s3fjYDxWOUexjjVgyA = (int) (hJFh0TGMpafqLE9haLT9PhQIpGRhE4yZDm1C.f6520s3fjYDxWOUexjjVgyA * (1.0f / f));
        return hJFh0TGMpafqLE9haLT9PhQIpGRhE4yZDm1C;
    }

    public final boolean A49QRPHynYLCBN0SqP(int i) {
        if (LIMtzhnLwQyigzK0KO(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final int Acstmh57AKoSEkEFNJ(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int iKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(i3, (int) this.f6516hoXrIDAFrSwfShk8da, (int) this.f6510T9PhQIpGRhE4yZDm1C);
        int iKYHag8HRDlnO3X9zmZ2 = KYHag8HRDlnO3X9zmZ(i4, (int) this.f6516hoXrIDAFrSwfShk8da, (int) this.f6510T9PhQIpGRhE4yZDm1C);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(iKYHag8HRDlnO3X9zmZ);
        int iAbs4 = Math.abs(iKYHag8HRDlnO3X9zmZ2);
        int i5 = iAbs3 + iAbs4;
        int i6 = iAbs + iAbs2;
        if (iKYHag8HRDlnO3X9zmZ != 0) {
            f = iAbs3;
            f2 = i5;
        } else {
            f = iAbs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (iKYHag8HRDlnO3X9zmZ2 != 0) {
            f3 = iAbs4;
            f4 = i5;
        } else {
            f3 = iAbs2;
            f4 = i6;
        }
        return (int) ((pbVGzGjWvY2LDXC8vo(i, iKYHag8HRDlnO3X9zmZ, this.f6512Y43RdunnpKgpbny0lE.zZKhbgvUfsK4AEX3r0(view)) * f5) + (pbVGzGjWvY2LDXC8vo(i2, iKYHag8HRDlnO3X9zmZ2, this.f6512Y43RdunnpKgpbny0lE.husNiw3snxdgZPAGJm(view)) * (f3 / f4)));
    }

    public int G7AC3DWIx9i9fdanjk() {
        return this.f6520s3fjYDxWOUexjjVgyA;
    }

    public boolean GyWRxpdt1T8mEJXPoD(View view, int i) {
        if (view == this.f6509R9SAhYMerGybF9OAjL && this.f6504HJFh0TGMpafqLE9haL == i) {
            return true;
        }
        if (view == null || !this.f6512Y43RdunnpKgpbny0lE.T9PhQIpGRhE4yZDm1C(view, i)) {
            return false;
        }
        this.f6504HJFh0TGMpafqLE9haL = i;
        s3fjYDxWOUexjjVgyA(view, i);
        return true;
    }

    public final boolean HJFh0TGMpafqLE9haL(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f6505IPyIQcaNa8aB7drBED[i] & i2) != i2 || (this.f6524zaq8hOURtfwbcX17cG & i2) == 0 || (this.f6502Acstmh57AKoSEkEFNJ[i] & i2) == i2 || (this.f6519pbVGzGjWvY2LDXC8vo[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f6520s3fjYDxWOUexjjVgyA;
        if (fAbs <= i3 && fAbs2 <= i3) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f6512Y43RdunnpKgpbny0lE.TCyPEKSzIyweCN5yp1(i2)) {
            return (this.f6519pbVGzGjWvY2LDXC8vo[i] & i2) == 0 && fAbs > ((float) this.f6520s3fjYDxWOUexjjVgyA);
        }
        int[] iArr = this.f6502Acstmh57AKoSEkEFNJ;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    public final void IPyIQcaNa8aB7drBED(int i) {
        if (this.f6523zZKhbgvUfsK4AEX3r0 == null || !LIMtzhnLwQyigzK0KO(i)) {
            return;
        }
        this.f6523zZKhbgvUfsK4AEX3r0[i] = 0.0f;
        this.f6517husNiw3snxdgZPAGJm[i] = 0.0f;
        this.f6506KYHag8HRDlnO3X9zmZ[i] = 0.0f;
        this.f6511TCyPEKSzIyweCN5yp1[i] = 0.0f;
        this.f6505IPyIQcaNa8aB7drBED[i] = 0;
        this.f6519pbVGzGjWvY2LDXC8vo[i] = 0;
        this.f6502Acstmh57AKoSEkEFNJ[i] = 0;
        this.f6513Z9WdNiOsPR0y54zHW4 = (~(1 << i)) & this.f6513Z9WdNiOsPR0y54zHW4;
    }

    public final int KYHag8HRDlnO3X9zmZ(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public boolean LIMtzhnLwQyigzK0KO(int i) {
        return ((1 << i) & this.f6513Z9WdNiOsPR0y54zHW4) != 0;
    }

    public final void OANkd3mP6AYvwbNLJM(int i, int i2, int i3, int i4) {
        int left = this.f6509R9SAhYMerGybF9OAjL.getLeft();
        int top = this.f6509R9SAhYMerGybF9OAjL.getTop();
        if (i3 != 0) {
            i = this.f6512Y43RdunnpKgpbny0lE.lEeR5KfoEr4xU5yHH7(this.f6509R9SAhYMerGybF9OAjL, i, i3);
            lLKzvdU99Iw80uVD5I.oocVJL811qFf0j0XXZ(this.f6509R9SAhYMerGybF9OAjL, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f6512Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(this.f6509R9SAhYMerGybF9OAjL, i2, i4);
            lLKzvdU99Iw80uVD5I.udcVtCzLTM1Loe9KrX(this.f6509R9SAhYMerGybF9OAjL, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f6512Y43RdunnpKgpbny0lE.Z9WdNiOsPR0y54zHW4(this.f6509R9SAhYMerGybF9OAjL, i5, i6, i5 - left, i6 - top);
    }

    public final void OUd9THiLjZndMj0qdF(float f, float f2, int i) {
        zaq8hOURtfwbcX17cG(i);
        float[] fArr = this.f6523zZKhbgvUfsK4AEX3r0;
        this.f6506KYHag8HRDlnO3X9zmZ[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f6517husNiw3snxdgZPAGJm;
        this.f6511TCyPEKSzIyweCN5yp1[i] = f2;
        fArr2[i] = f2;
        this.f6505IPyIQcaNa8aB7drBED[i] = R9SAhYMerGybF9OAjL((int) f, (int) f2);
        this.f6513Z9WdNiOsPR0y54zHW4 |= 1 << i;
    }

    public boolean OqIo5QF00RDxUQb4qq(View view, int i, int i2) {
        this.f6509R9SAhYMerGybF9OAjL = view;
        this.f6504HJFh0TGMpafqLE9haL = -1;
        boolean zY43RdunnpKgpbny0lE = Y43RdunnpKgpbny0lE(i, i2, 0, 0);
        if (!zY43RdunnpKgpbny0lE && this.f6518lEeR5KfoEr4xU5yHH7 == 0 && this.f6509R9SAhYMerGybF9OAjL != null) {
            this.f6509R9SAhYMerGybF9OAjL = null;
        }
        return zY43RdunnpKgpbny0lE;
    }

    public final int R9SAhYMerGybF9OAjL(int i, int i2) {
        int i3 = i < this.f6522xHA29AmDt6y96AnB3t.getLeft() + this.f6514aPyGSIylzVNKPT1Bls ? 1 : 0;
        if (i2 < this.f6522xHA29AmDt6y96AnB3t.getTop() + this.f6514aPyGSIylzVNKPT1Bls) {
            i3 |= 4;
        }
        if (i > this.f6522xHA29AmDt6y96AnB3t.getRight() - this.f6514aPyGSIylzVNKPT1Bls) {
            i3 |= 2;
        }
        return i2 > this.f6522xHA29AmDt6y96AnB3t.getBottom() - this.f6514aPyGSIylzVNKPT1Bls ? i3 | 8 : i3;
    }

    public final void TCyPEKSzIyweCN5yp1() {
        float[] fArr = this.f6523zZKhbgvUfsK4AEX3r0;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f6517husNiw3snxdgZPAGJm, 0.0f);
        Arrays.fill(this.f6506KYHag8HRDlnO3X9zmZ, 0.0f);
        Arrays.fill(this.f6511TCyPEKSzIyweCN5yp1, 0.0f);
        Arrays.fill(this.f6505IPyIQcaNa8aB7drBED, 0);
        Arrays.fill(this.f6519pbVGzGjWvY2LDXC8vo, 0);
        Arrays.fill(this.f6502Acstmh57AKoSEkEFNJ, 0);
        this.f6513Z9WdNiOsPR0y54zHW4 = 0;
    }

    public final void THTDvPxsHqMeGb512f() {
        this.f6515e54J8UWNHWALQNixXM.computeCurrentVelocity(1000, this.f6510T9PhQIpGRhE4yZDm1C);
        hoXrIDAFrSwfShk8da(husNiw3snxdgZPAGJm(this.f6515e54J8UWNHWALQNixXM.getXVelocity(this.f6504HJFh0TGMpafqLE9haL), this.f6516hoXrIDAFrSwfShk8da, this.f6510T9PhQIpGRhE4yZDm1C), husNiw3snxdgZPAGJm(this.f6515e54J8UWNHWALQNixXM.getYVelocity(this.f6504HJFh0TGMpafqLE9haL), this.f6516hoXrIDAFrSwfShk8da, this.f6510T9PhQIpGRhE4yZDm1C));
    }

    public boolean VItLRw50eXTZeEfGl0(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean W3RZ2dTDKrKpS5Mxdk(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.W3RZ2dTDKrKpS5Mxdk(android.view.MotionEvent):boolean");
    }

    public void WWC27LAMFqFFBzfbNw(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            lEeR5KfoEr4xU5yHH7();
        }
        if (this.f6515e54J8UWNHWALQNixXM == null) {
            this.f6515e54J8UWNHWALQNixXM = VelocityTracker.obtain();
        }
        this.f6515e54J8UWNHWALQNixXM.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewSTkWmhpZ5b1ArQIw4K = sTkWmhpZ5b1ArQIw4K((int) x, (int) y);
            OUd9THiLjZndMj0qdF(x, y, pointerId);
            GyWRxpdt1T8mEJXPoD(viewSTkWmhpZ5b1ArQIw4K, pointerId);
            int i3 = this.f6505IPyIQcaNa8aB7drBED[pointerId];
            int i4 = this.f6524zaq8hOURtfwbcX17cG;
            if ((i3 & i4) != 0) {
                this.f6512Y43RdunnpKgpbny0lE.IPyIQcaNa8aB7drBED(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f6518lEeR5KfoEr4xU5yHH7 != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (A49QRPHynYLCBN0SqP(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f6523zZKhbgvUfsK4AEX3r0[pointerId2];
                            float f2 = y2 - this.f6517husNiw3snxdgZPAGJm[pointerId2];
                            ao3wqKm5CXFuvC0q47(f, f2, pointerId2);
                            if (this.f6518lEeR5KfoEr4xU5yHH7 != 1) {
                                View viewSTkWmhpZ5b1ArQIw4K2 = sTkWmhpZ5b1ArQIw4K((int) x2, (int) y2);
                                if (zZKhbgvUfsK4AEX3r0(viewSTkWmhpZ5b1ArQIw4K2, f, f2) && GyWRxpdt1T8mEJXPoD(viewSTkWmhpZ5b1ArQIw4K2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else {
                    if (!A49QRPHynYLCBN0SqP(this.f6504HJFh0TGMpafqLE9haL)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f6504HJFh0TGMpafqLE9haL);
                    float x3 = motionEvent.getX(iFindPointerIndex);
                    float y3 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f6506KYHag8HRDlnO3X9zmZ;
                    int i5 = this.f6504HJFh0TGMpafqLE9haL;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f6511TCyPEKSzIyweCN5yp1[i5]);
                    OANkd3mP6AYvwbNLJM(this.f6509R9SAhYMerGybF9OAjL.getLeft() + i6, this.f6509R9SAhYMerGybF9OAjL.getTop() + i7, i6, i7);
                }
                jCtUeU2YI1poCxWcjm(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    OUd9THiLjZndMj0qdF(x4, y4, pointerId3);
                    if (this.f6518lEeR5KfoEr4xU5yHH7 != 0) {
                        if (xHA29AmDt6y96AnB3t((int) x4, (int) y4)) {
                            GyWRxpdt1T8mEJXPoD(this.f6509R9SAhYMerGybF9OAjL, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        GyWRxpdt1T8mEJXPoD(sTkWmhpZ5b1ArQIw4K((int) x4, (int) y4), pointerId3);
                        int i8 = this.f6505IPyIQcaNa8aB7drBED[pointerId3];
                        int i9 = this.f6524zaq8hOURtfwbcX17cG;
                        if ((i8 & i9) != 0) {
                            this.f6512Y43RdunnpKgpbny0lE.IPyIQcaNa8aB7drBED(i8 & i9, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f6518lEeR5KfoEr4xU5yHH7 == 1 && pointerId4 == this.f6504HJFh0TGMpafqLE9haL) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount2) {
                            i = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i2);
                        if (pointerId5 != this.f6504HJFh0TGMpafqLE9haL) {
                            View viewSTkWmhpZ5b1ArQIw4K3 = sTkWmhpZ5b1ArQIw4K((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f6509R9SAhYMerGybF9OAjL;
                            if (viewSTkWmhpZ5b1ArQIw4K3 == view && GyWRxpdt1T8mEJXPoD(view, pointerId5)) {
                                i = this.f6504HJFh0TGMpafqLE9haL;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        THTDvPxsHqMeGb512f();
                    }
                }
                IPyIQcaNa8aB7drBED(pointerId4);
                return;
            }
            if (this.f6518lEeR5KfoEr4xU5yHH7 == 1) {
                hoXrIDAFrSwfShk8da(0.0f, 0.0f);
            }
        } else if (this.f6518lEeR5KfoEr4xU5yHH7 == 1) {
            THTDvPxsHqMeGb512f();
        }
        lEeR5KfoEr4xU5yHH7();
    }

    public void XzJ1BS7H9Ilbkv4eVM(int i) {
        this.f6522xHA29AmDt6y96AnB3t.removeCallbacks(this.f6507LIMtzhnLwQyigzK0KO);
        if (this.f6518lEeR5KfoEr4xU5yHH7 != i) {
            this.f6518lEeR5KfoEr4xU5yHH7 = i;
            this.f6512Y43RdunnpKgpbny0lE.Acstmh57AKoSEkEFNJ(i);
            if (this.f6518lEeR5KfoEr4xU5yHH7 == 0) {
                this.f6509R9SAhYMerGybF9OAjL = null;
            }
        }
    }

    public final boolean Y43RdunnpKgpbny0lE(int i, int i2, int i3, int i4) {
        int left = this.f6509R9SAhYMerGybF9OAjL.getLeft();
        int top = this.f6509R9SAhYMerGybF9OAjL.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f6521sTkWmhpZ5b1ArQIw4K.abortAnimation();
            XzJ1BS7H9Ilbkv4eVM(0);
            return false;
        }
        this.f6521sTkWmhpZ5b1ArQIw4K.startScroll(left, top, i5, i6, Acstmh57AKoSEkEFNJ(this.f6509R9SAhYMerGybF9OAjL, i5, i6, i3, i4));
        XzJ1BS7H9Ilbkv4eVM(2);
        return true;
    }

    public boolean Z9WdNiOsPR0y54zHW4(boolean z) {
        if (this.f6518lEeR5KfoEr4xU5yHH7 == 2) {
            boolean zComputeScrollOffset = this.f6521sTkWmhpZ5b1ArQIw4K.computeScrollOffset();
            int currX = this.f6521sTkWmhpZ5b1ArQIw4K.getCurrX();
            int currY = this.f6521sTkWmhpZ5b1ArQIw4K.getCurrY();
            int left = currX - this.f6509R9SAhYMerGybF9OAjL.getLeft();
            int top = currY - this.f6509R9SAhYMerGybF9OAjL.getTop();
            if (left != 0) {
                lLKzvdU99Iw80uVD5I.oocVJL811qFf0j0XXZ(this.f6509R9SAhYMerGybF9OAjL, left);
            }
            if (top != 0) {
                lLKzvdU99Iw80uVD5I.udcVtCzLTM1Loe9KrX(this.f6509R9SAhYMerGybF9OAjL, top);
            }
            if (left != 0 || top != 0) {
                this.f6512Y43RdunnpKgpbny0lE.Z9WdNiOsPR0y54zHW4(this.f6509R9SAhYMerGybF9OAjL, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f6521sTkWmhpZ5b1ArQIw4K.getFinalX() && currY == this.f6521sTkWmhpZ5b1ArQIw4K.getFinalY()) {
                this.f6521sTkWmhpZ5b1ArQIw4K.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f6522xHA29AmDt6y96AnB3t.post(this.f6507LIMtzhnLwQyigzK0KO);
                } else {
                    XzJ1BS7H9Ilbkv4eVM(0);
                }
            }
        }
        return this.f6518lEeR5KfoEr4xU5yHH7 == 2;
    }

    public final float aPyGSIylzVNKPT1Bls(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL$HJFh0TGMpafqLE9haL] */
    public final void ao3wqKm5CXFuvC0q47(float f, float f2, int i) {
        boolean zHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(f, f2, i, 1);
        boolean z = zHJFh0TGMpafqLE9haL;
        if (HJFh0TGMpafqLE9haL(f2, f, i, 4)) {
            z = (zHJFh0TGMpafqLE9haL ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (HJFh0TGMpafqLE9haL(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (HJFh0TGMpafqLE9haL(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.f6519pbVGzGjWvY2LDXC8vo;
            iArr[i] = iArr[i] | r0;
            this.f6512Y43RdunnpKgpbny0lE.KYHag8HRDlnO3X9zmZ(r0, i);
        }
    }

    public final void hoXrIDAFrSwfShk8da(float f, float f2) {
        this.f6503G7AC3DWIx9i9fdanjk = true;
        this.f6512Y43RdunnpKgpbny0lE.e54J8UWNHWALQNixXM(this.f6509R9SAhYMerGybF9OAjL, f, f2);
        this.f6503G7AC3DWIx9i9fdanjk = false;
        if (this.f6518lEeR5KfoEr4xU5yHH7 == 1) {
            XzJ1BS7H9Ilbkv4eVM(0);
        }
    }

    public final float husNiw3snxdgZPAGJm(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        return fAbs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    public final void jCtUeU2YI1poCxWcjm(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (A49QRPHynYLCBN0SqP(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f6506KYHag8HRDlnO3X9zmZ[pointerId] = x;
                this.f6511TCyPEKSzIyweCN5yp1[pointerId] = y;
            }
        }
    }

    public void lEeR5KfoEr4xU5yHH7() {
        this.f6504HJFh0TGMpafqLE9haL = -1;
        TCyPEKSzIyweCN5yp1();
        VelocityTracker velocityTracker = this.f6515e54J8UWNHWALQNixXM;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6515e54J8UWNHWALQNixXM = null;
        }
    }

    public final int pbVGzGjWvY2LDXC8vo(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f6522xHA29AmDt6y96AnB3t.getWidth();
        float f = width / 2;
        float fAPyGSIylzVNKPT1Bls = f + (aPyGSIylzVNKPT1Bls(Math.min(1.0f, Math.abs(i) / width)) * f);
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fAPyGSIylzVNKPT1Bls / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public void s3fjYDxWOUexjjVgyA(View view, int i) {
        if (view.getParent() == this.f6522xHA29AmDt6y96AnB3t) {
            this.f6509R9SAhYMerGybF9OAjL = view;
            this.f6504HJFh0TGMpafqLE9haL = i;
            this.f6512Y43RdunnpKgpbny0lE.pbVGzGjWvY2LDXC8vo(view, i);
            XzJ1BS7H9Ilbkv4eVM(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f6522xHA29AmDt6y96AnB3t + ")");
    }

    public View sTkWmhpZ5b1ArQIw4K(int i, int i2) {
        for (int childCount = this.f6522xHA29AmDt6y96AnB3t.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f6522xHA29AmDt6y96AnB3t.getChildAt(this.f6512Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean tXWeW0sqVddf7ZBflq(int i, int i2) {
        if (this.f6503G7AC3DWIx9i9fdanjk) {
            return Y43RdunnpKgpbny0lE(i, i2, (int) this.f6515e54J8UWNHWALQNixXM.getXVelocity(this.f6504HJFh0TGMpafqLE9haL), (int) this.f6515e54J8UWNHWALQNixXM.getYVelocity(this.f6504HJFh0TGMpafqLE9haL));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean xHA29AmDt6y96AnB3t(int i, int i2) {
        return VItLRw50eXTZeEfGl0(this.f6509R9SAhYMerGybF9OAjL, i, i2);
    }

    public final boolean zZKhbgvUfsK4AEX3r0(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f6512Y43RdunnpKgpbny0lE.zZKhbgvUfsK4AEX3r0(view) > 0;
        boolean z2 = this.f6512Y43RdunnpKgpbny0lE.husNiw3snxdgZPAGJm(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f6520s3fjYDxWOUexjjVgyA) : z2 && Math.abs(f2) > ((float) this.f6520s3fjYDxWOUexjjVgyA);
        }
        float f3 = (f * f) + (f2 * f2);
        int i = this.f6520s3fjYDxWOUexjjVgyA;
        return f3 > ((float) (i * i));
    }

    public final void zaq8hOURtfwbcX17cG(int i) {
        float[] fArr = this.f6523zZKhbgvUfsK4AEX3r0;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f6517husNiw3snxdgZPAGJm;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6506KYHag8HRDlnO3X9zmZ;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6511TCyPEKSzIyweCN5yp1;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6505IPyIQcaNa8aB7drBED;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6519pbVGzGjWvY2LDXC8vo;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f6502Acstmh57AKoSEkEFNJ;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6523zZKhbgvUfsK4AEX3r0 = fArr2;
            this.f6517husNiw3snxdgZPAGJm = fArr3;
            this.f6506KYHag8HRDlnO3X9zmZ = fArr4;
            this.f6511TCyPEKSzIyweCN5yp1 = fArr5;
            this.f6505IPyIQcaNa8aB7drBED = iArr;
            this.f6519pbVGzGjWvY2LDXC8vo = iArr2;
            this.f6502Acstmh57AKoSEkEFNJ = iArr3;
        }
    }

    /* renamed from: lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL$HJFh0TGMpafqLE9haL, reason: collision with other inner class name */
    public static abstract class AbstractC0099HJFh0TGMpafqLE9haL {
        public abstract void Acstmh57AKoSEkEFNJ(int i);

        public abstract boolean T9PhQIpGRhE4yZDm1C(View view, int i);

        public boolean TCyPEKSzIyweCN5yp1(int i) {
            return false;
        }

        public abstract void Z9WdNiOsPR0y54zHW4(View view, int i, int i2, int i3, int i4);

        public abstract void e54J8UWNHWALQNixXM(View view, float f, float f2);

        public int husNiw3snxdgZPAGJm(View view) {
            return 0;
        }

        public abstract int lEeR5KfoEr4xU5yHH7(View view, int i, int i2);

        public abstract int s3fjYDxWOUexjjVgyA(View view, int i, int i2);

        public int zZKhbgvUfsK4AEX3r0(View view) {
            return 0;
        }

        public int HJFh0TGMpafqLE9haL(int i) {
            return i;
        }

        public void IPyIQcaNa8aB7drBED(int i, int i2) {
        }

        public void KYHag8HRDlnO3X9zmZ(int i, int i2) {
        }

        public void pbVGzGjWvY2LDXC8vo(View view, int i) {
        }
    }
}
