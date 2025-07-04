package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm;
import lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int f2756Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public View f2757HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f2758IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public Drawable f2759KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public Drawable f2760TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public Drawable f2761husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f2762lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f2763pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public View f2764s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public View f2765zZKhbgvUfsK4AEX3r0;

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void lEeR5KfoEr4xU5yHH7(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pbVGzGjWvY2LDXC8vo.f6408lEeR5KfoEr4xU5yHH7);
        this.f2761husNiw3snxdgZPAGJm = typedArrayObtainStyledAttributes.getDrawable(pbVGzGjWvY2LDXC8vo.f6421s3fjYDxWOUexjjVgyA);
        this.f2759KYHag8HRDlnO3X9zmZ = typedArrayObtainStyledAttributes.getDrawable(pbVGzGjWvY2LDXC8vo.f6447zZKhbgvUfsK4AEX3r0);
        this.f2756Acstmh57AKoSEkEFNJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(pbVGzGjWvY2LDXC8vo.f6417pbVGzGjWvY2LDXC8vo, -1);
        boolean z = true;
        if (getId() == husNiw3snxdgZPAGJm.f6258aPyGSIylzVNKPT1Bls) {
            this.f2758IPyIQcaNa8aB7drBED = true;
            this.f2760TCyPEKSzIyweCN5yp1 = typedArrayObtainStyledAttributes.getDrawable(pbVGzGjWvY2LDXC8vo.f6306HJFh0TGMpafqLE9haL);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f2758IPyIQcaNa8aB7drBED ? this.f2761husNiw3snxdgZPAGJm != null || this.f2759KYHag8HRDlnO3X9zmZ != null : this.f2760TCyPEKSzIyweCN5yp1 != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2761husNiw3snxdgZPAGJm;
        if (drawable != null && drawable.isStateful()) {
            this.f2761husNiw3snxdgZPAGJm.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2759KYHag8HRDlnO3X9zmZ;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2759KYHag8HRDlnO3X9zmZ.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2760TCyPEKSzIyweCN5yp1;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2760TCyPEKSzIyweCN5yp1.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f2764s3fjYDxWOUexjjVgyA;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2761husNiw3snxdgZPAGJm;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2759KYHag8HRDlnO3X9zmZ;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2760TCyPEKSzIyweCN5yp1;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final int lEeR5KfoEr4xU5yHH7(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2757HJFh0TGMpafqLE9haL = findViewById(husNiw3snxdgZPAGJm.f6262lEeR5KfoEr4xU5yHH7);
        this.f2765zZKhbgvUfsK4AEX3r0 = findViewById(husNiw3snxdgZPAGJm.f6253KYHag8HRDlnO3X9zmZ);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2762lEeR5KfoEr4xU5yHH7 || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v9 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:32:0x009d, B:34:0x00a1, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f2764s3fjYDxWOUexjjVgyA
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f2758IPyIQcaNa8aB7drBED
            if (r6 == 0) goto L4a
            android.graphics.drawable.Drawable r5 = r4.f2760TCyPEKSzIyweCN5yp1
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lb6
        L48:
            r9 = r0
            goto Lb6
        L4a:
            android.graphics.drawable.Drawable r6 = r4.f2761husNiw3snxdgZPAGJm
            if (r6 == 0) goto L9b
            android.view.View r6 = r4.f2757HJFh0TGMpafqLE9haL
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L74
            android.graphics.drawable.Drawable r6 = r4.f2761husNiw3snxdgZPAGJm
            android.view.View r7 = r4.f2757HJFh0TGMpafqLE9haL
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f2757HJFh0TGMpafqLE9haL
            int r8 = r8.getTop()
            android.view.View r0 = r4.f2757HJFh0TGMpafqLE9haL
            int r0 = r0.getRight()
            android.view.View r2 = r4.f2757HJFh0TGMpafqLE9haL
        L6c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L9a
        L74:
            android.view.View r6 = r4.f2765zZKhbgvUfsK4AEX3r0
            if (r6 == 0) goto L95
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L95
            android.graphics.drawable.Drawable r6 = r4.f2761husNiw3snxdgZPAGJm
            android.view.View r7 = r4.f2765zZKhbgvUfsK4AEX3r0
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f2765zZKhbgvUfsK4AEX3r0
            int r8 = r8.getTop()
            android.view.View r0 = r4.f2765zZKhbgvUfsK4AEX3r0
            int r0 = r0.getRight()
            android.view.View r2 = r4.f2765zZKhbgvUfsK4AEX3r0
            goto L6c
        L95:
            android.graphics.drawable.Drawable r6 = r4.f2761husNiw3snxdgZPAGJm
            r6.setBounds(r0, r0, r0, r0)
        L9a:
            r0 = r9
        L9b:
            r4.f2763pbVGzGjWvY2LDXC8vo = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f2759KYHag8HRDlnO3X9zmZ
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lb6:
            if (r9 == 0) goto Lbb
            r4.invalidate()
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f2757HJFh0TGMpafqLE9haL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f2756Acstmh57AKoSEkEFNJ
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f2757HJFh0TGMpafqLE9haL
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f2764s3fjYDxWOUexjjVgyA
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f2757HJFh0TGMpafqLE9haL
            boolean r0 = r3.s3fjYDxWOUexjjVgyA(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f2757HJFh0TGMpafqLE9haL
        L42:
            int r0 = r3.lEeR5KfoEr4xU5yHH7(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f2765zZKhbgvUfsK4AEX3r0
            boolean r0 = r3.s3fjYDxWOUexjjVgyA(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f2765zZKhbgvUfsK4AEX3r0
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f2764s3fjYDxWOUexjjVgyA
            int r1 = r3.lEeR5KfoEr4xU5yHH7(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final boolean s3fjYDxWOUexjjVgyA(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2761husNiw3snxdgZPAGJm;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2761husNiw3snxdgZPAGJm);
        }
        this.f2761husNiw3snxdgZPAGJm = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2757HJFh0TGMpafqLE9haL;
            if (view != null) {
                this.f2761husNiw3snxdgZPAGJm.setBounds(view.getLeft(), this.f2757HJFh0TGMpafqLE9haL.getTop(), this.f2757HJFh0TGMpafqLE9haL.getRight(), this.f2757HJFh0TGMpafqLE9haL.getBottom());
            }
        }
        boolean z = false;
        if (!this.f2758IPyIQcaNa8aB7drBED ? !(this.f2761husNiw3snxdgZPAGJm != null || this.f2759KYHag8HRDlnO3X9zmZ != null) : this.f2760TCyPEKSzIyweCN5yp1 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2760TCyPEKSzIyweCN5yp1;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2760TCyPEKSzIyweCN5yp1);
        }
        this.f2760TCyPEKSzIyweCN5yp1 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2758IPyIQcaNa8aB7drBED && (drawable2 = this.f2760TCyPEKSzIyweCN5yp1) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2758IPyIQcaNa8aB7drBED ? !(this.f2761husNiw3snxdgZPAGJm != null || this.f2759KYHag8HRDlnO3X9zmZ != null) : this.f2760TCyPEKSzIyweCN5yp1 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2759KYHag8HRDlnO3X9zmZ;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2759KYHag8HRDlnO3X9zmZ);
        }
        this.f2759KYHag8HRDlnO3X9zmZ = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2763pbVGzGjWvY2LDXC8vo && (drawable2 = this.f2759KYHag8HRDlnO3X9zmZ) != null) {
                drawable2.setBounds(this.f2764s3fjYDxWOUexjjVgyA.getLeft(), this.f2764s3fjYDxWOUexjjVgyA.getTop(), this.f2764s3fjYDxWOUexjjVgyA.getRight(), this.f2764s3fjYDxWOUexjjVgyA.getBottom());
            }
        }
        boolean z = false;
        if (!this.f2758IPyIQcaNa8aB7drBED ? !(this.f2761husNiw3snxdgZPAGJm != null || this.f2759KYHag8HRDlnO3X9zmZ != null) : this.f2760TCyPEKSzIyweCN5yp1 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this);
    }

    public void setTabContainer(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        View view = this.f2764s3fjYDxWOUexjjVgyA;
        if (view != null) {
            removeView(view);
        }
        this.f2764s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL;
    }

    public void setTransitioning(boolean z) {
        this.f2762lEeR5KfoEr4xU5yHH7 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2761husNiw3snxdgZPAGJm;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f2759KYHag8HRDlnO3X9zmZ;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f2760TCyPEKSzIyweCN5yp1;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2761husNiw3snxdgZPAGJm && !this.f2758IPyIQcaNa8aB7drBED) || (drawable == this.f2759KYHag8HRDlnO3X9zmZ && this.f2763pbVGzGjWvY2LDXC8vo) || ((drawable == this.f2760TCyPEKSzIyweCN5yp1 && this.f2758IPyIQcaNa8aB7drBED) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
