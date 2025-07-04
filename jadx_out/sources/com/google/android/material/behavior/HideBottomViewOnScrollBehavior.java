package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.activity.zZKhbgvUfsK4AEX3r0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.s3fjYDxWOUexjjVgyA {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static final int f4793Acstmh57AKoSEkEFNJ = tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7143Y43RdunnpKgpbny0lE;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final int f4794Z9WdNiOsPR0y54zHW4 = tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7128G7AC3DWIx9i9fdanjk;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public static final int f4795e54J8UWNHWALQNixXM = tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7141WWC27LAMFqFFBzfbNw;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f4796HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f4797IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f4798KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f4799TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public TimeInterpolator f4800husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final LinkedHashSet f4801lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public ViewPropertyAnimator f4802pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f4803s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public TimeInterpolator f4804zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 extends AnimatorListenerAdapter {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f4802pbVGzGjWvY2LDXC8vo = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f4801lEeR5KfoEr4xU5yHH7 = new LinkedHashSet();
        this.f4798KYHag8HRDlnO3X9zmZ = 0;
        this.f4799TCyPEKSzIyweCN5yp1 = 2;
        this.f4797IPyIQcaNa8aB7drBED = 0;
    }

    public void DfpieXfdYs58yZAiXY(View view, boolean z) {
        if (W3RZ2dTDKrKpS5Mxdk()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4802pbVGzGjWvY2LDXC8vo;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        PPkm9uUfOJHHYveeLT(view, 1);
        int i = this.f4798KYHag8HRDlnO3X9zmZ + this.f4797IPyIQcaNa8aB7drBED;
        if (z) {
            tXWeW0sqVddf7ZBflq(view, i, this.f4796HJFh0TGMpafqLE9haL, this.f4800husNiw3snxdgZPAGJm);
        } else {
            view.setTranslationY(i);
        }
    }

    public void GyWRxpdt1T8mEJXPoD(View view) {
        DfpieXfdYs58yZAiXY(view, true);
    }

    public void KqgKJKIWne3kz1AdHk(View view, boolean z) {
        if (OqIo5QF00RDxUQb4qq()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4802pbVGzGjWvY2LDXC8vo;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        PPkm9uUfOJHHYveeLT(view, 2);
        if (z) {
            tXWeW0sqVddf7ZBflq(view, 0, this.f4803s3fjYDxWOUexjjVgyA, this.f4804zZKhbgvUfsK4AEX3r0);
        } else {
            view.setTranslationY(0);
        }
    }

    public boolean OqIo5QF00RDxUQb4qq() {
        return this.f4799TCyPEKSzIyweCN5yp1 == 2;
    }

    public final void PPkm9uUfOJHHYveeLT(View view, int i) {
        this.f4799TCyPEKSzIyweCN5yp1 = i;
        Iterator it = this.f4801lEeR5KfoEr4xU5yHH7.iterator();
        if (it.hasNext()) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public void R9SAhYMerGybF9OAjL(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            GyWRxpdt1T8mEJXPoD(view);
        } else if (i2 < 0) {
            e2F9F6h8YJxTHwLCa0(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean THTDvPxsHqMeGb512f(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public boolean W3RZ2dTDKrKpS5Mxdk() {
        return this.f4799TCyPEKSzIyweCN5yp1 == 1;
    }

    public void e2F9F6h8YJxTHwLCa0(View view) {
        KqgKJKIWne3kz1AdHk(view, true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f4798KYHag8HRDlnO3X9zmZ = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f4803s3fjYDxWOUexjjVgyA = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(view.getContext(), f4793Acstmh57AKoSEkEFNJ, 225);
        this.f4796HJFh0TGMpafqLE9haL = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(view.getContext(), f4794Z9WdNiOsPR0y54zHW4, 175);
        Context context = view.getContext();
        int i2 = f4795e54J8UWNHWALQNixXM;
        this.f4804zZKhbgvUfsK4AEX3r0 = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1(context, i2, jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6199zZKhbgvUfsK4AEX3r0);
        this.f4800husNiw3snxdgZPAGJm = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1(view.getContext(), i2, jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6195HJFh0TGMpafqLE9haL);
        return super.e54J8UWNHWALQNixXM(coordinatorLayout, view, i);
    }

    public final void tXWeW0sqVddf7ZBflq(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f4802pbVGzGjWvY2LDXC8vo = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new lEeR5KfoEr4xU5yHH7());
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4801lEeR5KfoEr4xU5yHH7 = new LinkedHashSet();
        this.f4798KYHag8HRDlnO3X9zmZ = 0;
        this.f4799TCyPEKSzIyweCN5yp1 = 2;
        this.f4797IPyIQcaNa8aB7drBED = 0;
    }
}
