package com.google.android.material.timepicker;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;
import tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final List f5455Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final ValueAnimator f5456HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final int f5457IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public float f5458KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public float f5459OANkd3mP6AYvwbNLJM;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public int f5460R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public final Paint f5461T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f5462TCyPEKSzIyweCN5yp1;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public int f5463Y43RdunnpKgpbny0lE;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final int f5464Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public final int f5465aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final float f5466e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public final RectF f5467hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public float f5468husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f5469lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f5470pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final TimeInterpolator f5471s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public double f5472sTkWmhpZ5b1ArQIw4K;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f5473zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public boolean f5474zaq8hOURtfwbcX17cG;

    public class lEeR5KfoEr4xU5yHH7 extends AnimatorListenerAdapter {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface s3fjYDxWOUexjjVgyA {
        void lEeR5KfoEr4xU5yHH7(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7158zaq8hOURtfwbcX17cG);
    }

    public final Pair Acstmh57AKoSEkEFNJ(float f) {
        float fTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1();
        if (Math.abs(fTCyPEKSzIyweCN5yp1 - f) > 180.0f) {
            if (fTCyPEKSzIyweCN5yp1 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (fTCyPEKSzIyweCN5yp1 < 180.0f && f > 180.0f) {
                fTCyPEKSzIyweCN5yp1 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fTCyPEKSzIyweCN5yp1), Float.valueOf(f));
    }

    public final void HJFh0TGMpafqLE9haL(float f, float f2) {
        this.f5460R9SAhYMerGybF9OAjL = YIIWDMF3jHAs3E0PkN.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7((float) (getWidth() / 2), (float) (getHeight() / 2), f, f2) > ((float) IPyIQcaNa8aB7drBED(2)) + hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(getContext(), 12) ? 1 : 2;
    }

    public final int IPyIQcaNa8aB7drBED(int i) {
        return i == 2 ? Math.round(this.f5463Y43RdunnpKgpbny0lE * 0.66f) : this.f5463Y43RdunnpKgpbny0lE;
    }

    public final int KYHag8HRDlnO3X9zmZ(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public final void OANkd3mP6AYvwbNLJM(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f5459OANkd3mP6AYvwbNLJM = f2;
        this.f5472sTkWmhpZ5b1ArQIw4K = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(this.f5460R9SAhYMerGybF9OAjL);
        float fCos = width + (((float) Math.cos(this.f5472sTkWmhpZ5b1ArQIw4K)) * fIPyIQcaNa8aB7drBED);
        float fSin = height + (fIPyIQcaNa8aB7drBED * ((float) Math.sin(this.f5472sTkWmhpZ5b1ArQIw4K)));
        RectF rectF = this.f5467hoXrIDAFrSwfShk8da;
        int i = this.f5464Z9WdNiOsPR0y54zHW4;
        rectF.set(fCos - i, fSin - i, fCos + i, fSin + i);
        Iterator it = this.f5455Acstmh57AKoSEkEFNJ.iterator();
        while (it.hasNext()) {
            ((s3fjYDxWOUexjjVgyA) it.next()).lEeR5KfoEr4xU5yHH7(f2, z);
        }
        invalidate();
    }

    public void T9PhQIpGRhE4yZDm1C(int i) {
        this.f5463Y43RdunnpKgpbny0lE = i;
        invalidate();
    }

    public float TCyPEKSzIyweCN5yp1() {
        return this.f5459OANkd3mP6AYvwbNLJM;
    }

    public final boolean Z9WdNiOsPR0y54zHW4(float f, float f2, boolean z, boolean z2, boolean z3) {
        float fKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(f, f2);
        boolean z4 = false;
        boolean z5 = TCyPEKSzIyweCN5yp1() != fKYHag8HRDlnO3X9zmZ;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f5473zZKhbgvUfsK4AEX3r0) {
            z4 = true;
        }
        aPyGSIylzVNKPT1Bls(fKYHag8HRDlnO3X9zmZ, z4);
        return true;
    }

    public void aPyGSIylzVNKPT1Bls(float f, boolean z) {
        ValueAnimator valueAnimator = this.f5456HJFh0TGMpafqLE9haL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            OANkd3mP6AYvwbNLJM(f, false);
            return;
        }
        Pair pairAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ(f);
        this.f5456HJFh0TGMpafqLE9haL.setFloatValues(((Float) pairAcstmh57AKoSEkEFNJ.first).floatValue(), ((Float) pairAcstmh57AKoSEkEFNJ.second).floatValue());
        this.f5456HJFh0TGMpafqLE9haL.setDuration(this.f5469lEeR5KfoEr4xU5yHH7);
        this.f5456HJFh0TGMpafqLE9haL.setInterpolator(this.f5471s3fjYDxWOUexjjVgyA);
        this.f5456HJFh0TGMpafqLE9haL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.lEeR5KfoEr4xU5yHH7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f5495lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(valueAnimator2);
            }
        });
        this.f5456HJFh0TGMpafqLE9haL.addListener(new lEeR5KfoEr4xU5yHH7());
        this.f5456HJFh0TGMpafqLE9haL.start();
    }

    public final /* synthetic */ void e54J8UWNHWALQNixXM(ValueAnimator valueAnimator) {
        OANkd3mP6AYvwbNLJM(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void hoXrIDAFrSwfShk8da(float f) {
        aPyGSIylzVNKPT1Bls(f, false);
    }

    public RectF husNiw3snxdgZPAGJm() {
        return this.f5467hoXrIDAFrSwfShk8da;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zZKhbgvUfsK4AEX3r0(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f5456HJFh0TGMpafqLE9haL.isRunning()) {
            return;
        }
        hoXrIDAFrSwfShk8da(TCyPEKSzIyweCN5yp1());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.f5468husNiw3snxdgZPAGJm = x;
            this.f5458KYHag8HRDlnO3X9zmZ = y;
            this.f5462TCyPEKSzIyweCN5yp1 = true;
            this.f5474zaq8hOURtfwbcX17cG = false;
            z = true;
            z2 = false;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.f5468husNiw3snxdgZPAGJm);
            int i2 = (int) (y - this.f5458KYHag8HRDlnO3X9zmZ);
            this.f5462TCyPEKSzIyweCN5yp1 = (i * i) + (i2 * i2) > this.f5457IPyIQcaNa8aB7drBED;
            z2 = this.f5474zaq8hOURtfwbcX17cG;
            boolean z4 = actionMasked == 1;
            if (this.f5470pbVGzGjWvY2LDXC8vo) {
                HJFh0TGMpafqLE9haL(x, y);
            }
            z3 = z4;
            z = false;
        } else {
            z2 = false;
            z = false;
            z3 = false;
        }
        this.f5474zaq8hOURtfwbcX17cG |= Z9WdNiOsPR0y54zHW4(x, y, z2, z, z3);
        return true;
    }

    public int pbVGzGjWvY2LDXC8vo() {
        return this.f5464Z9WdNiOsPR0y54zHW4;
    }

    public void s3fjYDxWOUexjjVgyA(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f5455Acstmh57AKoSEkEFNJ.add(s3fjydxwouexjjvgya);
    }

    public final void zZKhbgvUfsK4AEX3r0(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(this.f5460R9SAhYMerGybF9OAjL);
        float fCos = (((float) Math.cos(this.f5472sTkWmhpZ5b1ArQIw4K)) * fIPyIQcaNa8aB7drBED) + f;
        float f2 = height;
        float fSin = (fIPyIQcaNa8aB7drBED * ((float) Math.sin(this.f5472sTkWmhpZ5b1ArQIw4K))) + f2;
        this.f5461T9PhQIpGRhE4yZDm1C.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f5464Z9WdNiOsPR0y54zHW4, this.f5461T9PhQIpGRhE4yZDm1C);
        double dSin = Math.sin(this.f5472sTkWmhpZ5b1ArQIw4K);
        double dCos = Math.cos(this.f5472sTkWmhpZ5b1ArQIw4K);
        this.f5461T9PhQIpGRhE4yZDm1C.setStrokeWidth(this.f5465aPyGSIylzVNKPT1Bls);
        canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f5461T9PhQIpGRhE4yZDm1C);
        canvas.drawCircle(f, f2, this.f5466e54J8UWNHWALQNixXM, this.f5461T9PhQIpGRhE4yZDm1C);
    }

    public void zaq8hOURtfwbcX17cG(boolean z) {
        if (this.f5470pbVGzGjWvY2LDXC8vo && !z) {
            this.f5460R9SAhYMerGybF9OAjL = 1;
        }
        this.f5470pbVGzGjWvY2LDXC8vo = z;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5456HJFh0TGMpafqLE9haL = new ValueAnimator();
        this.f5455Acstmh57AKoSEkEFNJ = new ArrayList();
        Paint paint = new Paint();
        this.f5461T9PhQIpGRhE4yZDm1C = paint;
        this.f5467hoXrIDAFrSwfShk8da = new RectF();
        this.f5460R9SAhYMerGybF9OAjL = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Acstmh57AKoSEkEFNJ.f6954jsjSYEu4NPZjZxcfmI, i, pbVGzGjWvY2LDXC8vo.f7164Z9WdNiOsPR0y54zHW4);
        this.f5469lEeR5KfoEr4xU5yHH7 = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(context, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7143Y43RdunnpKgpbny0lE, 200);
        this.f5471s3fjYDxWOUexjjVgyA = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1(context, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7141WWC27LAMFqFFBzfbNw, jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6198s3fjYDxWOUexjjVgyA);
        this.f5463Y43RdunnpKgpbny0lE = typedArrayObtainStyledAttributes.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.f6937g0OBkYSIvp0JYnHPjC, 0);
        this.f5464Z9WdNiOsPR0y54zHW4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.f6878PDw1hXOtArGjUqFgpT, 0);
        this.f5465aPyGSIylzVNKPT1Bls = getResources().getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7042sTkWmhpZ5b1ArQIw4K);
        this.f5466e54J8UWNHWALQNixXM = r7.getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7010OANkd3mP6AYvwbNLJM);
        int color = typedArrayObtainStyledAttributes.getColor(Acstmh57AKoSEkEFNJ.f6845EscIOBqRhG6irG5q11, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        hoXrIDAFrSwfShk8da(0.0f);
        this.f5457IPyIQcaNa8aB7drBED = ViewConfiguration.get(context).getScaledTouchSlop();
        lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
