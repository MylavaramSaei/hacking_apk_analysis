package androidx.recyclerview.widget;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 extends RecyclerView.hoXrIDAFrSwfShk8da implements RecyclerView.sTkWmhpZ5b1ArQIw4K {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final int f4336Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final StateListDrawable f4338HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final Drawable f4339IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final int f4340KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public float f4342OANkd3mP6AYvwbNLJM;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public final RecyclerView.Y43RdunnpKgpbny0lE f4343OUd9THiLjZndMj0qdF;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public float f4345T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final StateListDrawable f4346TCyPEKSzIyweCN5yp1;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public int f4347THTDvPxsHqMeGb512f;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public final ValueAnimator f4349WWC27LAMFqFFBzfbNw;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public RecyclerView f4350Y43RdunnpKgpbny0lE;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public int f4351Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public int f4352aPyGSIylzVNKPT1Bls;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public final Runnable f4353ao3wqKm5CXFuvC0q47;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public int f4354e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public int f4355hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int f4356husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f4357lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final int f4358pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f4359s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Drawable f4362zZKhbgvUfsK4AEX3r0;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public static final int[] f4334jCtUeU2YI1poCxWcjm = {R.attr.state_pressed};

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public static final int[] f4333XzJ1BS7H9Ilbkv4eVM = new int[0];

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public int f4363zaq8hOURtfwbcX17cG = 0;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public int f4360sTkWmhpZ5b1ArQIw4K = 0;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public boolean f4344R9SAhYMerGybF9OAjL = false;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public boolean f4337G7AC3DWIx9i9fdanjk = false;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public int f4361xHA29AmDt6y96AnB3t = 0;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public int f4341LIMtzhnLwQyigzK0KO = 0;

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public final int[] f4335A49QRPHynYLCBN0SqP = new int[2];

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public final int[] f4348VItLRw50eXTZeEfGl0 = new int[2];

    public class HJFh0TGMpafqLE9haL extends AnimatorListenerAdapter {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f4364lEeR5KfoEr4xU5yHH7 = false;

        public HJFh0TGMpafqLE9haL() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4364lEeR5KfoEr4xU5yHH7 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4364lEeR5KfoEr4xU5yHH7) {
                this.f4364lEeR5KfoEr4xU5yHH7 = false;
                return;
            }
            if (((Float) zZKhbgvUfsK4AEX3r0.this.f4349WWC27LAMFqFFBzfbNw.getAnimatedValue()).floatValue() == 0.0f) {
                zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = zZKhbgvUfsK4AEX3r0.this;
                zzkhbgvufsk4aex3r0.f4347THTDvPxsHqMeGb512f = 0;
                zzkhbgvufsk4aex3r0.VItLRw50eXTZeEfGl0(0);
            } else {
                zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02 = zZKhbgvUfsK4AEX3r0.this;
                zzkhbgvufsk4aex3r02.f4347THTDvPxsHqMeGb512f = 2;
                zzkhbgvufsk4aex3r02.xHA29AmDt6y96AnB3t();
            }
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zZKhbgvUfsK4AEX3r0.this.zaq8hOURtfwbcX17cG(500);
        }
    }

    public class s3fjYDxWOUexjjVgyA extends RecyclerView.Y43RdunnpKgpbny0lE {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Y43RdunnpKgpbny0lE
        public void s3fjYDxWOUexjjVgyA(RecyclerView recyclerView, int i, int i2) {
            zZKhbgvUfsK4AEX3r0.this.ao3wqKm5CXFuvC0q47(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.zZKhbgvUfsK4AEX3r0$zZKhbgvUfsK4AEX3r0, reason: collision with other inner class name */
    public class C0054zZKhbgvUfsK4AEX3r0 implements ValueAnimator.AnimatorUpdateListener {
        public C0054zZKhbgvUfsK4AEX3r0() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            zZKhbgvUfsK4AEX3r0.this.f4338HJFh0TGMpafqLE9haL.setAlpha(iFloatValue);
            zZKhbgvUfsK4AEX3r0.this.f4362zZKhbgvUfsK4AEX3r0.setAlpha(iFloatValue);
            zZKhbgvUfsK4AEX3r0.this.xHA29AmDt6y96AnB3t();
        }
    }

    public zZKhbgvUfsK4AEX3r0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4349WWC27LAMFqFFBzfbNw = valueAnimatorOfFloat;
        this.f4347THTDvPxsHqMeGb512f = 0;
        this.f4353ao3wqKm5CXFuvC0q47 = new lEeR5KfoEr4xU5yHH7();
        this.f4343OUd9THiLjZndMj0qdF = new s3fjYDxWOUexjjVgyA();
        this.f4338HJFh0TGMpafqLE9haL = stateListDrawable;
        this.f4362zZKhbgvUfsK4AEX3r0 = drawable;
        this.f4346TCyPEKSzIyweCN5yp1 = stateListDrawable2;
        this.f4339IPyIQcaNa8aB7drBED = drawable2;
        this.f4356husNiw3snxdgZPAGJm = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4340KYHag8HRDlnO3X9zmZ = Math.max(i, drawable.getIntrinsicWidth());
        this.f4358pbVGzGjWvY2LDXC8vo = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4336Acstmh57AKoSEkEFNJ = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4357lEeR5KfoEr4xU5yHH7 = i2;
        this.f4359s3fjYDxWOUexjjVgyA = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new HJFh0TGMpafqLE9haL());
        valueAnimatorOfFloat.addUpdateListener(new C0054zZKhbgvUfsK4AEX3r0());
        Acstmh57AKoSEkEFNJ(recyclerView);
    }

    public final int A49QRPHynYLCBN0SqP(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public void Acstmh57AKoSEkEFNJ(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4350Y43RdunnpKgpbny0lE;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e54J8UWNHWALQNixXM();
        }
        this.f4350Y43RdunnpKgpbny0lE = recyclerView;
        if (recyclerView != null) {
            WWC27LAMFqFFBzfbNw();
        }
    }

    public boolean G7AC3DWIx9i9fdanjk(float f, float f2) {
        if (!Y43RdunnpKgpbny0lE() ? f >= this.f4363zaq8hOURtfwbcX17cG - this.f4356husNiw3snxdgZPAGJm : f <= this.f4356husNiw3snxdgZPAGJm / 2) {
            int i = this.f4354e54J8UWNHWALQNixXM;
            int i2 = this.f4351Z9WdNiOsPR0y54zHW4;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.sTkWmhpZ5b1ArQIw4K
    public void HJFh0TGMpafqLE9haL(boolean z) {
    }

    public final void LIMtzhnLwQyigzK0KO(int i) {
        Z9WdNiOsPR0y54zHW4();
        this.f4350Y43RdunnpKgpbny0lE.postDelayed(this.f4353ao3wqKm5CXFuvC0q47, i);
    }

    public final int[] OANkd3mP6AYvwbNLJM() {
        int[] iArr = this.f4335A49QRPHynYLCBN0SqP;
        int i = this.f4359s3fjYDxWOUexjjVgyA;
        iArr[0] = i;
        iArr[1] = this.f4360sTkWmhpZ5b1ArQIw4K - i;
        return iArr;
    }

    public final void OUd9THiLjZndMj0qdF(float f) {
        int[] iArrOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM();
        float fMax = Math.max(iArrOANkd3mP6AYvwbNLJM[0], Math.min(iArrOANkd3mP6AYvwbNLJM[1], f));
        if (Math.abs(this.f4354e54J8UWNHWALQNixXM - fMax) < 2.0f) {
            return;
        }
        int iA49QRPHynYLCBN0SqP = A49QRPHynYLCBN0SqP(this.f4345T9PhQIpGRhE4yZDm1C, fMax, iArrOANkd3mP6AYvwbNLJM, this.f4350Y43RdunnpKgpbny0lE.computeVerticalScrollRange(), this.f4350Y43RdunnpKgpbny0lE.computeVerticalScrollOffset(), this.f4360sTkWmhpZ5b1ArQIw4K);
        if (iA49QRPHynYLCBN0SqP != 0) {
            this.f4350Y43RdunnpKgpbny0lE.scrollBy(0, iA49QRPHynYLCBN0SqP);
        }
        this.f4345T9PhQIpGRhE4yZDm1C = fMax;
    }

    public boolean R9SAhYMerGybF9OAjL(float f, float f2) {
        if (f2 >= this.f4360sTkWmhpZ5b1ArQIw4K - this.f4358pbVGzGjWvY2LDXC8vo) {
            int i = this.f4352aPyGSIylzVNKPT1Bls;
            int i2 = this.f4355hoXrIDAFrSwfShk8da;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    public final void T9PhQIpGRhE4yZDm1C(Canvas canvas) {
        int i = this.f4360sTkWmhpZ5b1ArQIw4K;
        int i2 = this.f4358pbVGzGjWvY2LDXC8vo;
        int i3 = this.f4352aPyGSIylzVNKPT1Bls;
        int i4 = this.f4355hoXrIDAFrSwfShk8da;
        this.f4346TCyPEKSzIyweCN5yp1.setBounds(0, 0, i4, i2);
        this.f4339IPyIQcaNa8aB7drBED.setBounds(0, 0, this.f4363zaq8hOURtfwbcX17cG, this.f4336Acstmh57AKoSEkEFNJ);
        canvas.translate(0.0f, i - i2);
        this.f4339IPyIQcaNa8aB7drBED.draw(canvas);
        canvas.translate(i3 - (i4 / 2), 0.0f);
        this.f4346TCyPEKSzIyweCN5yp1.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public void THTDvPxsHqMeGb512f() {
        int i = this.f4347THTDvPxsHqMeGb512f;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f4349WWC27LAMFqFFBzfbNw.cancel();
            }
        }
        this.f4347THTDvPxsHqMeGb512f = 1;
        ValueAnimator valueAnimator = this.f4349WWC27LAMFqFFBzfbNw;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4349WWC27LAMFqFFBzfbNw.setDuration(500L);
        this.f4349WWC27LAMFqFFBzfbNw.setStartDelay(0L);
        this.f4349WWC27LAMFqFFBzfbNw.start();
    }

    public void VItLRw50eXTZeEfGl0(int i) {
        int i2;
        if (i == 2 && this.f4361xHA29AmDt6y96AnB3t != 2) {
            this.f4338HJFh0TGMpafqLE9haL.setState(f4334jCtUeU2YI1poCxWcjm);
            Z9WdNiOsPR0y54zHW4();
        }
        if (i == 0) {
            xHA29AmDt6y96AnB3t();
        } else {
            THTDvPxsHqMeGb512f();
        }
        if (this.f4361xHA29AmDt6y96AnB3t != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1200;
            this.f4361xHA29AmDt6y96AnB3t = i;
        }
        this.f4338HJFh0TGMpafqLE9haL.setState(f4333XzJ1BS7H9Ilbkv4eVM);
        LIMtzhnLwQyigzK0KO(i2);
        this.f4361xHA29AmDt6y96AnB3t = i;
    }

    public final void WWC27LAMFqFFBzfbNw() {
        this.f4350Y43RdunnpKgpbny0lE.TCyPEKSzIyweCN5yp1(this);
        this.f4350Y43RdunnpKgpbny0lE.pbVGzGjWvY2LDXC8vo(this);
        this.f4350Y43RdunnpKgpbny0lE.Acstmh57AKoSEkEFNJ(this.f4343OUd9THiLjZndMj0qdF);
    }

    public final boolean Y43RdunnpKgpbny0lE() {
        return lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(this.f4350Y43RdunnpKgpbny0lE) == 1;
    }

    public final void Z9WdNiOsPR0y54zHW4() {
        this.f4350Y43RdunnpKgpbny0lE.removeCallbacks(this.f4353ao3wqKm5CXFuvC0q47);
    }

    public final int[] aPyGSIylzVNKPT1Bls() {
        int[] iArr = this.f4348VItLRw50eXTZeEfGl0;
        int i = this.f4359s3fjYDxWOUexjjVgyA;
        iArr[0] = i;
        iArr[1] = this.f4363zaq8hOURtfwbcX17cG - i;
        return iArr;
    }

    public void ao3wqKm5CXFuvC0q47(int i, int i2) {
        int iComputeVerticalScrollRange = this.f4350Y43RdunnpKgpbny0lE.computeVerticalScrollRange();
        int i3 = this.f4360sTkWmhpZ5b1ArQIw4K;
        this.f4344R9SAhYMerGybF9OAjL = iComputeVerticalScrollRange - i3 > 0 && i3 >= this.f4357lEeR5KfoEr4xU5yHH7;
        int iComputeHorizontalScrollRange = this.f4350Y43RdunnpKgpbny0lE.computeHorizontalScrollRange();
        int i4 = this.f4363zaq8hOURtfwbcX17cG;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= this.f4357lEeR5KfoEr4xU5yHH7;
        this.f4337G7AC3DWIx9i9fdanjk = z;
        boolean z2 = this.f4344R9SAhYMerGybF9OAjL;
        if (!z2 && !z) {
            if (this.f4361xHA29AmDt6y96AnB3t != 0) {
                VItLRw50eXTZeEfGl0(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f4354e54J8UWNHWALQNixXM = (int) ((f * (i2 + (f / 2.0f))) / iComputeVerticalScrollRange);
            this.f4351Z9WdNiOsPR0y54zHW4 = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.f4337G7AC3DWIx9i9fdanjk) {
            float f2 = i4;
            this.f4352aPyGSIylzVNKPT1Bls = (int) ((f2 * (i + (f2 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f4355hoXrIDAFrSwfShk8da = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = this.f4361xHA29AmDt6y96AnB3t;
        if (i5 == 0 || i5 == 1) {
            VItLRw50eXTZeEfGl0(1);
        }
    }

    public final void e54J8UWNHWALQNixXM() {
        this.f4350Y43RdunnpKgpbny0lE.tmIBXGVvBsrJ7i63G2(this);
        this.f4350Y43RdunnpKgpbny0lE.jsjSYEu4NPZjZxcfmI(this);
        this.f4350Y43RdunnpKgpbny0lE.EscIOBqRhG6irG5q11(this.f4343OUd9THiLjZndMj0qdF);
        Z9WdNiOsPR0y54zHW4();
    }

    public final void hoXrIDAFrSwfShk8da(Canvas canvas) {
        int i = this.f4363zaq8hOURtfwbcX17cG;
        int i2 = this.f4356husNiw3snxdgZPAGJm;
        int i3 = i - i2;
        int i4 = this.f4354e54J8UWNHWALQNixXM;
        int i5 = this.f4351Z9WdNiOsPR0y54zHW4;
        int i6 = i4 - (i5 / 2);
        this.f4338HJFh0TGMpafqLE9haL.setBounds(0, 0, i2, i5);
        this.f4362zZKhbgvUfsK4AEX3r0.setBounds(0, 0, this.f4340KYHag8HRDlnO3X9zmZ, this.f4360sTkWmhpZ5b1ArQIw4K);
        if (Y43RdunnpKgpbny0lE()) {
            this.f4362zZKhbgvUfsK4AEX3r0.draw(canvas);
            canvas.translate(this.f4356husNiw3snxdgZPAGJm, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f4338HJFh0TGMpafqLE9haL.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f4356husNiw3snxdgZPAGJm;
        } else {
            canvas.translate(i3, 0.0f);
            this.f4362zZKhbgvUfsK4AEX3r0.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f4338HJFh0TGMpafqLE9haL.draw(canvas);
        }
        canvas.translate(-i3, -i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.sTkWmhpZ5b1ArQIw4K
    public boolean lEeR5KfoEr4xU5yHH7(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4361xHA29AmDt6y96AnB3t;
        if (i == 1) {
            boolean zG7AC3DWIx9i9fdanjk = G7AC3DWIx9i9fdanjk(motionEvent.getX(), motionEvent.getY());
            boolean zR9SAhYMerGybF9OAjL = R9SAhYMerGybF9OAjL(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zG7AC3DWIx9i9fdanjk && !zR9SAhYMerGybF9OAjL) {
                return false;
            }
            if (zR9SAhYMerGybF9OAjL) {
                this.f4341LIMtzhnLwQyigzK0KO = 1;
                this.f4342OANkd3mP6AYvwbNLJM = (int) motionEvent.getX();
            } else if (zG7AC3DWIx9i9fdanjk) {
                this.f4341LIMtzhnLwQyigzK0KO = 2;
                this.f4345T9PhQIpGRhE4yZDm1C = (int) motionEvent.getY();
            }
            VItLRw50eXTZeEfGl0(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.hoXrIDAFrSwfShk8da
    public void pbVGzGjWvY2LDXC8vo(Canvas canvas, RecyclerView recyclerView, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (this.f4363zaq8hOURtfwbcX17cG != this.f4350Y43RdunnpKgpbny0lE.getWidth() || this.f4360sTkWmhpZ5b1ArQIw4K != this.f4350Y43RdunnpKgpbny0lE.getHeight()) {
            this.f4363zaq8hOURtfwbcX17cG = this.f4350Y43RdunnpKgpbny0lE.getWidth();
            this.f4360sTkWmhpZ5b1ArQIw4K = this.f4350Y43RdunnpKgpbny0lE.getHeight();
            VItLRw50eXTZeEfGl0(0);
        } else if (this.f4347THTDvPxsHqMeGb512f != 0) {
            if (this.f4344R9SAhYMerGybF9OAjL) {
                hoXrIDAFrSwfShk8da(canvas);
            }
            if (this.f4337G7AC3DWIx9i9fdanjk) {
                T9PhQIpGRhE4yZDm1C(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.sTkWmhpZ5b1ArQIw4K
    public void s3fjYDxWOUexjjVgyA(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4361xHA29AmDt6y96AnB3t == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zG7AC3DWIx9i9fdanjk = G7AC3DWIx9i9fdanjk(motionEvent.getX(), motionEvent.getY());
            boolean zR9SAhYMerGybF9OAjL = R9SAhYMerGybF9OAjL(motionEvent.getX(), motionEvent.getY());
            if (zG7AC3DWIx9i9fdanjk || zR9SAhYMerGybF9OAjL) {
                if (zR9SAhYMerGybF9OAjL) {
                    this.f4341LIMtzhnLwQyigzK0KO = 1;
                    this.f4342OANkd3mP6AYvwbNLJM = (int) motionEvent.getX();
                } else if (zG7AC3DWIx9i9fdanjk) {
                    this.f4341LIMtzhnLwQyigzK0KO = 2;
                    this.f4345T9PhQIpGRhE4yZDm1C = (int) motionEvent.getY();
                }
                VItLRw50eXTZeEfGl0(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f4361xHA29AmDt6y96AnB3t == 2) {
            this.f4345T9PhQIpGRhE4yZDm1C = 0.0f;
            this.f4342OANkd3mP6AYvwbNLJM = 0.0f;
            VItLRw50eXTZeEfGl0(1);
            this.f4341LIMtzhnLwQyigzK0KO = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f4361xHA29AmDt6y96AnB3t == 2) {
            THTDvPxsHqMeGb512f();
            if (this.f4341LIMtzhnLwQyigzK0KO == 1) {
                sTkWmhpZ5b1ArQIw4K(motionEvent.getX());
            }
            if (this.f4341LIMtzhnLwQyigzK0KO == 2) {
                OUd9THiLjZndMj0qdF(motionEvent.getY());
            }
        }
    }

    public final void sTkWmhpZ5b1ArQIw4K(float f) {
        int[] iArrAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls();
        float fMax = Math.max(iArrAPyGSIylzVNKPT1Bls[0], Math.min(iArrAPyGSIylzVNKPT1Bls[1], f));
        if (Math.abs(this.f4352aPyGSIylzVNKPT1Bls - fMax) < 2.0f) {
            return;
        }
        int iA49QRPHynYLCBN0SqP = A49QRPHynYLCBN0SqP(this.f4342OANkd3mP6AYvwbNLJM, fMax, iArrAPyGSIylzVNKPT1Bls, this.f4350Y43RdunnpKgpbny0lE.computeHorizontalScrollRange(), this.f4350Y43RdunnpKgpbny0lE.computeHorizontalScrollOffset(), this.f4363zaq8hOURtfwbcX17cG);
        if (iA49QRPHynYLCBN0SqP != 0) {
            this.f4350Y43RdunnpKgpbny0lE.scrollBy(iA49QRPHynYLCBN0SqP, 0);
        }
        this.f4342OANkd3mP6AYvwbNLJM = fMax;
    }

    public void xHA29AmDt6y96AnB3t() {
        this.f4350Y43RdunnpKgpbny0lE.invalidate();
    }

    public void zaq8hOURtfwbcX17cG(int i) {
        int i2 = this.f4347THTDvPxsHqMeGb512f;
        if (i2 == 1) {
            this.f4349WWC27LAMFqFFBzfbNw.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f4347THTDvPxsHqMeGb512f = 3;
        ValueAnimator valueAnimator = this.f4349WWC27LAMFqFFBzfbNw;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4349WWC27LAMFqFFBzfbNw.setDuration(i);
        this.f4349WWC27LAMFqFFBzfbNw.start();
    }
}
