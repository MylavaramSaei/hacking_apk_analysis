package IPyIQcaNa8aB7drBED;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class ao3wqKm5CXFuvC0q47 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f661HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f662IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public Runnable f663KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f664TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public Runnable f665husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final float f666lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final int[] f667pbVGzGjWvY2LDXC8vo = new int[2];

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f668s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final View f669zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = ao3wqKm5CXFuvC0q47.this.f669zZKhbgvUfsK4AEX3r0.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ao3wqKm5CXFuvC0q47.this.husNiw3snxdgZPAGJm();
        }
    }

    public ao3wqKm5CXFuvC0q47(View view) {
        this.f669zZKhbgvUfsK4AEX3r0 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f666lEeR5KfoEr4xU5yHH7 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f668s3fjYDxWOUexjjVgyA = tapTimeout;
        this.f661HJFh0TGMpafqLE9haL = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean IPyIQcaNa8aB7drBED(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    public final boolean Acstmh57AKoSEkEFNJ(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f667pbVGzGjWvY2LDXC8vo);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract boolean HJFh0TGMpafqLE9haL();

    public final boolean KYHag8HRDlnO3X9zmZ(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw;
        View view = this.f669zZKhbgvUfsK4AEX3r0;
        TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA();
        if (hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA == null || !hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ() || (wWC27LAMFqFFBzfbNw = (WWC27LAMFqFFBzfbNw) hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1()) == null || !wWC27LAMFqFFBzfbNw.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        pbVGzGjWvY2LDXC8vo(view, motionEventObtainNoHistory);
        Acstmh57AKoSEkEFNJ(wWC27LAMFqFFBzfbNw, motionEventObtainNoHistory);
        boolean zHusNiw3snxdgZPAGJm = wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm(motionEventObtainNoHistory, this.f662IPyIQcaNa8aB7drBED);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zHusNiw3snxdgZPAGJm && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean TCyPEKSzIyweCN5yp1(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f669zZKhbgvUfsK4AEX3r0
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f662IPyIQcaNa8aB7drBED
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f666lEeR5KfoEr4xU5yHH7
            boolean r6 = IPyIQcaNa8aB7drBED(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.lEeR5KfoEr4xU5yHH7()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.lEeR5KfoEr4xU5yHH7()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f662IPyIQcaNa8aB7drBED = r6
            java.lang.Runnable r6 = r5.f665husNiw3snxdgZPAGJm
            if (r6 != 0) goto L52
            IPyIQcaNa8aB7drBED.ao3wqKm5CXFuvC0q47$lEeR5KfoEr4xU5yHH7 r6 = new IPyIQcaNa8aB7drBED.ao3wqKm5CXFuvC0q47$lEeR5KfoEr4xU5yHH7
            r6.<init>()
            r5.f665husNiw3snxdgZPAGJm = r6
        L52:
            java.lang.Runnable r6 = r5.f665husNiw3snxdgZPAGJm
            int r1 = r5.f668s3fjYDxWOUexjjVgyA
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f663KYHag8HRDlnO3X9zmZ
            if (r6 != 0) goto L65
            IPyIQcaNa8aB7drBED.ao3wqKm5CXFuvC0q47$s3fjYDxWOUexjjVgyA r6 = new IPyIQcaNa8aB7drBED.ao3wqKm5CXFuvC0q47$s3fjYDxWOUexjjVgyA
            r6.<init>()
            r5.f663KYHag8HRDlnO3X9zmZ = r6
        L65:
            java.lang.Runnable r6 = r5.f663KYHag8HRDlnO3X9zmZ
            int r1 = r5.f661HJFh0TGMpafqLE9haL
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: IPyIQcaNa8aB7drBED.ao3wqKm5CXFuvC0q47.TCyPEKSzIyweCN5yp1(android.view.MotionEvent):boolean");
    }

    public void husNiw3snxdgZPAGJm() {
        lEeR5KfoEr4xU5yHH7();
        View view = this.f669zZKhbgvUfsK4AEX3r0;
        if (view.isEnabled() && !view.isLongClickable() && HJFh0TGMpafqLE9haL()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f664TCyPEKSzIyweCN5yp1 = true;
        }
    }

    public final void lEeR5KfoEr4xU5yHH7() {
        Runnable runnable = this.f663KYHag8HRDlnO3X9zmZ;
        if (runnable != null) {
            this.f669zZKhbgvUfsK4AEX3r0.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f665husNiw3snxdgZPAGJm;
        if (runnable2 != null) {
            this.f669zZKhbgvUfsK4AEX3r0.removeCallbacks(runnable2);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f664TCyPEKSzIyweCN5yp1;
        if (z2) {
            z = KYHag8HRDlnO3X9zmZ(motionEvent) || !zZKhbgvUfsK4AEX3r0();
        } else {
            z = TCyPEKSzIyweCN5yp1(motionEvent) && HJFh0TGMpafqLE9haL();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f669zZKhbgvUfsK4AEX3r0.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f664TCyPEKSzIyweCN5yp1 = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f664TCyPEKSzIyweCN5yp1 = false;
        this.f662IPyIQcaNa8aB7drBED = -1;
        Runnable runnable = this.f665husNiw3snxdgZPAGJm;
        if (runnable != null) {
            this.f669zZKhbgvUfsK4AEX3r0.removeCallbacks(runnable);
        }
    }

    public final boolean pbVGzGjWvY2LDXC8vo(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f667pbVGzGjWvY2LDXC8vo);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public abstract TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA();

    public boolean zZKhbgvUfsK4AEX3r0() {
        TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA();
        if (hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA == null || !hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ()) {
            return true;
        }
        hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA.dismiss();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
