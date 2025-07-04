package androidx.appcompat.widget;

import IPyIQcaNa8aB7drBED.A49QRPHynYLCBN0SqP;
import W3RZ2dTDKrKpS5Mxdk.THTDvPxsHqMeGb512f;
import W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw;
import W3RZ2dTDKrKpS5Mxdk.ao3wqKm5CXFuvC0q47;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements WWC27LAMFqFFBzfbNw, THTDvPxsHqMeGb512f {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public zXY7dgnTfw9Pd9RXel f2780A49QRPHynYLCBN0SqP;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public boolean f2781Acstmh57AKoSEkEFNJ;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public zXY7dgnTfw9Pd9RXel f2782G7AC3DWIx9i9fdanjk;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public ContentFrameLayout f2783HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f2784IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public Drawable f2785KYHag8HRDlnO3X9zmZ;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public zXY7dgnTfw9Pd9RXel f2786LIMtzhnLwQyigzK0KO;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public final Rect f2787OANkd3mP6AYvwbNLJM;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public final Runnable f2788OUd9THiLjZndMj0qdF;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public final Rect f2789R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public final Rect f2790T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f2791TCyPEKSzIyweCN5yp1;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public final AnimatorListenerAdapter f2792THTDvPxsHqMeGb512f;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public OverScroller f2793VItLRw50eXTZeEfGl0;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public ViewPropertyAnimator f2794WWC27LAMFqFFBzfbNw;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public final KYHag8HRDlnO3X9zmZ f2795XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public final Rect f2796Y43RdunnpKgpbny0lE;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public int f2797Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public final Rect f2798aPyGSIylzVNKPT1Bls;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public final Runnable f2799ao3wqKm5CXFuvC0q47;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public int f2800e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public final Rect f2801hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public A49QRPHynYLCBN0SqP f2802husNiw3snxdgZPAGJm;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public final ao3wqKm5CXFuvC0q47 f2803jCtUeU2YI1poCxWcjm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f2804lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f2805pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2806s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public final Rect f2807sTkWmhpZ5b1ArQIw4K;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public zXY7dgnTfw9Pd9RXel f2808xHA29AmDt6y96AnB3t;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public ActionBarContainer f2809zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public final Rect f2810zaq8hOURtfwbcX17cG;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public static final int[] f2779tXWeW0sqVddf7ZBflq = {lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6282s3fjYDxWOUexjjVgyA, R.attr.windowContentOverlay};

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public static final zXY7dgnTfw9Pd9RXel f2778W3RZ2dTDKrKpS5Mxdk = new zXY7dgnTfw9Pd9RXel.s3fjYDxWOUexjjVgyA().zZKhbgvUfsK4AEX3r0(VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(0, 1, 0, 1)).lEeR5KfoEr4xU5yHH7();

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public static final Rect f2777OqIo5QF00RDxUQb4qq = new Rect();

    public class HJFh0TGMpafqLE9haL implements Runnable {
        public HJFh0TGMpafqLE9haL() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.T9PhQIpGRhE4yZDm1C();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2794WWC27LAMFqFFBzfbNw = actionBarOverlayLayout.f2809zZKhbgvUfsK4AEX3r0.animate().translationY(-ActionBarOverlayLayout.this.f2809zZKhbgvUfsK4AEX3r0.getHeight()).setListener(ActionBarOverlayLayout.this.f2792THTDvPxsHqMeGb512f);
        }
    }

    public static final class KYHag8HRDlnO3X9zmZ extends View {
        public KYHag8HRDlnO3X9zmZ(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public static class husNiw3snxdgZPAGJm extends ViewGroup.MarginLayoutParams {
        public husNiw3snxdgZPAGJm(int i, int i2) {
            super(i, i2);
        }

        public husNiw3snxdgZPAGJm(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public husNiw3snxdgZPAGJm(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class lEeR5KfoEr4xU5yHH7 extends AnimatorListenerAdapter {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2794WWC27LAMFqFFBzfbNw = null;
            actionBarOverlayLayout.f2781Acstmh57AKoSEkEFNJ = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2794WWC27LAMFqFFBzfbNw = null;
            actionBarOverlayLayout.f2781Acstmh57AKoSEkEFNJ = false;
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.T9PhQIpGRhE4yZDm1C();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2794WWC27LAMFqFFBzfbNw = actionBarOverlayLayout.f2809zZKhbgvUfsK4AEX3r0.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f2792THTDvPxsHqMeGb512f);
        }
    }

    public interface zZKhbgvUfsK4AEX3r0 {
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2806s3fjYDxWOUexjjVgyA = 0;
        this.f2790T9PhQIpGRhE4yZDm1C = new Rect();
        this.f2801hoXrIDAFrSwfShk8da = new Rect();
        this.f2798aPyGSIylzVNKPT1Bls = new Rect();
        this.f2787OANkd3mP6AYvwbNLJM = new Rect();
        this.f2810zaq8hOURtfwbcX17cG = new Rect();
        this.f2807sTkWmhpZ5b1ArQIw4K = new Rect();
        this.f2796Y43RdunnpKgpbny0lE = new Rect();
        this.f2789R9SAhYMerGybF9OAjL = new Rect();
        zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel = zXY7dgnTfw9Pd9RXel.f1921s3fjYDxWOUexjjVgyA;
        this.f2782G7AC3DWIx9i9fdanjk = zxy7dgntfw9pd9rxel;
        this.f2808xHA29AmDt6y96AnB3t = zxy7dgntfw9pd9rxel;
        this.f2786LIMtzhnLwQyigzK0KO = zxy7dgntfw9pd9rxel;
        this.f2780A49QRPHynYLCBN0SqP = zxy7dgntfw9pd9rxel;
        this.f2792THTDvPxsHqMeGb512f = new lEeR5KfoEr4xU5yHH7();
        this.f2799ao3wqKm5CXFuvC0q47 = new s3fjYDxWOUexjjVgyA();
        this.f2788OUd9THiLjZndMj0qdF = new HJFh0TGMpafqLE9haL();
        hoXrIDAFrSwfShk8da(context);
        this.f2803jCtUeU2YI1poCxWcjm = new ao3wqKm5CXFuvC0q47(this);
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = new KYHag8HRDlnO3X9zmZ(context);
        this.f2795XzJ1BS7H9Ilbkv4eVM = kYHag8HRDlnO3X9zmZ;
        addView(kYHag8HRDlnO3X9zmZ);
    }

    @Override // android.view.ViewGroup
    /* renamed from: Acstmh57AKoSEkEFNJ, reason: merged with bridge method [inline-methods] */
    public husNiw3snxdgZPAGJm generateDefaultLayoutParams() {
        return new husNiw3snxdgZPAGJm(-1, -1);
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void HJFh0TGMpafqLE9haL(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean IPyIQcaNa8aB7drBED(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$husNiw3snxdgZPAGJm r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.husNiw3snxdgZPAGJm) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.IPyIQcaNa8aB7drBED(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public boolean KYHag8HRDlnO3X9zmZ(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void OANkd3mP6AYvwbNLJM() {
        T9PhQIpGRhE4yZDm1C();
        postDelayed(this.f2799ao3wqKm5CXFuvC0q47, 600L);
    }

    public void T9PhQIpGRhE4yZDm1C() {
        removeCallbacks(this.f2799ao3wqKm5CXFuvC0q47);
        removeCallbacks(this.f2788OUd9THiLjZndMj0qdF);
        ViewPropertyAnimator viewPropertyAnimator = this.f2794WWC27LAMFqFFBzfbNw;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void TCyPEKSzIyweCN5yp1() {
        T9PhQIpGRhE4yZDm1C();
        this.f2788OUd9THiLjZndMj0qdF.run();
    }

    public final boolean Y43RdunnpKgpbny0lE(float f) {
        this.f2793VItLRw50eXTZeEfGl0.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f2793VItLRw50eXTZeEfGl0.getFinalY() > this.f2809zZKhbgvUfsK4AEX3r0.getHeight();
    }

    @Override // android.view.ViewGroup
    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: merged with bridge method [inline-methods] */
    public husNiw3snxdgZPAGJm generateLayoutParams(AttributeSet attributeSet) {
        return new husNiw3snxdgZPAGJm(getContext(), attributeSet);
    }

    public final void aPyGSIylzVNKPT1Bls() {
        T9PhQIpGRhE4yZDm1C();
        postDelayed(this.f2788OUd9THiLjZndMj0qdF, 600L);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof husNiw3snxdgZPAGJm;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2785KYHag8HRDlnO3X9zmZ != null) {
            int bottom = this.f2809zZKhbgvUfsK4AEX3r0.getVisibility() == 0 ? (int) (this.f2809zZKhbgvUfsK4AEX3r0.getBottom() + this.f2809zZKhbgvUfsK4AEX3r0.getTranslationY() + 0.5f) : 0;
            this.f2785KYHag8HRDlnO3X9zmZ.setBounds(0, bottom, getWidth(), this.f2785KYHag8HRDlnO3X9zmZ.getIntrinsicHeight() + bottom);
            this.f2785KYHag8HRDlnO3X9zmZ.draw(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final A49QRPHynYLCBN0SqP e54J8UWNHWALQNixXM(View view) {
        if (view instanceof A49QRPHynYLCBN0SqP) {
            return (A49QRPHynYLCBN0SqP) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2809zZKhbgvUfsK4AEX3r0;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2803jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7();
    }

    public CharSequence getTitle() {
        zaq8hOURtfwbcX17cG();
        return this.f2802husNiw3snxdgZPAGJm.getTitle();
    }

    public final void hoXrIDAFrSwfShk8da(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2779tXWeW0sqVddf7ZBflq);
        this.f2804lEeR5KfoEr4xU5yHH7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f2785KYHag8HRDlnO3X9zmZ = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f2793VItLRw50eXTZeEfGl0 = new OverScroller(context);
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void husNiw3snxdgZPAGJm(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void lEeR5KfoEr4xU5yHH7(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        zaq8hOURtfwbcX17cG();
        zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk = zXY7dgnTfw9Pd9RXel.G7AC3DWIx9i9fdanjk(windowInsets, this);
        boolean zIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(this.f2809zZKhbgvUfsK4AEX3r0, new Rect(zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo(), zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk.Z9WdNiOsPR0y54zHW4(), zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk.Acstmh57AKoSEkEFNJ(), zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk.IPyIQcaNa8aB7drBED()), true, true, false, true);
        lLKzvdU99Iw80uVD5I.husNiw3snxdgZPAGJm(this, zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk, this.f2790T9PhQIpGRhE4yZDm1C);
        Rect rect = this.f2790T9PhQIpGRhE4yZDm1C;
        zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxelE54J8UWNHWALQNixXM = zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk.e54J8UWNHWALQNixXM(rect.left, rect.top, rect.right, rect.bottom);
        this.f2782G7AC3DWIx9i9fdanjk = zxy7dgntfw9pd9rxelE54J8UWNHWALQNixXM;
        boolean z = true;
        if (!this.f2808xHA29AmDt6y96AnB3t.equals(zxy7dgntfw9pd9rxelE54J8UWNHWALQNixXM)) {
            this.f2808xHA29AmDt6y96AnB3t = this.f2782G7AC3DWIx9i9fdanjk;
            zIPyIQcaNa8aB7drBED = true;
        }
        if (this.f2801hoXrIDAFrSwfShk8da.equals(this.f2790T9PhQIpGRhE4yZDm1C)) {
            z = zIPyIQcaNa8aB7drBED;
        } else {
            this.f2801hoXrIDAFrSwfShk8da.set(this.f2790T9PhQIpGRhE4yZDm1C);
        }
        if (z) {
            requestLayout();
        }
        return zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk.lEeR5KfoEr4xU5yHH7().HJFh0TGMpafqLE9haL().s3fjYDxWOUexjjVgyA().Y43RdunnpKgpbny0lE();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hoXrIDAFrSwfShk8da(getContext());
        lLKzvdU99Iw80uVD5I.ctWLFN70QQINH1kyYo(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T9PhQIpGRhE4yZDm1C();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxelLEeR5KfoEr4xU5yHH7;
        zaq8hOURtfwbcX17cG();
        measureChildWithMargins(this.f2809zZKhbgvUfsK4AEX3r0, i, 0, i2, 0);
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) this.f2809zZKhbgvUfsK4AEX3r0.getLayoutParams();
        int iMax = Math.max(0, this.f2809zZKhbgvUfsK4AEX3r0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).leftMargin + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).rightMargin);
        int iMax2 = Math.max(0, this.f2809zZKhbgvUfsK4AEX3r0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).topMargin + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2809zZKhbgvUfsK4AEX3r0.getMeasuredState());
        boolean z = (lLKzvdU99Iw80uVD5I.OqIo5QF00RDxUQb4qq(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f2804lEeR5KfoEr4xU5yHH7;
            if (this.f2784IPyIQcaNa8aB7drBED && this.f2809zZKhbgvUfsK4AEX3r0.getTabContainer() != null) {
                measuredHeight += this.f2804lEeR5KfoEr4xU5yHH7;
            }
        } else {
            measuredHeight = this.f2809zZKhbgvUfsK4AEX3r0.getVisibility() != 8 ? this.f2809zZKhbgvUfsK4AEX3r0.getMeasuredHeight() : 0;
        }
        this.f2798aPyGSIylzVNKPT1Bls.set(this.f2790T9PhQIpGRhE4yZDm1C);
        this.f2786LIMtzhnLwQyigzK0KO = this.f2782G7AC3DWIx9i9fdanjk;
        if (this.f2791TCyPEKSzIyweCN5yp1 || z || !pbVGzGjWvY2LDXC8vo()) {
            zxy7dgntfw9pd9rxelLEeR5KfoEr4xU5yHH7 = new zXY7dgnTfw9Pd9RXel.s3fjYDxWOUexjjVgyA(this.f2786LIMtzhnLwQyigzK0KO).zZKhbgvUfsK4AEX3r0(VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(this.f2786LIMtzhnLwQyigzK0KO.pbVGzGjWvY2LDXC8vo(), this.f2786LIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4() + measuredHeight, this.f2786LIMtzhnLwQyigzK0KO.Acstmh57AKoSEkEFNJ(), this.f2786LIMtzhnLwQyigzK0KO.IPyIQcaNa8aB7drBED())).lEeR5KfoEr4xU5yHH7();
        } else {
            Rect rect = this.f2798aPyGSIylzVNKPT1Bls;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            zxy7dgntfw9pd9rxelLEeR5KfoEr4xU5yHH7 = this.f2786LIMtzhnLwQyigzK0KO.e54J8UWNHWALQNixXM(0, measuredHeight, 0, 0);
        }
        this.f2786LIMtzhnLwQyigzK0KO = zxy7dgntfw9pd9rxelLEeR5KfoEr4xU5yHH7;
        IPyIQcaNa8aB7drBED(this.f2783HJFh0TGMpafqLE9haL, this.f2798aPyGSIylzVNKPT1Bls, true, true, true, true);
        if (!this.f2780A49QRPHynYLCBN0SqP.equals(this.f2786LIMtzhnLwQyigzK0KO)) {
            zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel = this.f2786LIMtzhnLwQyigzK0KO;
            this.f2780A49QRPHynYLCBN0SqP = zxy7dgntfw9pd9rxel;
            lLKzvdU99Iw80uVD5I.KYHag8HRDlnO3X9zmZ(this.f2783HJFh0TGMpafqLE9haL, zxy7dgntfw9pd9rxel);
        }
        measureChildWithMargins(this.f2783HJFh0TGMpafqLE9haL, i, 0, i2, 0);
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm2 = (husNiw3snxdgZPAGJm) this.f2783HJFh0TGMpafqLE9haL.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f2783HJFh0TGMpafqLE9haL.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm2).leftMargin + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f2783HJFh0TGMpafqLE9haL.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm2).topMargin + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2783HJFh0TGMpafqLE9haL.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f2805pbVGzGjWvY2LDXC8vo || !z) {
            return false;
        }
        if (Y43RdunnpKgpbny0lE(f2)) {
            TCyPEKSzIyweCN5yp1();
        } else {
            sTkWmhpZ5b1ArQIw4K();
        }
        this.f2781Acstmh57AKoSEkEFNJ = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f2797Z9WdNiOsPR0y54zHW4 + i2;
        this.f2797Z9WdNiOsPR0y54zHW4 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2803jCtUeU2YI1poCxWcjm.s3fjYDxWOUexjjVgyA(view, view2, i);
        this.f2797Z9WdNiOsPR0y54zHW4 = getActionBarHideOffset();
        T9PhQIpGRhE4yZDm1C();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2809zZKhbgvUfsK4AEX3r0.getVisibility() != 0) {
            return false;
        }
        return this.f2805pbVGzGjWvY2LDXC8vo;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (!this.f2805pbVGzGjWvY2LDXC8vo || this.f2781Acstmh57AKoSEkEFNJ) {
            return;
        }
        if (this.f2797Z9WdNiOsPR0y54zHW4 <= this.f2809zZKhbgvUfsK4AEX3r0.getHeight()) {
            OANkd3mP6AYvwbNLJM();
        } else {
            aPyGSIylzVNKPT1Bls();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        zaq8hOURtfwbcX17cG();
        this.f2800e54J8UWNHWALQNixXM = i;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2806s3fjYDxWOUexjjVgyA = i;
    }

    public final boolean pbVGzGjWvY2LDXC8vo() {
        lLKzvdU99Iw80uVD5I.husNiw3snxdgZPAGJm(this.f2795XzJ1BS7H9Ilbkv4eVM, f2778W3RZ2dTDKrKpS5Mxdk, this.f2787OANkd3mP6AYvwbNLJM);
        return !this.f2787OANkd3mP6AYvwbNLJM.equals(f2777OqIo5QF00RDxUQb4qq);
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void s3fjYDxWOUexjjVgyA(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void sTkWmhpZ5b1ArQIw4K() {
        T9PhQIpGRhE4yZDm1C();
        this.f2799ao3wqKm5CXFuvC0q47.run();
    }

    public void setActionBarHideOffset(int i) {
        T9PhQIpGRhE4yZDm1C();
        this.f2809zZKhbgvUfsK4AEX3r0.setTranslationY(-Math.max(0, Math.min(i, this.f2809zZKhbgvUfsK4AEX3r0.getHeight())));
    }

    public void setActionBarVisibilityCallback(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2784IPyIQcaNa8aB7drBED = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2805pbVGzGjWvY2LDXC8vo) {
            this.f2805pbVGzGjWvY2LDXC8vo = z;
            if (z) {
                return;
            }
            T9PhQIpGRhE4yZDm1C();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        zaq8hOURtfwbcX17cG();
        this.f2802husNiw3snxdgZPAGJm.setIcon(i);
    }

    public void setLogo(int i) {
        zaq8hOURtfwbcX17cG();
        this.f2802husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(i);
    }

    public void setOverlayMode(boolean z) {
        this.f2791TCyPEKSzIyweCN5yp1 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        zaq8hOURtfwbcX17cG();
        this.f2802husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        zaq8hOURtfwbcX17cG();
        this.f2802husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.THTDvPxsHqMeGb512f
    public void zZKhbgvUfsK4AEX3r0(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        husNiw3snxdgZPAGJm(view, i, i2, i3, i4, i5);
    }

    public void zaq8hOURtfwbcX17cG() {
        if (this.f2783HJFh0TGMpafqLE9haL == null) {
            this.f2783HJFh0TGMpafqLE9haL = (ContentFrameLayout) findViewById(lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm.f6264s3fjYDxWOUexjjVgyA);
            this.f2809zZKhbgvUfsK4AEX3r0 = (ActionBarContainer) findViewById(lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm.f6251HJFh0TGMpafqLE9haL);
            this.f2802husNiw3snxdgZPAGJm = e54J8UWNHWALQNixXM(findViewById(lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm.f6262lEeR5KfoEr4xU5yHH7));
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new husNiw3snxdgZPAGJm(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        zaq8hOURtfwbcX17cG();
        this.f2802husNiw3snxdgZPAGJm.setIcon(drawable);
    }
}
