package EscIOBqRhG6irG5q11;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 extends HJFh0TGMpafqLE9haL {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public VelocityTracker f108Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f109IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f110KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f111TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public OverScroller f112husNiw3snxdgZPAGJm;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int f113pbVGzGjWvY2LDXC8vo;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public Runnable f114zZKhbgvUfsK4AEX3r0;

    /* renamed from: EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public class RunnableC0005lEeR5KfoEr4xU5yHH7 implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final CoordinatorLayout f116lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final View f117s3fjYDxWOUexjjVgyA;

        public RunnableC0005lEeR5KfoEr4xU5yHH7(CoordinatorLayout coordinatorLayout, View view) {
            this.f116lEeR5KfoEr4xU5yHH7 = coordinatorLayout;
            this.f117s3fjYDxWOUexjjVgyA = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f117s3fjYDxWOUexjjVgyA == null || (overScroller = lEeR5KfoEr4xU5yHH7.this.f112husNiw3snxdgZPAGJm) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                lEeR5KfoEr4xU5yHH7.this.PPkm9uUfOJHHYveeLT(this.f116lEeR5KfoEr4xU5yHH7, this.f117s3fjYDxWOUexjjVgyA);
                return;
            }
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = lEeR5KfoEr4xU5yHH7.this;
            leer5kfoer4xu5yhh7.lLKzvdU99Iw80uVD5I(this.f116lEeR5KfoEr4xU5yHH7, this.f117s3fjYDxWOUexjjVgyA, leer5kfoer4xu5yhh7.f112husNiw3snxdgZPAGJm.getCurrY());
            lLKzvdU99Iw80uVD5I.ZJNyOIPL0usMs2xSAn(this.f117s3fjYDxWOUexjjVgyA, this);
        }
    }

    public lEeR5KfoEr4xU5yHH7() {
        this.f111TCyPEKSzIyweCN5yp1 = -1;
        this.f113pbVGzGjWvY2LDXC8vo = -1;
    }

    public abstract int DfpieXfdYs58yZAiXY(View view);

    public final boolean GyWRxpdt1T8mEJXPoD(CoordinatorLayout coordinatorLayout, View view, int i, int i2, float f) {
        Runnable runnable = this.f114zZKhbgvUfsK4AEX3r0;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f114zZKhbgvUfsK4AEX3r0 = null;
        }
        if (this.f112husNiw3snxdgZPAGJm == null) {
            this.f112husNiw3snxdgZPAGJm = new OverScroller(view.getContext());
        }
        this.f112husNiw3snxdgZPAGJm.fling(0, XzJ1BS7H9Ilbkv4eVM(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.f112husNiw3snxdgZPAGJm.computeScrollOffset()) {
            PPkm9uUfOJHHYveeLT(coordinatorLayout, view);
            return false;
        }
        RunnableC0005lEeR5KfoEr4xU5yHH7 runnableC0005lEeR5KfoEr4xU5yHH7 = new RunnableC0005lEeR5KfoEr4xU5yHH7(coordinatorLayout, view);
        this.f114zZKhbgvUfsK4AEX3r0 = runnableC0005lEeR5KfoEr4xU5yHH7;
        lLKzvdU99Iw80uVD5I.ZJNyOIPL0usMs2xSAn(view, runnableC0005lEeR5KfoEr4xU5yHH7);
        return true;
    }

    public abstract int KqgKJKIWne3kz1AdHk();

    public final void OqIo5QF00RDxUQb4qq() {
        if (this.f108Acstmh57AKoSEkEFNJ == null) {
            this.f108Acstmh57AKoSEkEFNJ = VelocityTracker.obtain();
        }
    }

    public abstract void PPkm9uUfOJHHYveeLT(CoordinatorLayout coordinatorLayout, View view);

    public abstract int ToH8yzk8U1nKT0PUfY(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    public abstract boolean W3RZ2dTDKrKpS5Mxdk(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean Z9WdNiOsPR0y54zHW4(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f113pbVGzGjWvY2LDXC8vo < 0) {
            this.f113pbVGzGjWvY2LDXC8vo = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f110KYHag8HRDlnO3X9zmZ) {
            int i = this.f111TCyPEKSzIyweCN5yp1;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f109IPyIQcaNa8aB7drBED) > this.f113pbVGzGjWvY2LDXC8vo) {
                this.f109IPyIQcaNa8aB7drBED = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f111TCyPEKSzIyweCN5yp1 = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = W3RZ2dTDKrKpS5Mxdk(view) && coordinatorLayout.WWC27LAMFqFFBzfbNw(view, x, y2);
            this.f110KYHag8HRDlnO3X9zmZ = z;
            if (z) {
                this.f109IPyIQcaNa8aB7drBED = y2;
                this.f111TCyPEKSzIyweCN5yp1 = motionEvent.getPointerId(0);
                OqIo5QF00RDxUQb4qq();
                OverScroller overScroller = this.f112husNiw3snxdgZPAGJm;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f112husNiw3snxdgZPAGJm.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f108Acstmh57AKoSEkEFNJ;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public final int aAp6BD79BhftLCnuvf(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return ToH8yzk8U1nKT0PUfY(coordinatorLayout, view, KqgKJKIWne3kz1AdHk() - i, i2, i3);
    }

    public abstract int e2F9F6h8YJxTHwLCa0(View view);

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean jCtUeU2YI1poCxWcjm(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f111TCyPEKSzIyweCN5yp1 = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f109IPyIQcaNa8aB7drBED = r12
            goto L4c
        L2d:
            int r0 = r11.f111TCyPEKSzIyweCN5yp1
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f109IPyIQcaNa8aB7drBED
            int r7 = r1 - r0
            r11.f109IPyIQcaNa8aB7drBED = r0
            int r8 = r11.DfpieXfdYs58yZAiXY(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.aAp6BD79BhftLCnuvf(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f108Acstmh57AKoSEkEFNJ
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f108Acstmh57AKoSEkEFNJ
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f108Acstmh57AKoSEkEFNJ
            int r4 = r11.f111TCyPEKSzIyweCN5yp1
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.e2F9F6h8YJxTHwLCa0(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.GyWRxpdt1T8mEJXPoD(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f110KYHag8HRDlnO3X9zmZ = r3
            r11.f111TCyPEKSzIyweCN5yp1 = r1
            android.view.VelocityTracker r13 = r11.f108Acstmh57AKoSEkEFNJ
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f108Acstmh57AKoSEkEFNJ = r13
        L81:
            android.view.VelocityTracker r13 = r11.f108Acstmh57AKoSEkEFNJ
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f110KYHag8HRDlnO3X9zmZ
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7.jCtUeU2YI1poCxWcjm(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public int lLKzvdU99Iw80uVD5I(CoordinatorLayout coordinatorLayout, View view, int i) {
        return ToH8yzk8U1nKT0PUfY(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public lEeR5KfoEr4xU5yHH7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f111TCyPEKSzIyweCN5yp1 = -1;
        this.f113pbVGzGjWvY2LDXC8vo = -1;
    }
}
